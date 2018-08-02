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
import java.io.*;
import java.util.*;
public class Part3Q2 {
    public static void main(String [] args){
        int count= 0;
        try{
            String s="";
            PrintWriter pr= new PrintWriter(new File("Documents:\\AouWrite.txt"));
            Scanner sc= new Scanner(new File("Documents:\\Aou.txt"));
            do{
                s= sc.nextLine();
                if(s.contains("AOU")){
                    pr.print(s);
                    count++;
                }//if
            }while(sc.hasNextLine());
        
            sc.close();
            pr.close();
        }//try
        catch(IOException io){
            System.out.println("Error >':");
        }//catch
        finally{
            System.out.println("Num of printed Lines= "+count);
        }//finally
    }//main
}
