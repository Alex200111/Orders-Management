package bll;

import dao.ClientDao;
import model.Client;

import javax.swing.*;
import java.util.List;

public class ClientBll {

    public static List<Client> viewAllClient(){
        ClientDao<Client> clientDao=new ClientDao<>(Client.class);
        return clientDao.findAll();
    }

    public static void addClient(Client client){
        ClientDao<Client> clientDao=new ClientDao<>(Client.class);
        clientDao.insert(client);
    }

    public static void deleteClient(int id){
        ClientDao<Client> clientDao=new ClientDao<>(Client.class);
        clientDao.deleteT(id);
    }

    public static void updateClient(Client client,int id){
        ClientDao<Client> clientDao=new ClientDao<>(Client.class);
        clientDao.update(client,id);
    }

    public static  JTable creareTabel(List<Client> clients){
        ClientDao<Client> clientDao=new ClientDao<>(Client.class);
        return clientDao.createTable(clients);
    }

}
