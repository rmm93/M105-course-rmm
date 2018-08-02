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
public class MyHashMap {
    public static void main(String []args){
        HashMap <String,Integer>table1= new HashMap<String,Integer>(10);
        
        table1.put("Raoum", 6);
        table1.put("Marc Jacobs", 17);
        System.out.println("Name is: "+ table1.get(0));
        for (String name: table1.keySet()){
            System.out.println("Value is: " +name+ " Name is "+table1.get(name));
        }//for each
    }//main
}
