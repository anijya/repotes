public class Main4_2 {
	public static void main(String[] args) {
		System.out.println("hello, world!");
        
		// 配列作成１
		int[] scores;
		scores = new int[5];
		scores[1] = 10;
		System.out.println(scores[1]);


		// 配列作成２
		int[] scores2 = new int[5];

		// 配列作成３
		int [] scores3 = new int[] {10, 20, 30, 40, 50};

		// 配列作成４
		int [] scores4 = {10, 20, 30, 40, 50};


		for (int i = 0; i < scores.length; i++) {
			System.out.println(scores[i]);
		}

		for (int value : scores3) {
			System.out.println(value);
		}
	}
}