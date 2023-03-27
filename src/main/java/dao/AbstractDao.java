package dao;

import java.beans.IntrospectionException;
import java.beans.PropertyDescriptor;
import java.lang.reflect.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

import connection.ConnectionFactory;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;


public abstract class AbstractDao<T> {
    protected static final Logger LOGGER = Logger.getLogger(AbstractDao.class.getName());

    private final Class<T> type;

    @SuppressWarnings("unchecked")
    public AbstractDao(Class<T> type) {
       // this.type = (Class<T>) ((ParameterizedType) getClass().getGenericSuperclass()).getActualTypeArguments()[0];
        this.type= type;
    }

    private String createSelectQuery(String field) {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" * ");
        sb.append(" FROM ");
        sb.append(type.getSimpleName());
        sb.append(" WHERE " + field + " =?");
        return sb.toString();
    }

    private String createSelectQueryAll() {
        StringBuilder sb = new StringBuilder();
        sb.append("SELECT ");
        sb.append(" * ");
        sb.append(" FROM ");
        sb.append("`" + type.getSimpleName()+"`");
        return sb.toString();
    }

    private String createDeleteQuery(int field) {
        StringBuilder sb = new StringBuilder();
        sb.append("DELETE");
        sb.append(" FROM ");
        sb.append(type.getSimpleName());
        sb.append(" WHERE id="+ field);
        System.out.println(sb);
        return sb.toString();
    }

    private String createAddQuery(T object)  {
        StringBuilder sb = new StringBuilder();
        sb.append("INSERT INTO `");
        sb.append(type.getSimpleName());
        sb.append("` VALUES (");
        try {
            for (Field field : object.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (field.get(object) instanceof Integer) {
                    sb.append(field.get(object));
                    sb.append(",");
                } else {
                    sb.append("'");
                    sb.append(field.get(object));
                    sb.append("',");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(");");
        System.out.println(sb);
        return sb.toString();
    }

    private String createUpdateQuery(T object, int id)  {
        StringBuilder sb = new StringBuilder();
        sb.append("UPDATE ");
        sb.append(type.getSimpleName());
        sb.append(" SET ");
        try {
            for (Field field : object.getClass().getDeclaredFields()) {
                field.setAccessible(true);
                if (field.get(object) instanceof Integer) {
                    sb.append(field.getName());
                    sb.append("=");
                    sb.append(field.get(object));
                    sb.append(",");
                } else {
                    sb.append(field.getName());
                    sb.append("=");
                    sb.append("'");
                    sb.append(field.get(object));
                    sb.append("',");
                }
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        sb.deleteCharAt(sb.length()-1);
        sb.append(" WHERE id="+id);
        System.out.println(sb);
        return sb.toString();
    }

    public List<T> findAll() {
        // TODO:
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createSelectQueryAll();
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            resultSet = statement.executeQuery();

            return createObjects(resultSet);
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, type.getName() + "DAO:findAll " + e.getMessage());
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return null;
    }

    public T findById(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        String query = createSelectQuery("id");
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.setInt(1, id);
            resultSet = statement.executeQuery();

            System.out.println(resultSet);

            return createObjects(resultSet).get(0);
        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, type.getName() + "DAO:findById " + e.getMessage());
        } finally {
            ConnectionFactory.close(resultSet);
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return null;
    }

    public void deleteT(int id) {
        Connection connection = null;
        PreparedStatement statement = null;
        String query = createDeleteQuery(id);
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.executeUpdate();


        } catch (SQLException e) {
            LOGGER.log(Level.WARNING, type.getName() + "DAO:deletT " + e.getMessage());
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }

    }

    private List<T> createObjects(ResultSet resultSet) {
        List<T> list = new ArrayList<T>();
        Constructor[] ctors = type.getDeclaredConstructors();
        Constructor ctor = null;
        for (int i = 0; i < ctors.length; i++) {
            ctor = ctors[i];
            if (ctor.getGenericParameterTypes().length == 0)
                break;
        }
        try {
            while (resultSet.next()) {
                ctor.setAccessible(true);
                T instance = (T)ctor.newInstance();
                for (Field field : type.getDeclaredFields()) {
                    String fieldName = field.getName();
                    Object value = resultSet.getObject(fieldName);
                    PropertyDescriptor propertyDescriptor = new PropertyDescriptor(fieldName, type);
                    Method method = propertyDescriptor.getWriteMethod();
                    method.invoke(instance, value);
                }
                list.add(instance);
            }
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (SecurityException e) {
            e.printStackTrace();
        } catch (IllegalArgumentException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        } catch (IntrospectionException e) {
            e.printStackTrace();
        }
        return list;
    }

    public T insert(T t) {
        // TODO:
        Connection connection = null;
        PreparedStatement  statement = null;
        String query = createAddQuery(t);
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch(SQLException e) {
            LOGGER.log(Level.WARNING, type.getName() + "DAO:insert " + e.getMessage());
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return t;
    }

    public T update(T t,int id) {
        // TODO:
        Connection connection = null;
        PreparedStatement  statement = null;
        String query = createUpdateQuery(t,id);
        try {
            connection = ConnectionFactory.getConnection();
            statement = connection.prepareStatement(query);
            statement.executeUpdate();
        } catch(SQLException e) {
            LOGGER.log(Level.WARNING, type.getName() + "DAO:update " + e.getMessage());
        } finally {
            ConnectionFactory.close(statement);
            ConnectionFactory.close(connection);
        }
        return t;
    }

    public JTable createTable(List<T> list) {
        ArrayList<String> columnNames = new ArrayList<String>();
        int fields = 0;
        for (Field i : list.get(0).getClass().getDeclaredFields()) {
            i.setAccessible(true);
            columnNames.add(i.getName());
            fields++;
        }
        Object[][] data = new Object[list.size()][fields];
        for (int i = 0; i < list.size(); i++) {
            int j = 0;
            for (Field field : list.get(i).getClass().getDeclaredFields()) {
                try {
                    field.setAccessible(true);
                    data[i][j] = field.get(list.get(i));
                    j++;
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
        DefaultTableModel tmodel = new DefaultTableModel(data, columnNames.toArray());
        JTable table = new JTable(tmodel);
        table.getTableHeader();
        System.out.println(table.getTableHeader());
        return table;
    }

}
