public class Main5_1 {
	public static void main(String[] args) {
		System.out.println("hello, world!");

		int result = add(3, 4);
		System.out.println(result);
	}

	public static int add(int x, int y) {
		System.out.println("x + y = " + (x + y));
		return x + y;
	}

}