package dao;


public class ProductDao<T> extends AbstractDao{
    public ProductDao(Class<T> type){
        super(type);
    }
}
