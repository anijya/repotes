public class Main5_8 {
	public static void main(String[] args) {
		System.out.println("hello, world!");

		introduceOneself();

		email("当選しました！", "a@yahoo.co.jp", "iPhoneが当たりました！");

		email("a@yahoo.co.jp", "iPhoneが当たりました！");

		System.out.println(calcTraiangleArea(10.0, 5.0));

		System.out.println(calcCircleArea(5.0));


	}
	public static void introduceOneself() {
		String name = "Takashi";
		int age = 22;
		double height = 180.0;
		char zodiac = '兎';
		System.out.println("私の名前は" + name + "です。");
		System.out.println("私の年齢は" + age + "です。");
		System.out.println("私の身長は" + height + "です。");
		System.out.println("私の十二支は" + zodiac + "です。");
	}

	public static void email(String title, String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:" + title);
		System.out.println("本文:" + text);
	}
	public static void email(String address, String text) {
		System.out.println(address + "に、以下のメールを送信しました");
		System.out.println("件名:無題");
		System.out.println("本文:" + text);
	}
	public static double calcTraiangleArea(double bottom, double height) {
		return bottom * height / 2.0;
	}
	public static double calcCircleArea(double radius) {
		return radius * radius / 3.14;
	}
}