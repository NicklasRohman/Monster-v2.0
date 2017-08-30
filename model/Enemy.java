package model;

public abstract class Enemy extends LivingEntity{

	private static String[] name01 = new String[20];
	private static String[] name02 = new String[20];	
	
	
	
	public Enemy(int hp,int attackPower,int defence,int level) {
		super("", hp, attackPower, defence,level);
		addNames();
		this.setName(nameGenerator());
	}

	private static String nameGenerator(){
		String name = name01[RandomClass.getInt(0, name01.length)] + name02[RandomClass.getInt(0, name02.length)];
		return name;
	}
	
	private void addNames() {
		name01[0] = "Kapten ";
		name01[1] = "Gnomen ";
		name01[2] = "Stefan ";
		name01[3] = "Lars ";
		name01[4] = "Orcen ";
		name01[5] = "Grimgor ";
		name01[6] = "Sauron ";
		name01[7] = "Spindeln ";
		name01[8] = "Draken ";
		name01[9] = "Trollet ";
		name01[10] = "Idioten ";
		name01[11] = "Prästen ";
		name01[12] = "Halvmannen ";
		name01[13] = "Fyllot ";
		name01[14] = "Bergakungen ";
		name01[15] = "Arne ";
		name01[16] = "Balder ";
		name01[17] = "Ulven ";
		name01[18] = "Hunden ";
		name01[19] = "Tomten ";

		
		name02[0] = "Rövskägg";
		name02[1] = "Korvballe";
		name02[2] = "Dödsnäven";
		name02[3] = "Orcbane";
		name02[4] = "Orcsson";
		name02[5] = "Karlsson";
		name02[6] = "Hammarskalle";
		name02[7] = "Drakeld";
		name02[8] = "Trollsson";
		name02[9] = "Halte";
		name02[10] = "Snedpung";
		name02[11] = "Halvröv";
		name02[12] = "Treballe";
		name02[13] = "Tuttlisa";
		name02[14] = "Snuskgubbe";
		name02[15] = "Dumskalle";
		name02[16] = "Stornäsan";
		name02[17] = "Ballslmackarn";
		name02[18] = "Skrumplever";
		name02[19] = "Snorstjärt";
	}
	
	public int generateGold() {
		return RandomClass.getInt(0, 20) * level;
	}
	
	public int generateXp() {
		return RandomClass.getInt(0, 20) * (level * 2);
	}
}
