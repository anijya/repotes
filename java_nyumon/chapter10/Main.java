public class Main {
	public static void main(String[] args) {
		System.out.println("hello, world!");

		Hero h1 = new Hero();
		SuperHero sh1 = new SuperHero();
		sh1.attack();

		PoisonMatango pm = new PoisonMatango('A');
		pm.attack(h1);
		System.out.println(sh1.hp);
		pm.attack(sh1);
		System.out.println(sh1.hp);
		pm.attack(sh1);
		System.out.println(sh1.hp);
		pm.attack(sh1);
		System.out.println(sh1.hp);
		pm.attack(sh1);
		System.out.println(sh1.hp);
		pm.attack(sh1);
		System.out.println(sh1.hp);
	}
}