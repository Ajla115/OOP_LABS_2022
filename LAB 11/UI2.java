package FinalExamPrep.GUI;

import javax.swing.*;
import java.awt.*;

public class UI2 implements Runnable{
    private JFrame frame;

    @Override
    public void run() {
        frame = new JFrame("Survey");
        frame.setPreferredSize(new Dimension(200, 300));
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        createComponents(frame.getContentPane());
        frame.pack();
        frame.setVisible(true);

    }

    public JFrame getFrame(){
        return this.frame;
    }


    private void createComponents(Container contentPane) {
        BoxLayout vertically = new BoxLayout(contentPane, BoxLayout.Y_AXIS);
        contentPane.setLayout(vertically);

        JLabel text1 = new JLabel("Are you?");
        JCheckBox button1 = new JCheckBox("Yes!");
        JCheckBox button2 = new JCheckBox("No!");

        ButtonGroup group1 = new ButtonGroup();
        group1.add(button1);
        group1.add(button2);

        JLabel text2 = new JLabel("Why?");
        JRadioButton button3 = new JRadioButton("No reason");
        JRadioButton button4 = new JRadioButton("Because it is fun");

        ButtonGroup group2 = new ButtonGroup();
        group2.add(button3);
        group2.add(button4);

        JButton done = new JButton("Done!");

        contentPane.add(text1);
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(text2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(done);
    }
}
