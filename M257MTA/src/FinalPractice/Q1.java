/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package FinalPractice;

/**
 *
 * @author Raoum
 */
import java.util.*;
import javax.swing.*;
public class Q1 {
    public static void main (String [] args){
        double [] arr= new double[2];
        Scanner sc= new Scanner(System.in);
        for(int i=0; i<2;i++){
            JOptionPane.showMessageDialog(null,"input in array","alert",JOptionPane.ERROR_MESSAGE);
            arr[i]= sc.nextDouble();
        }//for
        for(int i=0; i<2;i++){
            System.out.println(arr[i]);
        }//for
        ArrayList <Double> al= new <Double> ArrayList(2);
        double d;
        for(int i=0; i<2;i++){
            System.out.println("please enter value number "+ (i+1));
            d= sc.nextDouble();
            al.add(d);
        }//for
        Iterator <Double> count= al.iterator();
        do{
            System.out.println(count.next());
        }while(count.hasNext());
    }//main
}
