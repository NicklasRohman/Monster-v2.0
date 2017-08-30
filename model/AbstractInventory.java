package model;

import java.util.List;
import java.util.ArrayList;

public abstract class AbstractInventory {

	private List<Item> helmetList, armorList, trouserList, gloveList, swordList, axeList, spearList;
	
	public AbstractInventory(){
		this.helmetList = new ArrayList();
		this.armorList = new ArrayList();
		this.trouserList = new ArrayList();
		this.gloveList = new ArrayList();
		this.swordList = new ArrayList();
		this.axeList = new ArrayList();
		this.spearList = new ArrayList();		
	}
	
	public void addItem(Item item) {
		if(item.getType().equals("Helmet")) {
			helmetList.add(item);
		}
		else if(item.getType().equals("Armor")) {
			armorList.add(item);
		}
		else if(item.getType().equals("Trousers")) {
			trouserList.add(item);
		}
		else if(item.getType().equals("Gloves")) {
			gloveList.add(item);
		}
		else if(item.getType().equals("Sword")) {
			swordList.add(item);
		}
		else if(item.getType().equals("Axe")) {
			axeList.add(item);
		}
		else if(item.getType().equals("Spear")) {
			spearList.add(item);
		}
	}
	
	public void removeItem(String type, int index) {
		if(type.equals("Helmet")) {
			helmetList.remove(index);
		}
		else if(type.equals("Armor")) {
			armorList.remove(index);
		}
		else if(type.equals("Trousers")) {
			trouserList.remove(index);
		}
		else if(type.equals("Gloves")) {
			gloveList.remove(index);
		}
		else if(type.equals("Sword")) {
			swordList.remove(index);
		}
		else if(type.equals("Axe")) {
			axeList.remove(index);
		}
		else if(type.equals("Spear")) {
			spearList.remove(index);
		}
	}
}
