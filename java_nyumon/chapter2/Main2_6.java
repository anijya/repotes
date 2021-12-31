public class Main2_6 {
	public static void main(String[] args) {
		System.out.println("hello, world!");
        System.out.println("照すt\"");
		System.out.print("改行無ver"); // 改行無
		int a = 10;
		int b = 30;
		int m = Math.max(a, b); // 大きさ比較
		System.out.println(m);

		// 文字列を数値に変換
		String c = "22";
		int n = Integer.parseInt(c);
		System.out.println(n + 15);
		System.out.println("++n：" + ++n);

		// ランダムな数値
		int d = new java.util.Random().nextInt(10);
		System.out.println("ランダムな値d：" + d);

		// 文字列入力
		System.out.println("文字を入力してください");
		String e = new java.util.Scanner(System.in).nextLine();

		// 数字入力
		System.out.println("数字を入力してください");
		int f = new java.util.Scanner(System.in).nextInt();

		System.out.println("文字列：" + e + "  数字：" + f);
	}
}