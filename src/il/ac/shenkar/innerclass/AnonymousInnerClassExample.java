package il.ac.shenkar.innerclass;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created with IntelliJ IDEA.
 * User: Jacob
 * Date: 3/19/14
 * Time: 8:10 AM
 * To change this template use File | Settings | File Templates.
 */
public class AnonymousInnerClassExample
{
    private JFrame mainFrame;
    private JButton button;
    private JLabel label;
    private JTextField textField;

    public AnonymousInnerClassExample()
    {
        mainFrame = new JFrame("My Frame");
        button = new JButton("Click me!");
        label = new JLabel();
        textField = new JTextField(10);
    }

    public void buildUI()
    {

        mainFrame.setLayout(new FlowLayout());

        mainFrame.getContentPane().add(textField);
        mainFrame.getContentPane().add(button);
        mainFrame.getContentPane().add(label);
        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                String name = textField.getText();
                label.setText("hello " + name);
            }
        });

        mainFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        mainFrame.setVisible(true);
        mainFrame.setSize(600, 400);
    }

    public static void main (String[] args)
    {
          Runnable runnable = new Runnable()
          {
              @Override
              public void run()
              {
                  AnonymousInnerClassExample classExample = new AnonymousInnerClassExample();
                  classExample.buildUI();
              }
          };
        SwingUtilities.invokeLater(runnable);
    }
}
