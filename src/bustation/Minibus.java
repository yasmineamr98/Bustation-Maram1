/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bustation;

/**
 *
 * @author MaramH
 */
public class Minibus extends Vehicles{

    public Minibus(String plateNumber) {
        super.setPlatenumber(plateNumber);
    }

    @Override
    public void setNumberofseats() {
        super.numberOfseats = 30;
    }
    
}