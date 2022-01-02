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

	}
}