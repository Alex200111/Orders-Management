package presentation.view.product;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ViewAllProductsView extends JFrame {

    JButton BackProductButton;

    public ViewAllProductsView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 350);
        this.setLayout(null);

        JLabel ViewAllLabel = new JLabel("LISTA PRODUSE");
        ViewAllLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        ViewAllLabel.setBounds(168, 11, 184, 33);
        this.add(ViewAllLabel);

        JPanel panel = new JPanel();
        panel.setBounds(70, 55, 359, 209);
        this.add(panel);

        BackProductButton = new JButton("BACK");
        BackProductButton.setBounds(197, 277, 89, 23);
        this.add(BackProductButton);

        this.setVisible(true);
    }

    public void BackListener(ActionListener action){
        BackProductButton.addActionListener(action);
    }

}
