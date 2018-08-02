/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part3B;

/**
 *
 * @author Raoum
 */
import java.util.*;
import java.io.*;

public class ThisIsEasy {
    public static void main(String [] args){
        try{
            PrintWriter pw= new PrintWriter(new File("d:/mta.txt"));
            pw.println("This is easy");
            pw.close();
        }
        catch(FileNotFoundException obj){
            System.out.println("File not found!-!");
        }//catch
    }
        
}
