import java.util.ArrayList;
import java.util.HashMap;
import java.util.*;

public class Main_16_8 {
	public static void main(String[] args) throws Exception {
		ArrayList<Hero> list = new ArrayList<Hero>();
		list.add(new Hero("齋藤"));
		list.add(new Hero("鈴木"));
		for (Hero hero : list) {
			System.out.println(hero.getName());
		}
		Map<Hero, Integer> map = new HashMap<Hero, Integer>();
		map.put(list.get(0), 3);
		map.put(list.get(1), 3);
		for (Hero key : map.keySet()) {
			System.out.println(key.getName() + "が倒した敵=" + map.get(key));
		}
	}
}