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
public abstract class Employee extends Bustation{
	private String name;
	private String Password;
	private int ID;
	
	public Employee(String name, String Password, int ID) {
		this.name = name;
		this.Password = Password;
		this.ID = ID;
	}
	
	public int getID() {
		return ID;
	}
	
	public void setID(int ID) {
		this.ID = ID;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getPassword() {
		return Password;
	}
	
	public void setPassword(String Password) {
		this.Password = Password;
	}
	
       
       
}
