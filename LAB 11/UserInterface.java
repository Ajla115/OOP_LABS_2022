package FinalExamPrep.GUI;

import javax.swing.*;
import java.awt.*;

public class UserInterface implements Runnable{
    private JFrame frame;
    @Override
    public void run() {
        JFrame frame = new JFrame("Swing on!");
        frame.setPreferredSize(new Dimension(400, 200));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);


    }
    public JFrame getFrame(){
        return this.frame;
    }

    private void createComponents(Container contentPane) {
        JLabel text = new JLabel("Hi!");
        contentPane.add(text);

    }
}
