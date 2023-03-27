package presentation.view.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class AddClientView extends JFrame {

    private JTextField NameField;
    private JTextField EmailField;
    private JTextField NumberField;

    JButton AddClientButton = new JButton("ADD CLIENT");
    JButton BackButton = new JButton("BACK");

    public AddClientView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        this.getContentPane().setLayout(null);

        JLabel AddNewClient = new JLabel("ADD NEW CLIENT");
        AddNewClient.setFont(new Font("Tahoma", Font.BOLD, 20));
        AddNewClient.setBounds(105, 11, 203, 38);
        this.getContentPane().add(AddNewClient);

        NameField = new JTextField();
        NameField.setBounds(63, 60, 154, 20);
        this.add(NameField);
        NameField.setColumns(10);

        JLabel NameLabel = new JLabel("NAME");
        NameLabel.setBounds(10, 63, 55, 14);
        this.getContentPane().add(NameLabel);

        JLabel EmailLabel = new JLabel("EMAIL");
        EmailLabel.setBounds(10, 104, 46, 14);
        this.getContentPane().add(EmailLabel);

        EmailField = new JTextField();
        EmailField.setBounds(63, 101, 154, 20);
        this.add(EmailField);
        EmailField.setColumns(10);

        JLabel PhoneLabel = new JLabel("PHONE");
        PhoneLabel.setBounds(10, 146, 46, 14);
        this.getContentPane().add(PhoneLabel);

        NumberField = new JTextField();
        NumberField.setBounds(63, 143, 154, 20);
        this.add(NumberField);
        NumberField.setColumns(10);

        AddClientButton = new JButton("ADD CLIENT");
        AddClientButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        AddClientButton.setBounds(160, 189, 148, 23);
        this.getContentPane().add(AddClientButton);
        this.add(AddClientButton);

        BackButton = new JButton("BACK");
        BackButton.setBounds(191, 223, 89, 23);
        this.getContentPane().add(BackButton);
        this.add(BackButton);

        this.setVisible(true);
    }

    public String getNameField() {
        return NameField.getText();
    }

    public void setNameField(String nameField) {
        this.NameField.setText(nameField);
    }

    public String getEmailField() {
        return EmailField.getText();
    }

    public void setEmailField(String emailField) {
        this.EmailField.setText(emailField);
    }

    public String getNumberField() {
        return NumberField.getText();
    }

    public void setNumberField( String numberField) {
        this.NumberField.setText(numberField);
    }

    public void addClientListener(ActionListener action){
        AddClientButton.addActionListener(action);
    }

    public void BackListener(ActionListener action){
        BackButton.addActionListener(action);
    }
}
