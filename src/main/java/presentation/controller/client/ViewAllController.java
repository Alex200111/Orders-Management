package presentation.controller.client;

import bll.ClientBll;
import model.Client;
import presentation.view.client.ViewAllView;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class ViewAllController {
    private ViewAllView view;

    public ViewAllController(ViewAllView view) throws IllegalAccessException {
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
