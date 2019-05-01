package alwaysTest;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Scanner;

public class Demo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        Scanner sc = new Scanner(System.in);
        System.out.println("日期格式为(yyyy-MM-dd（年月日）)请输入:");
		String s = sc.nextLine();
		LocalDate cd = LocalDate.parse(s, formatter1);
		
		cd = cd.plusDays(7);
		System.out.println("当前日期的后七天为："+cd);

	}

}
