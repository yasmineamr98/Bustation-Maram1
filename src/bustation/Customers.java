/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bustation;
import java.text.ParseException;
import java.util.Date;

/**
 *
 * @author MaramH
 */
public class Customers extends Bustation implements Customer{

    private boolean acctype;
    private String name;
    private String password;
    Date DOB = new Date();
    private String nationality;
    private String gender;

    
    
     public Customers(String accType,String name, String password, Date DOB, String nationality, String gender) throws ParseException {
       if (accType.equalsIgnoreCase("vip"))
           acctype= true;
       else acctype = false;
           
       this.name = name;
       this.password = password;
       //SimpleDateFormat DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy");
       //Date date = DATE_FORMAT.parse(DOB);
       this.DOB = DOB;
       this.nationality = nationality;
       this.gender = gender;

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDOB() {
        return DOB;
    }

    public void setDOB(Date DOB) {
        this.DOB = DOB;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public void bookTrip(String from, String to, String depdate, String arrivdate, int n) {
       for (Trip TripArray : super.TripArray) {
            if(TripArray.getFrom().equalsIgnoreCase(from) && TripArray.getDest().equalsIgnoreCase(to) && TripArray.getArrivDate().equals(arrivdate) && TripArray.getDepDate().equals(depdate))
                if(TripArray.getAvaplaces() > 0)
                    TripArray.setAvaplaces(TripArray.getAvaplaces()-n);
        }
    }

    @Override
    public void cancelTrip() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void upgradeTicket() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void myTickets() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


   
}
