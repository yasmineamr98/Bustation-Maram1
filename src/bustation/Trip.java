/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bustation;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
/**
 *
 * @author MaramH
 */
public class Trip extends Bustation{
  private Vehicles vehicle;
  private Employee driver; 
  private Date depDate;
  private Date arrivDate;
  private String dest;
  private String from;
  private int nofstops;
  private int avaplaces;
  private int tripno = 1;

  

    public int getTripno() {
        return tripno;
    }

    public void setTripno(int tripno) {
        this.tripno = tripno;
    }

    public ArrayList<Ticket> getTicketArray() {
        return TicketArray;
    }
    
    public ArrayList<Ticket> TicketArray = new ArrayList<Ticket>();

  
  
    public int getNofstops() {
        return nofstops;
    }

    public void setNofstops(int nofstops) {
        this.nofstops = nofstops;
    }

    public int getAvaplaces() {
        return avaplaces;
    }

    public void setAvaplaces(int avaplaces) {
        this.avaplaces = avaplaces;
    }

    public String getTripClass() {
        return tripClass;
    }

    public void setTripClass(String tripClass) {
        this.tripClass = tripClass;
    }
  private String tripClass;
    public Vehicles getVehicle() {
        return vehicle;
    }

    public Trip(String plateNumber, int driverID, Date depDate, Date arrivDate, String dest, String from, int x, String tripClass) {
     for(Vehicles array : super.VehicleArray)
     {
         if(array.getPlateNumber().equals(plateNumber))
         {
             array.trips.add(this.tripno);
             this.vehicle = array;         }
         
               
     }
        this.avaplaces = this.vehicle.numberOfseats;
        for(Employee array : super.EmployeeArray)
        {
            if(array.getID() == driverID)
                this.driver = array;
                   
        }
        
        this.depDate = depDate;
        this.arrivDate = arrivDate;
        this.dest = dest;
        this.from = from;
        this.nofstops = x;
        this.tripClass = tripClass;
        
        tripno++;
    }

    public void setVehiecle(Vehicles vehiecle) {
        this.vehicle = vehiecle;
    }

    public Employee getDriver() {
        return driver;
    }

    public void setDriver(Employee driver) {
        this.driver = driver;
    }

    public Date getDepDate() {
        return depDate;
    }

    public void setDepDate(Date dep) {
        this.depDate = dep;
    }

    public Date getArrivDate() {
        return arrivDate;
    }

    public void setArrivDate(Date arriv) {
        this.arrivDate = arriv;
    }

    public String getDest() {
        return dest;
    }

    public void setDest(String dest) {
        this.dest = dest;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public boolean isClas() {
        return clas;
    }

    public void setClas(boolean clas) {
        this.clas = clas;
    }
  
 
    
}