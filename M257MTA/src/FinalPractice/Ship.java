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
public class Ship implements ShipInterface{
    private String [] items;
    private Position position;
    public Ship(String [] s, Position p){
        items = s;
        position= p;
    }//2-Arg Const.
    public void moveTo(double longitude, double latitude){
        position.setLatitude(latitude);
        position.setLongitude(longitude);
    }//override from interface

    @Override
    public String toString (){return position.toString() + " \" Num Of Items= "+ items.length;}//override
}
