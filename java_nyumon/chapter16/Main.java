import java.util.ArrayList;

public class Main {
	public static void main(String[] args) throws Exception {
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(12);
		list.add(11);
		for (int value : list) {
			System.out.println(value);
		}
		ArrayList<String> str = new ArrayList<String>();
		str.add("a");
		str.add("b");
		str.add("c");
		System.out.println(str.get(0));
		System.out.println(str.size());
		System.out.println(str.indexOf("b"));
		System.out.println(str.set(1, "d"));
		System.out.println(str.indexOf("d"));
	}
}