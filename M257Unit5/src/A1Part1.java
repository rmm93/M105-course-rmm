/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raoum
 */

import java.util.*;
import java.io.*;
public class A1Part1 {
    public static void main(String []args) {
        try{
            File myFile= new File("d:/file1.txt");
            Scanner inp= new Scanner(myFile);
            String [] name=new String[20];
            int counter= 0;
            do{
                name[counter]= inp.next();
                System.out.println(name[counter]);
                counter++;
        
            }while(inp.hasNext());// do while   
        }//try
        catch(ArrayIndexOutOfBoundsException obj){
            System.out.println("Array Exceeded!!");
        }//first cath
        
        catch (Exception obj){
            System.out.println("Error!_!");            
        }// 2nd catch
        
        finally{
            System.out.println("Thank you for using this Programme =D");
        }//final 
    }//main
}
