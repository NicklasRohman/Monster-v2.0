package controller;

import model.Enemy;
import model.ItemGenerator;
import model.Player;
import model.RandomClass;
import view.GUI;

public class Battle {

	static Battle battle;
	
	public static Battle getInstance(){
		if(battle == null){
			battle = new Battle();
		}
		return battle;
	};
	
	private Battle() {
	}

	public void battle(Enemy monster,ItemGenerator item,Player player){
		do {
			int damage = hitFor(player.getAttackPoints()+player.getPlayerStrength()+player.getWeaponAP());
			if (player.isAlive()) {
//			GUI.printTextArea((player.getName() +" hits with a " + player.getWeaponName() + " and is dealing "+ damage + " damage to the "+ monster.getName());
//				monster.setHp(monster.getHp() - damage);			
			}
			else {
				GUI.printTextArea(player.getName()+" have been slayed by the " + monster.getName());
				player.setHp(0);
				if (player.getHealingPotions() > 0) {
					//System.out.println("Do you want to use a potion? y/n ");
					String input = "";
					if (input.equalsIgnoreCase("y")) {
						player.restorHealt(player.getHealingPotions());
					}
					else {
						System.exit(0);
					}
				}
				else {
					System.exit(0);
				}
			}
			
			//damage = hitFor(monster.getMonsterAttackPoints() - player.getPlayerToughness());
			if (monster.isAlive()) {
				//System.out.printf("%s hits for %s damage to the hero %s%n",monster.getMonsterName() ,damage ,player.getName());
				player.setHp(player.getHp()-damage);
				
				}
				
				if (!player.isAlive()) {
						//System.out.printf("You have been slayed by the %s",monster.getMonsterName());
						player.setHp(0);
						if (player.getHealingPotions() > 0) {
							//System.out.println("Do you want to use a potion? y/n ");
							String input = "";
							if (input.equalsIgnoreCase("y")) {
								player.restorHealt(player.getHealingPotions());
							}
							else {
								System.exit(0);
							}
						}
						else {
							System.exit(0);
						}
					}
			
			
			else {
				//int coin = monster.monsterGiveCoin(player.getPlayerLuck());
				//System.out.printf("You have slayed the %s and getting %s experiens and %s coins "
				//		+ "%n",monster.getMonsterName(),monster.getMonsterGivenExp(),coin);
				//boolean magicFind = RandomClass.getMagicFind(player);
				boolean magicFind = false;
				if (magicFind) {
					//System.out.printf("The %s alsow drops a %s +%s%n",monster.getMonsterName(),item.getItemName(),item.getItemPoints());
					//System.out.printf("Do you want to use this %s? y/n ",item.getItemName());
					String input = "";
					if (input.equalsIgnoreCase("y")) {
						
					//	player.useItem(item.getItemName(),item.getItemPoints());
						
					}
				}
				//player.Experiens(monster.getMonsterGivenExp());
				//player.setCoins(player.getCoins() + coin);
			
			}
			
			if (monster.isAlive()) {
				System.out.printf("%s: Hp: %s\n",player.getName(),player.getHp());
				//System.out.printf("%s: Hp: %s\n",monster.getMonsterName(),monster.getMonsterHp());	
				System.out.printf("\nContinue fighting press Enter"
						+ "\nR. for run away "
						+ "\nH. to use healing Potion ("+player.getHealingPotions() +")\n");
				
				String input = "";
				if (input.equalsIgnoreCase("R")) {
					break;
				}
				else if (input.equalsIgnoreCase("H")) {
					do {
						player.restorHealt(player.getHealingPotions());
						if (player.getHealingPotions()>0) {
							System.out.println("Use more healing potion? y/n");
							input = "";
						}
						
					} while (input.equalsIgnoreCase("y"));
					
				}
			}
		
		} while (player.isAlive() && monster.isAlive());
	}

	private int hitFor(int d){
		
		if (d <= 0) {
			return 0;
		}
		else {
		int	damage = RandomClass.getInt(0, d);	
			if (damage <0) {
				damage = 0;
			}
			return damage;
		}
		
	}

	
	
}
