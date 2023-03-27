package presentation.view.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class EditClientView extends JFrame {

    private JTextField NameField;
    private JTextField EmailField;
    private JTextField PhoneField;
    private JTextField IdField;

    JButton ConfirmButton;


    public EditClientView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 510, 450);
        this.getContentPane().setLayout(null);

        JLabel TitleLabel = new JLabel("EDIT CLIENT");
        TitleLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        TitleLabel.setBounds(167, 11, 159, 56);
        this.add(TitleLabel);

        JLabel NameLabel = new JLabel("NAME");
        NameLabel.setBounds(44, 155, 46, 14);
        this.add(NameLabel);

        NameField = new JTextField();
        NameField.setBounds(100, 152, 177, 20);
        this.add(NameField);
        NameField.setColumns(10);

        JLabel EmailLabel = new JLabel("EMAIL");
        EmailLabel.setBounds(44, 207, 46, 14);
        this.add(EmailLabel);

        EmailField = new JTextField();
        EmailField.setBounds(100, 204, 177, 20);
        this.add(EmailField);
        EmailField.setColumns(10);

        JLabel lblNewLabel = new JLabel("PHONE");
        lblNewLabel.setBounds(44, 253, 46, 14);
        this.add(lblNewLabel);

        PhoneField = new JTextField();
        PhoneField.setBounds(100, 250, 177, 20);
        this.add(PhoneField);
        PhoneField.setColumns(10);

        ConfirmButton = new JButton("CONFIRM");
        ConfirmButton.setBounds(195, 325, 89, 23);
        this.add(ConfirmButton);

        JLabel IdLabel = new JLabel("ID");
        IdLabel.setBounds(44, 103, 46, 14);
        this.add(IdLabel);

        IdField = new JTextField();
        IdField.setBounds(100, 100, 177, 20);
        this.add(IdField);
        IdField.setColumns(10);

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

    public String getPhoneField() {
        return PhoneField.getText();
    }

    public void setPhoneField( String numberField) {
        this.PhoneField.setText(numberField);
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
