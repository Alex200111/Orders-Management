package presentation.controller.product;

import bll.ClientBll;
import bll.ProductBll;
import model.Client;
import model.Product;
import presentation.controller.client.*;
import presentation.view.MainView;
import presentation.view.client.*;
import presentation.view.product.*;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ProductController {

    ProductView view;
    private MainView mainView;

    public ProductController(ProductView view, MainView mainView){
        this.view=view;
        this.mainView=mainView;
        this.view.addProductListener(new AddProductListener());
        this.view.EditProductListener(new EditProductListener());
        this.view.DeleteProductListener(new DeleteProductListener());
        this.view.ViewAllProductListener(new ViewAllProductListener());
        this.view.BackMeniuListener(new BackManiuListener());
    }

    class AddProductListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            AddProductView productView =new AddProductView();
            AddProductController productController=new AddProductController(productView);

        }
    }

    class EditProductListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            EditProductView editProductView=new EditProductView();
            EditProductController editProductController=new EditProductController(editProductView);
        }
    }

    class DeleteProductListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            DeleteProductView deleteProductView=new DeleteProductView();
            DeleteProductController deleteProductController=new DeleteProductController(deleteProductView);
        }
    }

    class ViewAllProductListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            ViewAllProductsView viewAllProductsView=new ViewAllProductsView();
            try {
                ViewAllProductsController viewAllProductsController= new ViewAllProductsController(viewAllProductsView);
                List<Product> products= ProductBll.viewAllProduct();
                JTable table=ProductBll.creareTabel(products);
                viewAllProductsView.setContentPane(table);
            } catch (Exception ex) {
                ex.printStackTrace();
            }
        }
    }

    class BackManiuListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
            mainView.setVisible(true);
        }
    }

}
