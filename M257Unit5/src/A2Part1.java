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
public class A2Part1 {
    public static void main(String[] args){
        try{
            Scanner sc= new Scanner(System.in);
            System.out.println("Please inter your ID");
            int ID= sc.nextInt();
            System.out.println(ID);
            sc.close();}//try
        
        catch(InputMismatchException olb){
            System.out.println("Please inter your ID in Numbers");
        }//catch
    }//main
}
