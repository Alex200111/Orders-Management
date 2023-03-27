package dao;

public class OrderDao<T> extends AbstractDao{
    public OrderDao(Class<T> type){
        super(type);
    }
}
