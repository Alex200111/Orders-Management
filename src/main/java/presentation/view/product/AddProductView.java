package presentation.view.product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddProductView extends JFrame {

    private JTextField ProductNameField;
    private JTextField PriceField;

    JButton AddNewProductButton;
    JButton BackProductButton;

    public AddProductView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 300);
        this.setLayout(null);

        JLabel lblNewLabel = new JLabel("ADD NEW PRODUCT");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(128, 11, 257, 33);
        this.add(lblNewLabel);

        JLabel NameLabel = new JLabel("NAME");
        NameLabel.setFont(new Font("Tahoma", Font.PLAIN, 11));
        NameLabel.setBounds(10, 73, 46, 14);
        this.add(NameLabel);

        ProductNameField = new JTextField();
        ProductNameField.setBounds(78, 70, 193, 20);
        this.add(ProductNameField);
        ProductNameField.setColumns(10);

        JLabel PriceLabel = new JLabel("PRICE");
        PriceLabel.setBounds(10, 124, 46, 14);
        this.add(PriceLabel);

        PriceField = new JTextField();
        PriceField.setBounds(78, 121, 193, 20);
        this.add(PriceField);
        PriceField.setColumns(10);

        AddNewProductButton = new JButton("ADD NEW PRODUCT");
        AddNewProductButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        AddNewProductButton.setBounds(141, 174, 221, 23);
        this.add(AddNewProductButton);

        BackProductButton = new JButton("BACK");
        BackProductButton.setBounds(206, 208, 89, 23);
        this.add(BackProductButton);

        this.setVisible(true);
    }

    public String getProductNameField() {
        return ProductNameField.getText();
    }

    public void setProductNameField(String productNameField) {
        this.ProductNameField.setText(productNameField);
    }

    public String getPriceField() {
        return PriceField.getText();
    }

    public void setPriceField(String priceField) {
        this.PriceField.setText(priceField);
    }

    public void addProductListener(ActionListener action){
        AddNewProductButton.addActionListener(action);
    }

    public void BackListener(ActionListener action){
        BackProductButton.addActionListener(action);
    }

}
