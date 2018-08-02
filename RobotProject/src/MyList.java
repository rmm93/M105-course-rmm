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
public class MyList {
    public static void main (String []args){
    ArrayList <String>list= new ArrayList<String>(76);
    System.out.println(list.isEmpty()+" "+ list.size());
    list.add("Raoum");
    list.add("Areej");
    list.add("Mariam");
    list.add(3,"Marc Jacobs");
    System.out.println(list.toString());
    System.out.println(list.isEmpty()+" "+ list.size());
    
    ArrayList <Integer>list1= new ArrayList<Integer>(76);
    list1.add(36);
    list1.add(23);
    list1.add(19);
    
    for (Integer i : list1){
        System.out.println(list1);
    }// for each
    RobotGroup RG= new RobotGroup();
    Robot art= new Robot(5,6);
    RG.add(art);
    
    MagicRobot magicMike= new MagicRobot();
    RG.add(magicMike);
    
    RG.displayAll();
    }//main
}
