import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI implements ActionListener {

    int count = 0;
    private JLabel label;
    private JFrame frame;
    private JPanel panel;


    // new constructor
    public GUI() {
        // make the window
        frame = new JFrame();

        JButton addButton = new JButton("Add");
        addButton.addActionListener(this);

        label = new JLabel("Num of People: 0");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0, 1));

        panel.add(label);
        panel.add(addButton);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("Counter");
        frame.pack(); // match a certain size
        frame.setVisible(true);
    }

    // main function
    public static void main(String[] args) {

        new GUI();
    }

    @Override
    public void actionPerformed(ActionEvent e) { // on click
        count++;
        label.setText("Num of People: " + count);
    }
}
