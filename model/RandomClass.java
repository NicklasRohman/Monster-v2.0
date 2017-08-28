package model;

import java.util.Random;

public class RandomClass {

	static Random random = new Random();
	
	public RandomClass() {
	}

	/**
	* Method that returns 90% true else false.
	* @return true/false.
	*/
	public static boolean getAdvetureChance(){
		return random.nextDouble()<0.9;
	}
	
	/**
	* Method that is generate a value between max and min.
	* @param min minimum number.
	* @param max maximum number.
	* @return value of a number betwin max - min.
	*/
	public static int getInt(int min,int max){
		
		return min+random.nextInt(max-min);
	
}
	
}
