public class PoisonMatango extends Matango {
	String name;
	int poisonAttack;
	// int hp;
	// char suffix;
	// public Matango(char suffix) {
	// 	this.suffix = suffix;
	// }
	// public void attack(Hero h) {
	// 	System.out.println("キノコ" + this.suffix + "の攻撃");
	// 	System.out.println("10のダメージ");
	// 	h.hp -= 10;
	// }

	public PoisonMatango(char name) {
		super(name);
		this.poisonAttack = 5;
	}

	public void attack(Hero h) {
		super.attack(h);
		if (this.poisonAttack > 0) {
			System.out.println("さらに毒の胞子をばらまいた！");
			int poisonDamage = h.hp / 5;
			h.hp -= poisonDamage;
			System.out.println(poisonDamage + "ポイントのダメージ！");
			this.poisonAttack--;
		}
	}

}