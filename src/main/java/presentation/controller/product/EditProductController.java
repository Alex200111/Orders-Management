package presentation.controller.product;

import bll.ClientBll;
import bll.ProductBll;
import model.Product;
import presentation.controller.client.EditClientController;
import presentation.view.product.EditProductView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditProductController {

    private EditProductView view;

    public EditProductController(EditProductView view){
        this.view=view;
        this.view.EditareListener(new EditareProdusListener());
    }

    class EditareProdusListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            int id=Integer.parseInt(view.getIdField());
            String name=view.getNameField();
            int price=Integer.parseInt(view.getPriceField());

            Product product=new Product(id,name,price);
            ProductBll.updateProduct(product,id);
        }
    }
}
