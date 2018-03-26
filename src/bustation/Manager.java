/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bustation;

import java.util.Date;

/**
 *
 * @author MaramH
 */
public class Manager extends Employee{
	
	public Manager(String name, String Password, int ID) {
		super(name, Password, ID);
	}
	
	@Override
	public void setPassword(String Password) {
		super.setPassword(Password); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public String getPassword() {
		return super.getPassword(); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public void setName(String name) {
		super.setName(name); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public String getName() {
		return super.getName(); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public void setID(int ID) {
		super.setID(ID); //To change body of generated methods, choose Tools | Templates.
	}
	
	@Override
	public int getID() {
		return super.getID(); //To change body of generated methods, choose Tools | Templates.
	}
	public boolean HireDriver(String name, String Password, int ID)
	{
		Boolean flag=true;
		for(Employee employee : super.EmployeeArray)
		{
			if(employee.getID() == ID)
			{
				flag = false;
				return flag;
			}
		}
		if (flag == true)
		{
			Employee driver= new Driver(name, Password, ID);
			super.EmployeeArray.add(driver);
			
		}
		return flag;
	}
        public void CreateTrip(String plateNumber, int driverID,Date depDate, Date arrivDate, String dest, String from,int x,String tripClass)
        {
            
            Trip tr = new Trip(plateNumber, driverID, depDate, arrivDate, dest, from, x, tripClass);
            super.TripArray.add(tr);
            
        }
        public void FireDriver(String name , int ID)
        {
            for (Employee emp : super.EmployeeArray)
            {
                if(ID == emp.getID() && emp.getName().equalsIgnoreCase(name))
                {
                    super.EmployeeArray.remove(emp);
                    break;
                }
            }
        }
        public boolean CancelTrip(int tripno)
        {
            boolean flag= true;
            
            for (Trip trip : super.TripArray)
            {
                if(trip.getTripno() == tripno)
                {
                    super.TripArray.remove(trip);
                    flag = false;
                    break;
                }
            }
            return flag;
        }
        
	
}


