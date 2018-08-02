/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalPractice;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.io.*;
/**
 *
 * @author Raoum
 */
public class Q4 extends JFrame{
    private JLabel nameL;
    private JLabel choiceL;
    private JTextField nameT;
    private JRadioButton rbt1;
    private JRadioButton rbt2;
    private JRadioButton rbt3;
    private ButtonGroup itemsG;
    private JPanel p1;
    private JButton btn1;
    private JButton btn2;
    private JButton btn3;
    private JPanel p2;
    
    public Q4(){
        super();
        setSize(300,300);
        Container cn= getContentPane();
        p1= new JPanel(new GridLayout(6,1));
        rbt1= new JRadioButton("Tea");
        rbt2= new JRadioButton("Coffee");
        rbt3= new JRadioButton("Espresso");
        itemsG= new ButtonGroup();
        itemsG.add(rbt1);
        itemsG.add(rbt2);
        itemsG.add(rbt3);
        nameL= new JLabel("Enter your Name: ");
        choiceL= new JLabel("Select your Choice: ");
        nameT= new JTextField();
        p2= new JPanel(new FlowLayout());
        btn1= new JButton("Show"); 
        btn2= new JButton("Save in File"); 
        btn3= new JButton("Exit");
        p1.add(nameL);
        p1.add(nameT);
        p1.add(choiceL);
        p1.add(rbt1);
        p1.add(rbt2);
        p1.add(rbt3);
        p2.add(btn1);
        p2.add(btn2);
        p2.add(btn3);
        cn.add(p1, BorderLayout.NORTH);
        cn.add(p2,BorderLayout.SOUTH);
        ButtonHandler bh= new ButtonHandler();
        btn1.addActionListener(bh);
        btn2.addActionListener(bh);
        btn3.addActionListener(bh);
    }//constructor
    
    private class ButtonHandler implements ActionListener{
        @Override
        public void actionPerformed(ActionEvent e) {
        //Part 2 the actions should be done
            Object obj= e.getSource();
            String chc="", msg="";
            if (rbt1.isSelected()){
                chc= rbt1.getText();
            }//if
            else if (rbt2.isSelected()){
                chc= rbt2.getText();
            }//if
            else if (rbt3.isSelected()){
                chc= rbt3.getText();
            }//if
            msg = "Welcome "+ nameT.getText()+" Your Choice is "+ chc;
            if (obj.equals(btn1)){
                JOptionPane.showMessageDialog(null, msg);
            }//if
            else if (obj.equals(btn2)){
                try{
                    PrintWriter pr= new PrintWriter(new File ("Out.txt"));
                    pr.println(msg);
                    pr.close();
                    JOptionPane.showMessageDialog(null, "Successfully Saved");
                }
                catch(Exception ioe){
                    JOptionPane.showMessageDialog(null, "Error while writing to file");
                }
            }//elseif
            else if (obj.equals(btn3)){
                System.exit(0);
            }//if
        } 
    }
    public static void main (String[] args){
        // Part 4 instantiate the Jframe
        Q4 myFrame= new Q4();
        myFrame.setVisible(true);
    } 
}