package il.ac.shenkar.gui;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 4/29/14
 * Time: 10:16 PM
 * To change this template use File | Settings | File Templates.
 */

public class SimpleGuiDemo
{
    private JFrame mainFrame;
    private JButton button;
    private JLabel label;
    private JTextField textField;
    private JComboBox greetingSpinner;

    private final String[] greetings = {"Hello", "Good Morning", "Good Day", "Good bay"};

    public SimpleGuiDemo()
    {
        mainFrame = new JFrame("My Frame");
        button = new JButton("Click me!");
        label = new JLabel();
        textField = new JTextField(10);
        greetingSpinner = new JComboBox(greetings);
    }

    public void buildUI()
    {

        mainFrame.setLayout(new FlowLayout());

        mainFrame.add(greetingSpinner);
        mainFrame.add(textField);
        mainFrame.add(button);
        mainFrame.add(label);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String name = textField.getText();
                label.setText(greetingSpinner.getSelectedItem() + " " + name);
            }
        });

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static void main (String[] args)
    {
        Runnable runnable = new Runnable()
        {
            @Override
            public void run()
            {
                SimpleGuiDemo classExample = new SimpleGuiDemo();
                classExample.buildUI();
            }
        };
        SwingUtilities.invokeLater(runnable);
    }
}
