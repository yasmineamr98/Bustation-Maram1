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
public class Ticket extends Bustation {
    private Trip trip;
    private Customers customer;
    private int ticketNo ;
    private double price;

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public Customers getCustomer() {
        return customer;
    }

    public void setCustomer(Customers customer) {
        this.customer = customer;
    }

    public int getTicketNo() {
        return ticketNo;
    }

    public void setTicketNo(int ticketNo) {
        this.ticketNo = ticketNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public ArrayList<Customers> getCustomerArray() {
        return CustomerArray;
    }

    public void setCustomerArray(ArrayList<Customers> CustomerArray) {
        this.CustomerArray = CustomerArray;
    }
    
     
    public boolean Ticket(String username, int tripno)
    {
        for(Trip array : super.TripArray) 
         {
          if(array.getTripno() == tripno)   
          {
              this.trip = array;
              break;
          }
          
         }
        for(Customers customer : super.CustomerArray)
        {
            if(customer.getName().equals(username))
            {
                this.customer = customer;
                break;
            }
        }
        if(this.trip.getAvaplaces() > 0)
        {
            this.ticketNo = 10*trip.getAvaplaces();
            this.trip.getTicketArray().add(this);
           
            return true;
        }
        else 
            return false;
    }
}
