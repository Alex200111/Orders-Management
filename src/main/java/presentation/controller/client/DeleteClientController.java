package presentation.controller.client;

import bll.ClientBll;
import presentation.view.client.DeleteClientView;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class DeleteClientController {

    private DeleteClientView view;

    public DeleteClientController(DeleteClientView view){
        this.view=view;
        this.view.DeleteListener(new DeleteListener());
        this.view.BackListener(new BackListener());
    }

    class DeleteListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            int id= Integer.parseInt(view.getIdField());

            ClientBll.deleteClient(id);
        }
    }
    class BackListener implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e){
            view.dispose();
        }
    }
}
