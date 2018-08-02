/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raoum
 */
public class Circle {
    private double radius;
    
    public Circle(){ radius = 1.0;}// 0 arg
    public Circle(double d){ radius = d;}//multi arg
    public double getRadius(){return radius;}//getter
    public double getArea(){return radius*radius* Math.PI;}//getter
    }
