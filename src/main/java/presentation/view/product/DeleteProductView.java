package presentation.view.product;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionListener;

public class DeleteProductView extends JFrame {

    private JTextField IdField;

    JButton DeleteButton;
    JButton BackProdusButton;

    public DeleteProductView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        this.setLayout(null);

        JLabel DeleteLabel = new JLabel("DELETE PRODUCT");
        DeleteLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        DeleteLabel.setBounds(119, 11, 197, 42);
        this.add(DeleteLabel);

        JLabel IdLabel = new JLabel("INTRODUCE ID PRODUS:");
        IdLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
        IdLabel.setBounds(38, 80, 228, 22);
        this.add(IdLabel);


        DeleteButton = new JButton("CONFIRMA STERGEREA");
        DeleteButton.setFont(new Font("Tahoma", Font.PLAIN, 18));
        DeleteButton.setBounds(86, 159, 250, 42);
        this.add(DeleteButton);

        IdField = new JTextField();
        IdField.setBounds(274, 84, 86, 20);
        this.add(IdField);
        IdField.setColumns(10);

        BackProdusButton = new JButton("BACK");
        BackProdusButton.setBounds(177, 215, 89, 23);
        this.add(BackProdusButton);

        this.setVisible(true);
    }

    public String getIdField() {
        return IdField.getText();
    }

    public void setIdField(String  idField) {
        this.IdField.setText(idField);
    }

    public void DeleteListener(ActionListener action){
        DeleteButton.addActionListener(action);
    }

    public void BackListener(ActionListener action){
        BackProdusButton.addActionListener(action);
    }
}
