public class Main {
	public static void main(String[] args) {
		Hero h1 = new Hero();
		Wand wa = new Wand();
		wa.setName("まほうのつえ");
		wa.setPower(100);
		Wizard w1 = new Wizard();
		String name = "anijya";
		System.out.println(name.length());
		w1.setName("anijya");
		w1.setHp(100);
		w1.setMp(50);
		w1.setWand(wa);
		w1.heal(h1);
	}
}