public class Main5_5 {
	public static void main(String[] args) {
		System.out.println("hello, world!");

		int[] array = {1, 2, 3};
		incArray(array);
		for (int i : array) {
			System.out.println(i);
		}
	}

	public static void incArray(int[] array) {
		for (int i = 0; i< array.length; i++) {
			array[i]++;
		}
	}

}