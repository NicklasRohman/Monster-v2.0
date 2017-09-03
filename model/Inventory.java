package model;

import java.util.ArrayList;
import java.util.List;

public class Inventory extends AbstractInventory{

	private ItemGenerator itemGenerator = ItemGenerator.getInstance();
	private List<Item> playersInventory = new ArrayList<Item>();

	public static Inventory inventory;
	
	public Inventory() {
		addBasicItems();
	}
	
	public static Inventory getInstance(){
		
		if (inventory == null){
			inventory = new Inventory();
		}
		return inventory;
	}
	
	public void addItem(Item item){
		playersInventory.add(item);
	}

	public List getPlayerInventory() {
		return this.playersInventory;
	}
	
	public void sellItem() {
		
	}
	
	public void buyItem() {
		
	}
	
	private void addBasicItems() {
		playersInventory.add(itemGenerator.generateItem(1));
		playersInventory.add(itemGenerator.generateItem(4));
		playersInventory.add(itemGenerator.generateItem(5));
		playersInventory.add(itemGenerator.generateItem(6));
		playersInventory.add(itemGenerator.generateItem(7));
		playersInventory.add(itemGenerator.generateItem(8));
		playersInventory.add(itemGenerator.generateItem(9));

	}
}
