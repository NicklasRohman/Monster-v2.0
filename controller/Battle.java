package controller;

import model.Enemy;
import model.Player;
import model.RandomClass;
import view.BattleBox;
import view.GUI;
import view.UsePotain;

public class Battle {

	static Battle battle;
	BattleBox battleBox = BattleBox.getInstance();

	public static Battle getInstance() {
		if (battle == null) {
			battle = new Battle();
		}
		return battle;
	};

	UsePotain usePotain = UsePotain.getInstance();

	private Battle() {
	}

	public void battle(Player player, Enemy monster) {
		
		GUI.printTextArea("A strange figure appear, it's " + monster.getName() + " What are you going to do?");
		int answer = battleBox.display("Ohh Shit!!",
				"A strange figure appear, it's " + monster.getName() + " What are you going to do?");
		boolean input;
		do {
		if (answer == 1) {
			
				int damage = hitFor(player.getAttackPoints() + player.getPlayerStrength() + player.getWeaponAP());
				if (player.isAlive()) {
					 GUI.printTextArea(("Hero "+ player.getName() +" hits with a " + player.getWeaponName()+ " and is dealing "+ damage
					 + " damage to the "+ monster.getName()));
					GUI.printTextArea(("Hero " + player.getName() + " hits with his bar hands and is dealing " + damage
							+ " damage to the " + monster.getName()));
					monster.setHp(monster.getHp() - damage);
				} else {
					GUI.printTextArea(player.getName() + " have been slayed by the " + monster.getName());
					player.setHp(0);
					if (player.getHealingPotions() > 0) {
						input = usePotain.display("Healing?", "Do you want to use a potion? y/n");
						if (input) {
							player.restorHealt(player.getHealingPotions());
						} else {
							System.exit(0);
						}
					} else {
						System.exit(0);
					}
				}

				damage = hitFor(monster.getAttackPoints() - player.getPlayerToughness());
				if (monster.isAlive()) {
					GUI.printTextArea((monster.getName() + " hits for " + damage + "damage to " + player.getName()));
					player.setHp(player.getHp() - damage);
				}

				if (!player.isAlive()) {
					GUI.printTextArea("You have been slayed by the " + monster.getName());
					player.setHp(0);
					if (player.getHealingPotions() > 0) {
						input = usePotain.display("Healing?", "Do you want to use a potion? y/n");
						if (input) {
							player.restorHealt(player.getHealingPotions());
						} else {
							System.exit(0);
						}
					} else {
						System.exit(0);
					}
				}

				else {
					 int coin = monster.generateGold()*player.getPlayerLuck();
					 int xp = monster.generateXp();
					 GUI.printTextArea("You have slayed " + monster.getName()
					 + " and getting "+ xp + " experiens and " + coin + " coins ");
					boolean magicFind = RandomClass.magicFind(player);
					if (magicFind) {
						// System.out.printf("The %s alsow drops a %s
						// +%s%n",monster.getMonsterName(),item.getItemName(),item.getItemPoints());
						// System.out.printf("Do you want to use this %s? y/n
						// ",item.getItemName());
						String input1 = "";
						if (input1.equalsIgnoreCase("y")) {

							 //player.useItem(item.getItemName(),item.getItemPoints());

						}
					}
					 player.Experiens(player.getExperience() + xp);
					 player.addGold(player.getGold() + coin);

				}

				if (monster.isAlive()) {
//					battleBox.display("The fight isnt over yet", player.getName() + "Hp:" + player.getHp() +" and "+ monster.getName() + "Hp" + monster.getHp());

					if (input = false) {
						break;
					} else {
						do {
							input = usePotain.display("Medic time!!", "Use a healing potion? y/n");
							usePotain.display("Medic time!!", "Use a healing potion? y/n");
							if (input) {
								if (player.getHealingPotions() > 0) {
									player.restorHealt(player.getHealingPotions());	
									
								}	
								else {
									GUI.printTextArea("you do not have any more healing potions");
									break;
								}
							}
						
						} while (input);

					}
				}
			
		}
		else if (answer == 2) {
			do {
				input = usePotain.display("Medic time!!", "Use a healing potion? y/n");
				usePotain.display("Medic time!!", "Use a healing potion? y/n");
				if (input) {
					if (player.getHealingPotions() > 0) {
						player.restorHealt(player.getHealingPotions());	
						
					}	
					else {
						GUI.printTextArea("you do not have any more healing potions");
						break;
					}
				}
			
			} while (input);

		}
		else if(answer == 3){
			GUI.printTextArea(monster.getName() + " shouts after you: Coword!!!!! ");
			break;
		}
		
		} while (player.isAlive() && monster.isAlive());
	}

	private int hitFor(int d) {

		if (d <= 0) {
			return 0;
		} else {
			int damage = RandomClass.getInt(0, d);
			if (damage < 0) {
				damage = 0;
			}
			return damage;
		}

	}

	public void usePotions(){
		
	}
}