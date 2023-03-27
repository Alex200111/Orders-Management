package bll;

import dao.ClientDao;
import dao.OrderDao;
import model.Client;
import model.Order;

public class OrderBll {

    public static void addOrder(Order order){
        OrderDao<Order> orderDao=new OrderDao<>(Order.class);
        orderDao.insert(order);
    }
}
