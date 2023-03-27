package presentation.controller.product;

import bll.ClientBll;
import bll.ProductBll;
import model.Client;
import model.Product;
import presentation.controller.client.AddClientController;
import presentation.view.client.AddClientView;
import presentation.view.product.AddProductView;
import presentation.view.product.ProductView;

import javax.imageio.ImageTranscoder;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddProductController {

    private AddProductView view;
    public AddProductController(AddProductView view){
        this.view=view;
        this.view.addProductListener(new AddProductListener());
        this.view.BackListener(new BackListener());

    }

    class AddProductListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            String name=view.getProductNameField();
            int price= Integer.parseInt(view.getPriceField());

            Product product=new Product(name,price);
            ProductBll.addProduct(product);
            System.out.println("Am scris "+ name+" "+price);
        }
    }

    class BackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            view.dispose();
        }
    }
}
