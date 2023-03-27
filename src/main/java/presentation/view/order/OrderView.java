package presentation.view.order;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class OrderView extends JFrame {

    private JTextField QuantityField;
    private JTextField IdField;
    private JTextField IdClientField;

    JButton CreatOrderButton;
    JButton BackMeniuButton;

    public OrderView() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        this.setLayout(null);

        JLabel lblNewLabel = new JLabel("CREATE ORDER");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        lblNewLabel.setBounds(118, 11, 173, 31);
        this.add(lblNewLabel);

        JLabel lblNewLabel_1 = new JLabel("ID CLIENT");
        lblNewLabel_1.setBounds(10, 78, 74, 14);
        this.add(lblNewLabel_1);

        JLabel lblNewLabel_2 = new JLabel("ID PORODUCT");
        lblNewLabel_2.setBounds(10, 114, 90, 14);
        this.add(lblNewLabel_2);

        JLabel lblNewLabel_3 = new JLabel("QUANTITY");
        lblNewLabel_3.setBounds(10, 155, 74, 14);
        this.add(lblNewLabel_3);

        QuantityField = new JTextField();
        QuantityField.setBounds(133, 149, 173, 20);
        this.add(QuantityField);
        QuantityField.setColumns(10);

        CreatOrderButton = new JButton("CREATE ORDER");
        CreatOrderButton.setBounds(133, 190, 158, 23);
        this.add(CreatOrderButton);

        BackMeniuButton = new JButton("BACK MENIU");
        BackMeniuButton.setBounds(168, 227, 105, 23);
        this.add(BackMeniuButton);

        IdClientField = new JTextField();
        IdClientField.setBounds(133, 75, 86, 20);
        this.add(IdClientField);
        IdClientField.setColumns(10);

        IdField = new JTextField();
        IdField.setBounds(133, 111, 86, 20);
        this.add(IdField);
        IdField.setColumns(10);
    }

    public String getQuantityField() {
        return QuantityField.getText();
    }

    public void setQuantityField(String quantityField) {
        this.QuantityField.setText(quantityField);
    }

    public String getIdField() {
        return IdField.getText();
    }

    public void setIdField(String idField) {
        this.IdField.setText(idField);
    }

    public String getIdClientField() {
        return IdClientField.getText();
    }

    public void setIdClientField(String idClientField) {
        this.IdClientField.setText(idClientField);
    }

    public void addOrderListener(ActionListener action){
        CreatOrderButton.addActionListener(action);
    }

    public void BackMeniuListener(ActionListener action){
        BackMeniuButton.addActionListener(action);
    }
}
