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
import java.io.*;
import java.net.*;
import javax.swing.*;
public class Client {
    public void run() {
        // ADD CODE HERE!
        try{
            Socket sckt =new Socket("121.121.121.121",3333); 
            PrintWriter pw = new PrintWriter(sckt.getOutputStream());
            File fl= new File ("Test.txt");
            Scanner sc = new Scanner(fl);
            String s="";
            do{
            s= sc.nextLine();
            pw.println(s);
            }while(sc.hasNextLine());
            sckt.close();
            sc.close();
            pw.close();
            JOptionPane.showMessageDialog(null, "Successfully Sent");
        }
        catch(IOException ioe){}
    }
    public static void main(String[] args) {
        Client c = new Client();
        c.run();
    }
}
