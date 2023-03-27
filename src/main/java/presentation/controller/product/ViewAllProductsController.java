package presentation.controller.product;

import presentation.controller.client.ViewAllController;
import presentation.view.product.ViewAllProductsView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ViewAllProductsController {

    private ViewAllProductsView view;

    public ViewAllProductsController(ViewAllProductsView view){
        this.view=view;
        this.view.BackListener(new BackListener());
    }

    class BackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            view.dispose();
        }
    }
}
