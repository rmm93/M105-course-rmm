package FinalPractice;


import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Joulian extends JApplet implements ActionListener{

    JLabel label, result;

    JTextField name;

    JButton button;

public void init(){

    label = new JLabel("The word ");

    name = new JTextField(20);

    result= new JLabel("The length of the word is 0");

    button = new JButton("Click");

    setLayout(new FlowLayout());

    add(label); add(name); add(button); add (result);

    // part 3.2
    button.addActionListener(this);
    // part 3.4

}

public void actionPerformed(ActionEvent e) {
    // Part 3.1 
    String n= name.getText();
    result.setText("The length of the word is "+n.length());
}


private class MyKey extends KeyAdapter {

        public void keyPressed(KeyEvent e) {

        // part 3.3 
            if(e.getKeyCode()== KeyEvent.VK_DELETE){
                name.setText("");
                result.setText("The length of the word is 0");
            }//if
        }

    }
}