package start;

import presentation.controller.MainController;
import presentation.view.MainView;
import presentation.view.client.*;
import presentation.view.order.OrderView;
import presentation.view.product.*;

public class Main {
    public static void main(String[] args) {
        MainView view=new MainView();
        ClientView clientView= new ClientView();
        ProductView productView=new ProductView();
        OrderView orderView=new OrderView();
        MainController mainController=new MainController(view,clientView,productView,orderView);
    }
}
