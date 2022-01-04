public class Wizard {
	private int hp;
	private int mp;
	private String name;
	private Wand wand;

	public void heal(Hero h) {
		int basePoint = 10;
		int recovPoint = (int) (basePoint * this.wand.getPower());
		h.setHp(h.getHp() + recovPoint);
		System.out.println(h.getName() + "のHPを" + recovPoint + "回復した！");
	}

	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎます。");
		}
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setHp(int hp) {
		if (hp < 0) {
			System.out.println("0未満が入力されたため、0を設定しました。\n");
			this.hp = 0;
		} else {
			this.hp = hp;
		}
	}

	public int getHp() {
		return this.hp;
	}

	public void setMp(int mp) {
		if (hp < 0) {
			throw new IllegalArgumentException("0以上を設定してください。");
		}
		this.mp = mp;
	}

	public int getMp() {
		return this.mp;
	}

	public void setWand(Wand wand) {
		if (wand == null) {
			throw new IllegalArgumentException("正しい杖を設定してください。");
		}
		this.wand = wand;
	}

}