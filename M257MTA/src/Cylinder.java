/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raoum
 */

public class Cylinder extends Circle{
    private double height;
    public Cylinder(){height = 1.0;}//0 arg
    public Cylinder(double r, double h){super(r);height= h;}//2 arg
    public double getHeight(){return height;}//getter
    public double getVolume(){return super.getArea()* height;}//volume
    public String toString(){return "Radius = "+getRadius()+" height = "+ height+ " base area = "+ getArea()+ " volume = "+ getVolume();}//to string
}
