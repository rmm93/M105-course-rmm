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
public class Unit2Activities {
    public static void main(String []args){
        int [] love= new int[10];
        for (int l=0;l<love.length;l++){
        love[l]=getNumber();}//for
        printArray(love);
        System.out.println("Max = "+ findMax(love));
        duplicateArray(love);
        printArray(love);
    }//main
    public static int getNumber(){
        System.out.println("Please insert an int ^_^");
        Scanner inp= new Scanner (System.in);
        int num= inp.nextInt();
        return num;
    }//getnumber
    public static void printArray(int [] arr){
        for (int i=0; i<arr.length;i++)
        {System.out.print(arr[i]+" ");}//for
    }//Array
    public static int findMax(int [] arr){
        int max =0;
        for(int j=0; j<arr.length;j++){
            if (max<arr[j]){
            max = arr[j];}//if
        }//for
        return max;
    }//max
    public static void duplicateArray(int [] arr){
        for (int i=0; i<arr.length;i++)
        {arr[i]*=2;}//for
    }//array
}
