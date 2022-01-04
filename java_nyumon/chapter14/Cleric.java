public class Cleric {

	String name;
	int hp;
	int mp;
	final static int MAX_HP = 50;
	final static int MAX_MP = 100;

	public void selfAid() {

		System.out.println(this.name + "はセルフエイドを唱えた！");

		this.mp -= 5;
		this.hp = this.MAX_HP;

		System.out.println("HPが最大まで回復した！");
	}

	public int pray(int sec) {
		// int heal_mp = new java.util.Random().nextInt(3) + sec;
		// this.mp += heal_mp;
		// if (this.mp > this.MAX_MP) {
		// 	int diff = this.mp - this.MAX_MP;
		// 	heal_mp -= diff;
		// 	this.mp = this.MAX_MP;
		// }

		System.out.println(this.name + "は" + sec + "秒間天に祈った！");

		int heal_mp = new java.util.Random().nextInt(3) + sec;
		int actual = Math.min(this.MAX_MP - this.mp, heal_mp);
		this.hp += actual;

		System.out.println("MPが" + actual + "回復した！");

		return actual;
	}
}