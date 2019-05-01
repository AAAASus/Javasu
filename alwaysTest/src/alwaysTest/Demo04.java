package alwaysTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
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
		
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println();
		System.out.println("————————————————————————使用java8的日期时间包获取当前系统时间，并以各种格式加以显示————————————————————————");
        
		System.out.println("当前SHORT型日期时间为："+cdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT)));
		System.out.println("当前MEDIUM型日期时间为："+cdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)));
		System.out.println("当前LONG型日期时间为："+cdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG)));
		
		System.out.println();
		System.out.println("———————————使用java8的日期时间包获取当前系统时间，并修改这个时间（分别修改年份、月份、天、小时），然后打印结果———————————");
		
		LocalDateTime cdt1=cdt.plus(2,ChronoUnit.YEARS);        //修改年份
		System.out.println("两年后的时间为："+cdt1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
		
		LocalDateTime cdt4=cdt.plusHours(5);                    //修改小时
		System.out.println("五小时候的时间为："+cdt4.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG)));
	}

}
