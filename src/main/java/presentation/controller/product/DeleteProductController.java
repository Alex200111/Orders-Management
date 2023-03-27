package presentation.controller.product;

import bll.ClientBll;
import bll.ProductBll;
import presentation.view.product.DeleteProductView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DeleteProductController {

    private DeleteProductView view;

    public DeleteProductController(DeleteProductView view){
        this.view=view;
        this.view.DeleteListener(new DeleteProductListener());
        this.view.BackListener(new BackListener());
    }

    class DeleteProductListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            int id= Integer.parseInt(view.getIdField());

            ProductBll.deleteProduct(id);
        }
    }

    class BackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            view.dispose();
        }
    }
}
