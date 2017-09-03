package model;

public class ItemGenerator {

	public static ItemGenerator itemGenerator;

	public static ItemGenerator getInstance() {
		if (itemGenerator == null) {
			itemGenerator = new ItemGenerator();
		}
		return itemGenerator;
	}

	private String secondName[];

	public ItemGenerator() {
		this.setSecondName();
	}

	public Item generateItem(int typeOfWeapon) {

		int index;

		if (typeOfWeapon == 0) {
			index = RandomClass.getInt(0, 10);
		} else {
			index = typeOfWeapon;
		}

		String type = setType(index);
		int rarity = RandomClass.getInt(0, 100);
		if (rarity <= 50) {
			rarity = 20;
		} else if (rarity > 50 && rarity <= 75) {
			rarity = 40;
		} else if (rarity > 75 && rarity <= 95) {
			rarity = 60;
		} else {
			rarity = 80;
		}
		return new Item(generateName(type), type, RandomClass.getInt(rarity - 20, rarity),
				RandomClass.getInt(rarity - 20, rarity), RandomClass.getInt(rarity - 20, rarity),
				RandomClass.getInt(rarity - 20, rarity));
	}

	private String setType(int index) {
		switch (index) {
		case 1:
			// Sword
			return "Sword";
		case 2:
			// Axe
			return "Axe";
		case 3:
			// Spear
			return "Spear";
		case 4:
			// Helmet
			return "Helmet";
		case 5:
			// Gloves
			return "Gloves";
		case 6:
			// Armor
			return "Armor";
		case 7:
			// Trousers
			return "Trousers";
		case 8:
			// Gloves
			return "Gloves";
		case 9:
			// Boots
			return "Boots";
		case 10:
			// Shield
			return "Shield";
		default:
			// Default method
			return "Oh no";
		}

	}

	private String generateName(String type) {
		return type + " " + secondName[RandomClass.getInt(0, secondName.length)];
	}

	private void setSecondName() {
		secondName = new String[10];
		secondName[0] = "of Glory";
		secondName[1] = "of Reconning";
		secondName[2] = "of Poop";
		secondName[3] = "out of Diamonds";
		secondName[4] = "that slay Dragons";
		secondName[5] = "that slay Dwarves";
		secondName[6] = "of broken glass";
		secondName[7] = "of sunshine";
		secondName[8] = "that smell of sushi";
		secondName[9] = "of broken relationships";

	}

	public String[] getSecondName() {
		return secondName;
	}
}
