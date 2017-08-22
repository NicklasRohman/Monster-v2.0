package model;

import java.util.Random;

public class ItemGenerator {

	private String firstName[],secundName[]; 
	static Random rand = new Random();
	
	public ItemGenerator() {

	}


	public String[] getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName[]) {
		this.firstName = firstName;
	}


	public String[] getSecundName() {
		return secundName;
	}


	public void setSecundName(String secundName[]) {
		this.secundName = secundName;
	}

	public String nameGenerator(){
		
		rand.nextInt(0,1);
		String nameString = getFirstName(rand(0,firstName.length)) + " " + getSecundName(Random(0,secundName.length));
		
		return nameString;
	}



}





