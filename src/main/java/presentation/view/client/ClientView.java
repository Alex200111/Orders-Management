package presentation.view.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ClientView extends JFrame{

    JButton AddClientButton;
    JButton EditClientButton;
    JButton DeleteClient;
    JButton ViewAllButton;
    JButton BackMeniuButton;

    public ClientView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 450);
        this.getContentPane().setLayout(null);

        JLabel Client = new JLabel("CLIENT");
        Client.setFont(new Font("Tahoma", Font.BOLD, 20));
        Client.setBounds(180, 23, 113, 37);
        this.getContentPane().add(Client);

        AddClientButton = new JButton("ADD CLIENT");
        AddClientButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        AddClientButton.setBounds(34, 103, 163, 91);
        this.getContentPane().add(AddClientButton);

        EditClientButton = new JButton("EDIT CLIENT");
        EditClientButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        EditClientButton.setBounds(33, 238, 168, 88);
        this.getContentPane().add(EditClientButton);

        DeleteClient = new JButton("DELETE CLIENT");
        DeleteClient.setFont(new Font("Tahoma", Font.PLAIN, 18));
        DeleteClient.setBounds(287, 103, 177, 88);
        this.getContentPane().add(DeleteClient);

        ViewAllButton = new JButton("VIEW ALL");
        ViewAllButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        ViewAllButton.setBounds(283, 237, 171, 87);
        this.getContentPane().add(ViewAllButton);

        BackMeniuButton = new JButton("BACK TO MENIU");
        BackMeniuButton.setBounds(180, 354, 130, 23);
        this.getContentPane().add(BackMeniuButton);

    }

    public void addClientListener(ActionListener action){
        AddClientButton.addActionListener(action);
    }

    public void EditClientListener(ActionListener action){
        EditClientButton.addActionListener(action);
    }
    public void DeleteClientListener(ActionListener action){
        DeleteClient.addActionListener(action);
    }

    public void ViewAllListener(ActionListener action){
        ViewAllButton.addActionListener(action);
    }

    public void BackMeniuListener(ActionListener action){
        BackMeniuButton.addActionListener(action);
    }
}
