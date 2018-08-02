/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raoum
 */

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.*;

public class Unit7_ComponentLis extends JFrame{
    JLabel label, secLabel, result;
    JButton bt,bt1,btt;
    JTextField tf1,tf2; 
    //constructor
    public Unit7_ComponentLis(){
        super();
        setSize(500,600);
        label= new JLabel("Number 1:");
        secLabel= new JLabel("Number 2:");
        result= new JLabel("Result: ");
        tf1= new JTextField(25);
        tf2= new JTextField(25);
        
        bt1= new JButton("Sub");
        bt= new JButton("Add");
        btt= new JButton("Add to file");
        
        Container cn= getContentPane();
        cn.setLayout(new FlowLayout());
        cn.add(label);cn.add(tf1);
        cn.add(secLabel);cn.add(tf2);
        cn.add(result);
        cn.add(bt);
        cn.add(bt1);
        cn.add(btt);
    }//const
}
