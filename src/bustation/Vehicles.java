/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bustation;

import java.util.ArrayList;

/**
 *
 * @author MaramH
 */
public abstract class Vehicles extends Bustation{
    
    
 
    public int numberOfseats;
    private String plateNumber;
    protected ArrayList<Integer> trips = new ArrayList<Integer>();
    public void setPlatenumber(String x)
    {
        this.plateNumber = x;
    }
    
    public abstract void setNumberofseats();

    public String getPlateNumber() {
        return plateNumber;
    }
    
    public int getnumberOfseats()
    {
        return this.numberOfseats;
    }
    
    public Vehicles()
    {
       
    }
    
    
}