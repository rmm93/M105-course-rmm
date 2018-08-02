/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raoum
 */
public class MagicRobot extends Robot{
    private boolean visible;
    public MagicRobot(){
    visible= false;}//constructor
    public void makeVisible(){
    visible= true;}//make vis
    public void makeInVisible(){
    visible= false;}// make false
    public boolean isVisible(){
    return visible;}//return visible
    public String toString(){
    return "X: "+getX()+"\tY: "+getY()+"\tand it is "+visible;}//extra print 
}
