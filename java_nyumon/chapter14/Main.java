import java.util.Date;
import java.time.Instant;


public class Main {
	public static void main(String[] args) {
		// Account a = Account();
		long start = System.currentTimeMillis();
		Date d = new java.util.Date();
		System.out.println(d);
		// Clock c = new java.time.Clock();
		Instant i = java.time.Instant.now();
		System.out.println(i);
	}
}