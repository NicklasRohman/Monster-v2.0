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

		if (answer == 1) {
			do {
				int damage = hitFor(player.getAttackPoints() + player.getPlayerStrength() + player.getWeaponAP());
				if (player.isAlive()) {
					// GUI.printTextArea(("Hero "+ player.getName() +" hits with
					// a " + player.getWeaponName()+ " and is dealing "+ damage
					// + " damage to the "+ monster.getName()));
					GUI.printTextArea(("Hero " + player.getName() + " hits with his bar hands and is dealing " + damage
							+ " damage to the " + monster.getName()));
					monster.setHp(monster.getHp() - damage);
				} else {
					GUI.printTextArea(player.getName() + " have been slayed by the " + monster.getName());
					player.setHp(0);
					if (player.getHealingPotions() > 0) {
						boolean input = usePotain.display("Healing?", "Do you want to use a potion? y/n");
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
						boolean input = usePotain.display("Healing?", "Do you want to use a potion? y/n");
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
					// int coin =
					// monster.monsterGiveCoin(player.getPlayerLuck());
					 GUI.printTextArea("You have slayed " + monster.getName()
					 + " and getting experiens and coins ");
					// GUI.printTextArea("You have slayed " + monster.getName()
					// + " and getting "+ monster. + "experiens and %s coins
					// ",coin);
					// boolean magicFind = RandomClass.getMagicFind(player);
					boolean magicFind = false;
					if (magicFind) {
						// System.out.printf("The %s alsow drops a %s
						// +%s%n",monster.getMonsterName(),item.getItemName(),item.getItemPoints());
						// System.out.printf("Do you want to use this %s? y/n
						// ",item.getItemName());
						String input = "";
						if (input.equalsIgnoreCase("y")) {

							// player.useItem(item.getItemName(),item.getItemPoints());

						}
					}
					// player.Experiens(monster.getMonsterGivenExp());
					// player.setCoins(player.getCoins() + coin);

				}

				if (monster.isAlive()) {
					battleBox.display("The fight isnt over yet", player.getName() + "Hp:" + player.getHp() +" and "+ monster.getName() + "Hp" + monster.getHp());
					System.out.printf("\nContinue fighting press Enter" + "\nR. for run away "
							+ "\nH. to use healing Potion (" + player.getHealingPotions() + ")\n");

					boolean input;
					if (input = false) {
						break;
					} else {
						do {
							input = usePotain.display("Medic time!!", "Use more healing potion? y/n");
							usePotain.display("Medic time!!", "Use more healing potion? y/n");
							if (input) {
								if (player.getHealingPotions() > 0) {
									player.restorHealt(player.getHealingPotions());	
									
								}	
								else {
									GUI.printTextArea("you do not have any more healing potions");
								}
							}
						
						} while (input);

					}
				}
			} while (player.isAlive() && monster.isAlive());
		}
		if (answer == 2) {
			player.restorHealt(player.getHealingPotions());
			if (player.getHealingPotions() > 0) {
				usePotain.display("Medic time!!", "Use more healing potion? y/n");
			boolean	input = usePotain.display("Medic time!!", "Use more healing potion? y/n");
			}
		}
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
