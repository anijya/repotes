public class Main {
	public static void main(String[] args) {
		System.out.println("hello, world!");

		// Sword s = new Sword();
		// s.name = "炎の剣";
		// s.damage = 10;
		Hero h1 = new Hero();
		h1.name = "あにじゃ";
		// h1.hp = 100;
		// h.sword = s;
		// System.out.println("現在の武器は" + h.sword.name);

		Hero h2 = new Hero();
		h2.name = "アサカ";
		// h2.hp = 100;

		Hero h3 = new Hero();

		Hero h4 = new Hero("ダクネス");

		Wizard w1 = new Wizard();
		w1.name = "めぐみん";
		w1.hp = 50;
		w1.heal(h1);
		w1.heal(h2);
		w1.heal(h3);
		w1.heal(h4);
	}
}