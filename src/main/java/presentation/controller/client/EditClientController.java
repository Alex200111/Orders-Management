package presentation.controller.client;

import bll.ClientBll;
import model.Client;
import presentation.view.client.EditClientView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EditClientController {
    private EditClientView view;

    public EditClientController(EditClientView view){
        this.view=view;
        this.view.EditareListener(new EditareListener());
    }

    class EditareListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            int id=Integer.parseInt(view.getIdField());
            String name=view.getNameField();
            String email=view.getEmailField();
            String phone=view.getPhoneField();

            Client client=new Client(id,name,email,phone);
            ClientBll.updateClient(client,id);
        }
    }
}
