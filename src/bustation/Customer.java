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
public interface Customer {
    public void bookTrip(String from,String to,String depdate, String arrivdate,int n); 
    public void cancelTrip();
    public void upgradeTicket();
    public void myTickets();
    
    
}
