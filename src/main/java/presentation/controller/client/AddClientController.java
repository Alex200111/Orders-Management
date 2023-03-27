package presentation.controller.client;

import bll.ClientBll;
import model.Client;
import presentation.view.client.AddClientView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AddClientController {

    private AddClientView view;

    public AddClientController(AddClientView view){
        this.view=view;
        this.view.addClientListener(new AddClientListener());
        this.view.BackListener(new BackListener());

    }

    class AddClientListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            String name=view.getNameField();
            String email=view.getEmailField();
            String number=view.getNumberField();

            Client client=new Client(name,email,number);
            ClientBll.addClient(client);
            System.out.println("Am scris "+ name+" "+email+" "+number);
        }
    }

    class BackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            view.dispose();
        }
    }
}
