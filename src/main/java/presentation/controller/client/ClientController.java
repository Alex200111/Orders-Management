package presentation.controller.client;

import bll.ClientBll;
import model.Client;
import presentation.controller.MainController;
import presentation.view.MainView;
import presentation.view.client.*;
import presentation.view.product.ViewAllProductsView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ClientController {

    private ClientView view;
    private MainView mainView;

    public ClientController(ClientView view,MainView mainView){
        this.view=view;
        this.mainView=mainView;
        this.view.addClientListener(new AddClientListener());
        this.view.EditClientListener(new EditClientListener());
        this.view.DeleteClientListener(new DeleteClientListener());
        this.view.ViewAllListener(new ViewAllListener());
        this.view.BackMeniuListener(new BackManiuListener());
    }

    class AddClientListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            AddClientView clientView =new AddClientView();
            AddClientController addClientController=new AddClientController(clientView);

        }
    }

    class EditClientListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            EditClientView editClientView=new EditClientView();
            EditClientController editClientController=new EditClientController(editClientView);
        }
    }

    class DeleteClientListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            DeleteClientView deleteClientView=new DeleteClientView();
            DeleteClientController deleteClientController=new DeleteClientController(deleteClientView);
        }
    }

    class ViewAllListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
            ViewAllView viewAllView=new ViewAllView();
            try {
                ViewAllController viewAllController= new ViewAllController(viewAllView);
                List<Client> clients= ClientBll.viewAllClient();
                JTable table=ClientBll.creareTabel(clients);
                viewAllView.setContentPane(table);
            } catch (IllegalAccessException ex) {
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
