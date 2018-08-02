/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raoum
 */
import java.io.*;
import java.util.*;
public class A1Part2 {
    public static void main(String []args) {
        String s;
        int count=0;
        try{
            File myFile= new File ("d:/file1.txt");
            Scanner inp= new Scanner (myFile);
            PrintWriter pr= new PrintWriter (new File("d:/file2.txt"));
            do{
                s=inp.nextLine();
                if (s.indexOf("AOU")!=-1){
                    pr.println(s);
                    count++;
                }//if
            }while(inp.hasNextLine());
            pr.close();
            inp.close();
        }//try
        catch(Exception obj){
            System.out.println("Error !-!");
        }//catch
        finally{
            System.out.println("Number of Lines Printed = "+count);
        }//finally
    }//main
    
}
