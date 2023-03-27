package presentation.view.product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ProductView extends JFrame {

    JButton EditProductButton;
    JButton AddProductButton;
    JButton DeleteProductButton;
    JButton ViewAllProductButton;
    JButton BackMeniuButton;

    public ProductView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 500, 450);
        this.getContentPane().setLayout(null);

        JLabel Product = new JLabel("PRODUCT");
        Product.setFont(new Font("Tahoma", Font.BOLD, 20));
        Product.setBounds(180, 23, 113, 37);
        this.getContentPane().add(Product);

        AddProductButton = new JButton("ADD PRODUCT");
        AddProductButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        AddProductButton.setBounds(34, 103, 190, 91);
        this.getContentPane().add(AddProductButton);

        EditProductButton = new JButton("EDIT PRODUCT");
        EditProductButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        EditProductButton.setBounds(33, 238, 190, 88);
        this.getContentPane().add(EditProductButton);

        DeleteProductButton = new JButton("DELETE PRODUCT");
        DeleteProductButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        DeleteProductButton.setBounds(283, 103, 190, 88);
        this.getContentPane().add(DeleteProductButton);

        ViewAllProductButton = new JButton("VIEW ALL");
        ViewAllProductButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        ViewAllProductButton.setBounds(283, 237, 190, 87);
        this.getContentPane().add(ViewAllProductButton);

        BackMeniuButton = new JButton("BACK TO MENIU");
        BackMeniuButton.setBounds(191, 354, 150, 23);
        this.getContentPane().add(BackMeniuButton);

    }

    public void addProductListener(ActionListener action){
        AddProductButton.addActionListener(action);
    }

    public void EditProductListener(ActionListener action){
        EditProductButton.addActionListener(action);
    }

    public void DeleteProductListener(ActionListener action){
        DeleteProductButton.addActionListener(action);
    }

    public void ViewAllProductListener(ActionListener action){
        ViewAllProductButton.addActionListener(action);
    }

    public void BackMeniuListener(ActionListener action){
        BackMeniuButton.addActionListener(action);
    }
}
