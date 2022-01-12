import java.util.List;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        double double2 = 25.0;
        System.out.println(Math.sqrt(double2));

        String[] list = {"1", "2"};
        System.out.println(list);
        // Listに変換
        System.out.println(Arrays.asList(list));
        System.out.println(Arrays.asList(list) instanceof ArrayList);
        System.out.println(Arrays.asList(list) instanceof List);

        // Listに変換
        List<String> list2 = new ArrayList<String>(Arrays.asList(list));
        List<Integer> list3 = Arrays.asList(new Integer[] {1, 2, 3});
        // list2.sort((a, b) -> aa(a, b));
        list3.sort((a, b) -> aa(a, b));
        // list3.sort((a, b) -> a.compareTo(b));
        System.out.println(list3);
    }

    public static int aa(int a, int b) {
        if (a == 2) {
            return -1;
        }
        return 1;
    }
}