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
public class Position {
    private double longitude, latitude;
    public void setLongitude(double d){longitude= d;}//1st setter
    public void setLatitude(double d){latitude= d;}//2nd setter
    @Override
    public String toString(){return "\"Longitude= "+ longitude+ " ,Latitude= "+ latitude+ "\"";}//override
}
