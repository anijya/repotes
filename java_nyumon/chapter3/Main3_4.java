public class Main3_4 {
	public static void main(String[] args) {
		String a = "c";
		if (a.equals("a")) {
			System.out.println("合ってるよ");
		}
		switch (a) {
			case "a":
				System.out.println("aだね");
				break;
			case "b":
				System.out.println("bだよ");
				break;
			default:
				System.out.println("どれにもマッチしていないねえ");
		}
		int i = 20;
		System.out.println("whileの結果");
		while (i > 10) {
			System.out.println("iの数字は" + i);
			i--;
		}
		System.out.println("forの結果");
		for (; i > 0; i--) {
			System.out.println("iの数字は" + i);
		}
	}
}