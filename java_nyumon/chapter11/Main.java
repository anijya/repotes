public class Main {
	public static void main(String[] args) {
		System.out.println("hello, world!");

		Computer cp = new Computer("raspi", 500, "white", "panasonic");

		System.out.println(cp.getMakerName());

		System.out.println(cp.getColor());

		cp.setWeight(20.0);

		System.out.println(cp.getWeight());

		System.out.println(cp.getName());

		System.out.println(cp.getPrice());

		System.out.println(1000000);
		String msg1 = "Hello";
		String msg2 = new String(msg1);
		System.out.println(msg1.equals(msg2));
		System.out.println("Hello" == "Hell");
		System.out.println("Hello" + a);

	}
}