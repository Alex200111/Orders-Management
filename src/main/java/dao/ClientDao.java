package dao;

public class ClientDao<T> extends AbstractDao{
    public ClientDao(Class<T> type){
        super(type);
    }
}
