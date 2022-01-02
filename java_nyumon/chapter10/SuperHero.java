public class SuperHero extends Hero {
	boolean flying;
	public void fly() {
		this.flying = true;
		System.out.println("飛び上がった！");
	}
	public void land() {
		this.flying = false;
		System.out.println("着地した");
	}

	public void attack() {
		System.out.println(this.name + "による会心の攻撃！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
		if (this.flying) {
			super.attack();
		}
	}
}