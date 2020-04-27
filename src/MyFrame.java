import javax.swing.JFrame;

import java.awt.FlowLayout;

import javax.swing.JButton;

public class MyFrame extends JFrame {

    public MyFrame() {
        super("Hello World");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout());

        setSize(300, 100);
        setLocation(50,50);

        add(new JButton("Przycisk 1"));
        add(new JButton("Przycisk 2"));
        add(new JButton("Przycisk 3"));


        setVisible(true);
    }
}