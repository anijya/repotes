import java.util.Date;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.time.*;
import java.time.format.*;

public class Main15_9 {
	public static void main(String[] args) throws Exception {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i <= 100; i++) {
			sb.append(i + ",");
		}
		String[] a = sb.toString().split(",");
		System.out.println(sb);
		for (String value : a) {
			System.out.println(value);
		}

		// .*
		// ^A\d\d?
		// U[A-Z]{1,3}
		String string = "A2";
		System.out.println(string.matches("^A[0-9][0-9]?"));

		Date now = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(now);
		int day = cal.get(Calendar.DAY_OF_MONTH);
		int day100 = day + 100;
		cal.set(Calendar.DAY_OF_MONTH, day100);
		Date date100 = cal.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("西暦yyyy年MM月dd日");
		String date100String = fmt.format(date100);
		System.out.println(date100String);

		LocalDate lnow = LocalDate.now();
		LocalDate lnow100 = lnow.plusDays(100);
		DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("西暦yyyy年MM月dd日");
		String lnow100String = lnow100.format(fmt1);
		System.out.println(lnow100String);

		System.out.println(join("C:\\aaa\\", "aaa.txt"));
	}

	public static String join(String folder, String file) {
		// boolean matches = folder.matches("[a-zA-Z]:[\\.+]+\\?");
		if (!(folder.matches("\\$"))) {
			folder += "\\";
		}
		return folder + file;
	}
}