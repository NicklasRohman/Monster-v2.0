package model;


public class ItemGenerator {

	private String firstNameAxe[], firstNameSword[], firstNameSpear[], secondName[]; 
	
	
	
	
	public ItemGenerator() {
		
	}

	private void setNames() {

	}

	private void setAxeNames() {
		firstNameAxe = new String[10];
	}
	
	private void setSwordNames() {
		firstNameSword = new String[10];
	}
	
	private void setSpearNames() {
		firstNameSpear = new String[10];
	}
	
	private void setSecondName() {
		secondName = new String[10];
	}


//	public void setFirstName(String firstName[]) {
//		this.firstName = firstName;
//	}


	public String[] getSecondName() {
		return secondName;
	}


	public void setSecondName(String secondName[]) {
		this.secondName = secondName;
	}

	public String nameGenerator(){

		
		return "";
	}



}



