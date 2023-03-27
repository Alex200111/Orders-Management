package presentation.controller.order;


import bll.OrderBll;
import bll.ProductBll;
import model.Order;
import model.Product;
import presentation.view.MainView;
import presentation.view.order.OrderView;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderController {

    private OrderView view;
    private MainView mainView;

    public OrderController(OrderView view, MainView mainView){
        this.view=view;
        this.mainView=mainView;
        this.view.addOrderListener(new OrderListener());
        this.view.BackMeniuListener(new BackMeniuListener());
    }

    class OrderListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e){
            int idClient=Integer.parseInt(view.getIdClientField());
            int idProduct=Integer.parseInt(view.getIdField());
            int quantity=Integer.parseInt(view.getQuantityField());

            Order order=new Order(idClient,idProduct,quantity,0);
            OrderBll.addOrder(order);
            System.out.println("Am scris "+ idClient+" "+idProduct+" "+quantity);
        }
    }

    class BackMeniuListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            view.dispose();
            mainView.setVisible(true);
        }
    }
}
