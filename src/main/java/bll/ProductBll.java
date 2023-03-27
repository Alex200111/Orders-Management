package bll;

import dao.ClientDao;
import dao.ProductDao;
import model.Client;
import model.Product;

import javax.swing.*;
import java.util.List;

public class ProductBll {



    public static List<Product> viewAllProduct(){
        ProductDao<Product> productDao=new ProductDao<>(Product.class);
        return productDao.findAll();
    }

    public static void addProduct(Product client){
        ProductDao<Product> productDao=new ProductDao<>(Product.class);
        productDao.insert(client);
    }

    public static void deleteProduct(int id){
        ProductDao<Product> productDao=new ProductDao<>(Product.class);
        productDao.deleteT(id);
    }

    public static void updateProduct(Product product,int id){
        ProductDao<Product> productDao=new  ProductDao<>(Product.class);
        productDao.update(product,id);
    }

    public static JTable creareTabel(List<Product> products){
        ProductDao<Product> productDao=new  ProductDao<>(Product.class);
        return productDao.createTable(products);
    }
}
