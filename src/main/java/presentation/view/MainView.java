package presentation.view;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class MainView extends JFrame {

    JButton ClientButton;
    JButton ProdusButton;
    JButton OrderButton;

    public MainView() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setBounds(100, 100, 450, 450);
        this.getContentPane().setLayout(null);

        JLabel Meniu = new JLabel("MENIU PRINCIPAL");
        Meniu.setFont(new Font("Tahoma", Font.BOLD, 20));
        Meniu.setBounds(115, 11, 212, 61);
        this.getContentPane().add(Meniu);

        ClientButton = new JButton("CLIENT");
        ClientButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        ClientButton.setBounds(125, 114, 159, 31);
        this.getContentPane().add(ClientButton);
        this.add(ClientButton);

        ProdusButton = new JButton("PRODUCT");
        ProdusButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        ProdusButton.setBounds(125, 195, 159, 31);
        this.getContentPane().add(ProdusButton);
        this.add(ProdusButton);

        OrderButton = new JButton("ORDERS");
        OrderButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        OrderButton.setBounds(125, 295, 159, 31);
        this.getContentPane().add(OrderButton);
        this.add(OrderButton);

        this.setVisible(true);
    }

    public void addClientListener(ActionListener action){
        ClientButton.addActionListener(action);
    }

    public void OrderListener(ActionListener action){
        OrderButton.addActionListener(action);
    }
    public void ProdusListener(ActionListener action){
        ProdusButton.addActionListener(action);
    }


}
