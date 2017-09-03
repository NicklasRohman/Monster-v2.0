package controller;

import model.Enemy;
import model.Item;
import model.ItemGenerator;
import model.Player;
import model.RandomClass;
import view.BattleBox;
import view.DeadBox;
import view.GUI;
import view.NoPotionsBox;
import view.UsePotions;
/**
 * 
 * @author Nicklas
 * BattleClass handles everything that is happening in the battle
 */
public class Battle {

	static Battle battle;
	BattleBox battleBox = BattleBox.getInstance();
	DeadBox deadbox = DeadBox.getInstance();
	NoPotionsBox noPotionsBox = NoPotionsBox.getInstance();
	UsePotions usePotions = UsePotions.getInstance();

	public static Battle getInstance() {
		if (battle == null) {
			battle = new Battle();
		}
		return battle;
	};

	private Battle() {
	}

	public void battle(Player player, Enemy monster) {
		GUI.setEnemyLabel(monster.getName());
		GUI.printTextArea("A strange figure appear, it's " + monster.getName() + " What are you going to do?");
		int answer = battleBox
				.display("A strange figure appear, it's " + monster.getName() + "\nWhat are you going to do?");

		do {
			if (answer == 1) {

				int damage = hitFor(player.getAttackPoints() + player.getPlayerStrength() + player.getWeaponAP());
				if (player.isAlive()) {
					GUI.printTextArea(("Hero " + player.getName() + " hits with a " + player.getWeaponName()
							+ " and is dealing " + damage + " damage to the " + monster.getName()));
					monster.setHp(monster.getHp() - damage);
				} else {
					GUI.printTextArea(player.getName() + " have been slayed by the " + monster.getName());
					player.setHp(0);
					if (player.getHealingPotions() > 0) {
						usePotions(player);
					} else {
						GUI.printTextArea("You do not have any potions, so You are DEAD!!!");
						deadbox.display();
						System.exit(0);
					}
				}

				damage = hitFor(monster.getAttackPoints() - player.getPlayerToughness());
				if (monster.isAlive()) {
					GUI.printTextArea((monster.getName() + " hits for " + damage + " damage to " + player.getName()));
					player.setHp(player.getHp() - damage);
					if (!player.isAlive()) {
						GUI.printTextArea("You have been slayed by the " + monster.getName());
						player.setHp(0);
						if (player.getHealingPotions() > 0) {
							usePotions(player);
						} else {
							GUI.printTextArea("You do not have any potions, so You are DEAD!!!");
							deadbox.display();
							System.exit(0);
						}
					}
				} else {
					int coin = monster.generateGold() * player.getPlayerLuck();
					int xp = monster.generateXp();
					GUI.printTextArea("You have slayed " + monster.getName() + " and getting " + xp + " experiens and "
							+ coin + " coins ");

					boolean magicFind = RandomClass.magicFind(player);
					if (magicFind) {
						ItemGenerator itemGenerator = new ItemGenerator();
						Item item = itemGenerator.generateItem(0);
						GUI.printTextArea(
								monster.getName() + "alsow drops a " + item.getName() + item.getAttackPower());
					}
					player.Experiens(player.getExperience() + xp);
					player.addGold(player.getGold() + coin);
					GUI.setEnemyLabel("");
				}

				if (monster.isAlive()) {
					answer = battleBox.display(player.getName() + " Hp: " + player.getHp() + " and " + monster.getName()
							+ " Hp " + monster.getHp());

				}
			}
			if (answer == 2) {
				usePotions(player);
				GUI.printTextArea("What are you going to do now " + monster.getName() + " asks you?");
				answer = battleBox.display("What are you going to do now " + monster.getName() + "\nasks you?");

			}

			if (answer == 3) {
				GUI.printTextArea(monster.getName() + " shouts after you: Caword!!!!! ");
				GUI.setEnemyLabel("");
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

	private void usePotions(Player player) {
		if (player.getHealingPotions() > 0) {
			boolean inputHealing = usePotions.display("Medic time!! \n Use a healing potion? ");
			if (inputHealing) {
				player.restorHealt(player.getHealingPotions());
				player.setHealingPotions(player.getHealingPotions() - 1);
			}
		} else {
			GUI.printTextArea("you do not have any more healing potions");
			noPotionsBox.display();
		}
	}
}