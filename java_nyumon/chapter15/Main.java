import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;

public class Main {
	public static void main(String[] args) throws Exception {
	// public static void main(String[] args)  {
		long start = System.currentTimeMillis();

		String s1 = "スッキリJava";
		String s2 = "Java";
		String s3 = "java";

		// 文字列比較
		// equals()
		// equalsIgnoreCase()
		if (s2.equals(s3)) {
			System.out.println("s2, s3は等しい");
		}
		if (s2.equalsIgnoreCase(s3)) {
			System.out.println("s2, s3は大文字小文字を区別しなければ等しい");
		}

		// 文字列の長さを調べる
		// length()
		// isEmpty()
		System.out.println("s1の長さは" + s1.length() + "です");
		if (s1.isEmpty()) {
			System.out.println("s1は長さは0です");
		}

		// StringBuilderを用いた文字列の連結
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < 10; i++) {
			sb.append(s2);
		}
		String s = sb.toString();
		System.out.println(s);

		// 文字列をchar配列に変換
		char[] cs = s.toCharArray();
		for (char value : cs) {
			// System.out.println(value);
			System.out.print(value);
		}

		// char配列を文字列に変換
		String sc = new String(cs);
		System.out.println(sc);

		// 文字列の書式整形
		// % XX1 XX2 XX3
		// XX1 , 0 - +
		// XX2 int
		// XX3 d s f b
		String format = "Name:%-9s Job:%-10s Gold:%,6d";
		String fs = String.format(format, "anijya", "joker", 100000);
		System.out.println(fs);

		long end = System.currentTimeMillis();
		System.out.println("処理にかかった時間は・・・" + (end - start) + "でした");
	
		// 現在時刻
		Date now = new Date();
		System.out.println(now);
		System.out.println(now.getTime());
		Date past = new Date(1600705425827L);
		System.out.println(past);

		// Date型を6つのintに変換、またその逆
		Calendar c = Calendar.getInstance();
		c.set(2022, 1, 1, 1, 1, 1);
		Date dc = c.getTime();
		System.out.println(dc);
		
		c.setTime(dc);
		int year = c.get(Calendar.YEAR);
		System.out.println(year);

		// Date型を文字列に変換、またその逆
		SimpleDateFormat f = new SimpleDateFormat("yyyy-MM-dd");
		Date fd = f.parse("2022-12-12");
		System.out.println(fd);

		Date datenow = new Date();
		String ds = f.format(datenow);
		System.out.println(ds);

		// java.timeを使用
		Instant i1 = Instant.now();
		Instant i2 = Instant.ofEpochMilli(1600705425827L);
		long l1 = i2.toEpochMilli();
		System.out.println("i1 " + i1);
		System.out.println("i2 " + i2);
		System.out.println("l1 " + l1);

		ZonedDateTime z1 = ZonedDateTime.now();
		ZonedDateTime z2 = ZonedDateTime.of(2022, 1, 2, 3, 4, 5, 6, ZoneId.of("Asia/Tokyo"));
		System.out.println("z1 " + z1);
		System.out.println("z2 " + z2);

		Instant i3 = z2.toInstant();
		ZonedDateTime z3 = i3.atZone(ZoneId.of("Europe/London"));

		System.out.println("i3 " + i3);
		System.out.println("z3 " + z3);

		if (z2.equals(z3)) {
			System.out.println("z2とz3は同じ瞬間を指している");
		}

		// LocalDateTime
		LocalDateTime lt1 = LocalDateTime.now();
		LocalDateTime lt2 = LocalDateTime.of(2022, 1, 2, 3, 4, 5, 6);

		ZonedDateTime lz1 = lt2.atZone(ZoneId.of("Europe/London"));
		LocalDateTime l3 = lz1.toLocalDateTime();

		System.out.println("lt1 " + lt1);
		System.out.println("lt2 " + lt2);
		System.out.println("lz1 " + lz1);
		System.out.println("l3 " + l3);

		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate ldate = LocalDate.parse("2022/12/12", fmt1);

		LocalDate ldatep = ldate.plusDays(1000);
		String str = ldatep.format(fmt1);

		System.out.println("ldate " + ldate);
		System.out.println("ldatep " + ldatep);
		System.out.println("str " + str);
	}
}