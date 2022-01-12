import java.io.*;

public class Main {
	public static void main(String[] args) throws Exception {
		// try {
		// 	FileWriter writer = new FileWriter("aaa.txt");
		// 	writer.write("hello");
		// 	writer.close();
		// } catch (IOException e) {
		// 	System.out.println("Error: " + e.getMessage());
		// }
		String s = null;
		try {
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println("NullPointerException例外をcatchしました");
			System.out.println("==== スタックトレース（ここから）====");
			System.out.println(e.getStackTrace());
			System.out.println("==== スタックトレース（ここまで）====");
		}
		
		try {
			int i = Integer.parseInt("三");
		} catch (NumberFormatException e) {
			System.out.println("NumberFormatException例外をcatchしました");
			System.out.println("==== スタックトレース（ここから）====");
			System.out.println(e.getStackTrace());
			System.out.println("==== スタックトレース（ここまで）====");
		}

		throw new IOException();
	}
}