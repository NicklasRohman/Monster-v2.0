package model;

import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author Nicklas
 * A Singeltone class
 */
public class Adventure {
	static List<String> adventureList = new ArrayList<String>();
	static List<String> easyAdventureList = new ArrayList<String>();
	
	private static int adventureWalk = 0;
	public static  Adventure adventrureIns = null;
	
	private Adventure() {
	
		adventureList.add("You found a abandoned house");		
		adventureList.add("You found a abandoned castle");
		adventureList.add("You found a small road in the forest");
		
		easyAdventureList.add("Taking a easy walk i the park isen't a adventure.");
		easyAdventureList.add("You walk in to the forest to chop soom wood for to night.");
		easyAdventureList.add("You call a easy walk by the lake a adventure?");
	
	}
	
	public static Adventure getInstance(){
		
		if(adventrureIns==null){
			adventrureIns = new Adventure();
		}
		
		return adventrureIns;
	}
	

	public String goAdventuring(){
		boolean happening = RandomClass.getAdvetureChance();
		
		if (happening) {
			setAdventureWalk(RandomClass.getInt(0, adventureList.size()));	
			return adventureList.get(getAdventureWalk());
			
		}
		else {
			setAdventureWalk(-1);
			return easyAdventureList.get(RandomClass.getInt(0, easyAdventureList.size()));
			
		}
	}

	public int getAdventureWalk() {
		return adventureWalk;
	}

	public void setAdventureWalk(int thisAdventureWalk) {
		adventureWalk = thisAdventureWalk;
	}
	
	
	
	
}
