package presentation.view.product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class EditProductView extends JFrame {


    private JTextField IdField;
    private JTextField NameField;
    private JTextField PriceField;

    JButton ConfirmButton;


    public EditProductView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 510, 450);
        this.setLayout(null);

        JLabel TitleLabel = new JLabel("EDIT PRODUCT");
        TitleLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        TitleLabel.setBounds(167, 11, 159, 56);
        this.add(TitleLabel);

        JLabel NameLabel = new JLabel("NAME");
        NameLabel.setBounds(44, 155, 46, 14);
        this.add(NameLabel);


        ConfirmButton = new JButton("CONFIRM");
        ConfirmButton.setBounds(195, 325, 89, 23);
        this.add(ConfirmButton);

        JLabel IdLabel = new JLabel("ID");
        IdLabel.setBounds(44, 103, 46, 14);
        this.add(IdLabel);

        IdField = new JTextField();
        IdField.setBounds(100, 100, 209, 20);
        this.add(IdField);
        IdField.setColumns(10);

        NameField = new JTextField();
        NameField.setBounds(100, 152, 209, 20);
        this.add(NameField);
        NameField.setColumns(10);

        JLabel PriceLabel = new JLabel("PRICE");
        PriceLabel.setBounds(44, 217, 46, 14);
        this.add(PriceLabel);

        PriceField= new JTextField();
        PriceField.setBounds(100, 214, 209, 20);
        this.add(PriceField);
        PriceField.setColumns(10);

        this.setVisible(true);
    }
    public String getNameField() {
        return NameField.getText();
    }

    public void setNameField(String nameField) {
        this.NameField.setText(nameField);
    }

    public String getPriceField() {
        return PriceField.getText();
    }

    public void setPriceField(String priceField) {
        this.PriceField.setText(priceField);
    }

    public String getIdField() {
        return IdField.getText();
    }

    public void setIdField( String idField) {

        this.IdField.setText(idField);
    }

    public void EditareListener(ActionListener action){
        ConfirmButton.addActionListener(action);
    }
}
