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
		System.out.println("���������ӿ���̨����һ��yyyy-MM-dd�������գ���ʽ�������ַ������ٽ�������ڼ������죬����FormatStyle.MEDIUM��ʽ���������ڡ���������");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        Scanner sc = new Scanner(System.in);                
        System.out.println("���ڸ�ʽΪ(yyyy-MM-dd�������գ�)������:");
		String s = sc.nextLine();
		LocalDate cd = LocalDate.parse(s, formatter1);
		
		cd = cd.plusDays(7);
		System.out.println("��ǰ���ڵĺ�����Ϊ��"+cd);
		
		System.out.println();
		System.out.println("������������������������������������������������ʹ��java8������ʱ�����ȡ��ǰϵͳʱ�䣬���Ը��ָ�ʽ������ʾ������������������������������������������������");
        LocalDateTime cdt = LocalDateTime.now();
		System.out.println("��ǰSHORT������ʱ��Ϊ��"+cdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT)));
		System.out.println("��ǰMEDIUM������ʱ��Ϊ��"+cdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)));
		System.out.println("��ǰLONG������ʱ��Ϊ��"+cdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG)));
	}

}
