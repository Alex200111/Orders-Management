package presentation.view.client;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class ViewAllView extends JFrame {

    JButton BackButton;

    public ViewAllView() {
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setBounds(100, 100, 500, 350);
        this.setLayout(null);

        JLabel ViewAllLabel = new JLabel("LISTA CLIENTI");
        ViewAllLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
        ViewAllLabel.setBounds(168, 11, 184, 33);
        this.add(ViewAllLabel);

        JPanel panel = new JPanel();
        panel.setBounds(70, 55, 359, 209);
        this.add(panel);

        BackButton = new JButton("BACK");
        BackButton.setBounds(197, 277, 89, 23);
        this.add(BackButton);

        this.setVisible(true);
    }

    public void BackListener(ActionListener action){
        BackButton.addActionListener(action);
    }

}
