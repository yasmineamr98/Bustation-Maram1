/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bustation;

import java.util.ArrayList;
import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author MaramH
 */
public class Bustation {
    
    protected ArrayList<Trip> TripArray = new ArrayList<Trip>();
    protected ArrayList<Customers> CustomerArray = new ArrayList<Customers>();
    protected ArrayList<Vehicles> VehicleArray = new ArrayList<Vehicles>();
    protected ArrayList<Employee> EmployeeArray = new ArrayList<Employee>();
    
    
     public Bustation() {
        
    }
  
    public ArrayList<Trip> getTripArray() {
        return TripArray;
    }

    public void setTripArray(ArrayList<Trip> TripArray) {
        this.TripArray = TripArray;
    }

    public ArrayList<Customers> getCustomerArray() {
        return CustomerArray;
    }

    public void setCustomerArray(ArrayList<Customers> CustomerArray) {
        this.CustomerArray = CustomerArray;
    }

    public ArrayList<Vehicles> getVehicleArray() {
        return VehicleArray;
    }

    public void setVehicleArray(ArrayList<Vehicles> VehicleArray) {
        this.VehicleArray = VehicleArray;
    }

    public ArrayList<Employee> getEmployeeArray() {
        return EmployeeArray;
    }

    public void setEmployeeArray(ArrayList<Employee> EmployeeArray) {
        this.EmployeeArray = EmployeeArray;
    }

    void readFiles() throws ParseException {
        try
        {
            FileReader fr1 = new FileReader("CustomerInfo.txt");
            BufferedReader bf1 = new BufferedReader(fr1);
            FileReader fr2 = new FileReader("TripInfo.txt");
            BufferedReader bf2 = new BufferedReader(fr2);
            FileReader fr3 = new FileReader("EmployeeInfo.txt");
            BufferedReader bf3 = new BufferedReader(fr3);
            FileReader fr4 = new FileReader("VehiclesInfo.txt");
            BufferedReader bf4 = new BufferedReader(fr4);
            SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
            SimpleDateFormat DATE_FORMAT2 = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
       
            
            String line1, line2, line3,line4;
            while((line1 = bf1.readLine()) != null)
            {
		String[] list1 = line1.split(",");
                
                CustomerArray.add(new Customers(list1[0],list1[1],list1[2], DATE_FORMAT.parse(list1[3]),list1[4],list1[5]));
		
            }    
             while((line4 = bf4.readLine()) != null)
            {
		String[] list4 = line4.split(",");
               switch(list4[0])
               {
                   case "bus":
                       VehicleArray.add(new Bus(list4[1]));
                       break;
                   case "limo":
                       VehicleArray.add(new Limosine(list4[1]));
                       break;
                   case "minibus":
                       VehicleArray.add(new Minibus(list4[1]));
                       break;
                               
               }
             while((line3 = bf3.readLine()) != null)
            {
		String[] list3 = line3.split(",");
                if(list3[0].equalsIgnoreCase("manager"))
                    EmployeeArray.add(new Manager(list3[1] , list3[2],Integer.parseInt(list3[3])));
		else
                    EmployeeArray.add(new Driver(list3[1] , list3[2],Integer.parseInt(list3[3])));
            }   
               
               while((line2 = bf2.readLine()) != null)
            {
		String[] list2 = line2.split(",");
                
                TripArray.add(new Trip(list2[0],Integer.parseInt(list2[1]),DATE_FORMAT2.parse(list2[2]), DATE_FORMAT2.parse(list2[3]),list2[4],list2[5],Integer.parseInt(list2[6]),list2[7]));
		
            }   
           
           
                    
		
            }   
             
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Bustation.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Bustation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    }
  

    /**
     * @param args the command line arguments
     */
    

   
    

