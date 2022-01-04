public class Wand {
	private String name;
	private double power;

	// public Wand(String name, double power) {
	// 	this.name = name;
	// 	this.power = power;
	// }

	public void setName(String name) {
		if (name.length() < 3) {
			throw new IllegalArgumentException("名前が短すぎます。");
		}
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setPower(double power) {
		if (!(0.5 <= power && power <= 100 )) {
			throw new IllegalArgumentException("増幅率は0.5以上100以下で設定してください。");
		}
		this.power = power;
	}

	public double getPower() {
		return this.power;
	}
}