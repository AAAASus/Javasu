package alwaysTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("————从控制台输入一个yyyy-MM-dd（年月日）格式的日期字符串，再将这个日期加上七天，再用FormatStyle.MEDIUM格式输出这个日期。————");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        Scanner sc = new Scanner(System.in);                
        System.out.println("日期格式为(yyyy-MM-dd（年月日）)请输入:");
		String s = sc.nextLine();
		LocalDate cd = LocalDate.parse(s, formatter1);
		
		cd = cd.plusDays(7);
		System.out.println("当前日期的后七天为："+cd);
		
		System.out.println();
		System.out.println("————————————————————————使用java8的日期时间包获取当前系统时间，并以各种格式加以显示————————————————————————");
        LocalDateTime cdt = LocalDateTime.now();
		System.out.println("当前SHORT型日期时间为："+cdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT)));
		System.out.println("当前MEDIUM型日期时间为："+cdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)));
		System.out.println("当前LONG型日期时间为："+cdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG)));
	}

}
