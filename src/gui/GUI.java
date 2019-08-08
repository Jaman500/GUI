/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

/**
 *
 * @author jasonfujii
 */
import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
public class GUI {
//hope this works
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //initializes the frame
        JFrame frame = new JFrame("frame");
        //initialize some text fields and add them to the gui
        JTextField tField = new JTextField("Text Field 1", 10);
        frame.add(tField);
        //initialize and add some new buttons
        JButton button = new JButton("Button 1");
        frame.add(button);
        //sets the frame visible
        frame.setVisible(true);
        //sizing and setting the location of the frame
        //.pack() makes the frame the size we set it to. Without it, setPreferredSize() does nothing
        frame.setPreferredSize(new Dimension(600,600));
        frame.pack();
        frame.setLocationRelativeTo(null);
        //when exiting the frame, setDefault() closes the IDE's run fucntion
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}
