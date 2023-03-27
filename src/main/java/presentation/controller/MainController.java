package presentation.controller;

import model.Client;
import presentation.controller.client.ClientController;
import presentation.controller.order.OrderController;
import presentation.controller.product.ProductController;
import presentation.view.MainView;
import presentation.view.client.ClientView;
import presentation.view.order.OrderView;
import presentation.view.product.ProductView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainController {

    private MainView view;
    private ClientView clientView;
    private ProductView productView;
    private OrderView orderView;

    public MainController(MainView view, ClientView clientView,ProductView productView,OrderView orderView){
        this.view=view;
        this.clientView=clientView;
        this.productView=productView;
        this.orderView=orderView;
        this.view.addClientListener(new addClientListener());
        this.view.ProdusListener(new ProdusListener());
        this.view.OrderListener(new OrderListener());
    }

    class addClientListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            clientView.setVisible(true);
            ClientController clientController=new ClientController(clientView,view);
        }
    }

    class ProdusListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {

            view.setVisible(false);
            productView.setVisible(true);
            ProductController productController=new ProductController(productView,view);
        }
    }

    class OrderListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.setVisible(false);
            orderView.setVisible(true);
            OrderController orderController=new OrderController(orderView,view);
        }
    }


}
