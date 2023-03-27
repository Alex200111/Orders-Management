package presentation.view.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class DeleteClientView extends JFrame {

    private JTextField IdField;

    JButton DeleteButton;
    JButton BackButton;

    public DeleteClientView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        this.setLayout(null);

        JLabel DeleteLabel = new JLabel("DELETE CLIENT");
        DeleteLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        DeleteLabel.setBounds(119, 11, 173, 42);
        this.add(DeleteLabel);

        JLabel IdLabel = new JLabel("INTRODUCE ID CLIENT:");
        IdLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        IdLabel.setBounds(38, 80, 211, 22);
        this.add(IdLabel);

        IdField = new JTextField();
        IdField.setBounds(283, 84, 86, 20);
        this.add(IdField);
        IdField.setColumns(10);

        DeleteButton = new JButton("CONFIRMA STERGEREA");
        DeleteButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        DeleteButton.setBounds(86, 159, 250, 42);
        this.add(DeleteButton);

        BackButton = new JButton("BACK");
        BackButton.setBounds(173, 227, 89, 23);
        this.add(BackButton);

        this.setVisible(true);
    }

    public String getIdField() {
        return IdField.getText();
    }

    public void setIdField(String idField) {
        this.IdField.setText(idField);
    }

    public void DeleteListener(ActionListener action){
        DeleteButton.addActionListener(action);
    }

    public void BackListener(ActionListener action){
        BackButton.addActionListener(action);
    }
}
