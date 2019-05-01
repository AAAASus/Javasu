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
		System.out.println("���������ӿ���̨����һ��yyyy-MM-dd�������գ���ʽ�������ַ������ٽ�������ڼ������죬����FormatStyle.MEDIUM��ʽ���������ڡ���������");
		DateTimeFormatter formatter1 = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);
        Scanner sc = new Scanner(System.in);                
        System.out.println("���ڸ�ʽΪ(yyyy-MM-dd�������գ�)������:");
		String s = sc.nextLine();
		LocalDate cd = LocalDate.parse(s, formatter1);
		
		cd = cd.plusDays(7);
		System.out.println("��ǰ���ڵĺ�����Ϊ��"+cd);
		
		LocalDateTime cdt = LocalDateTime.now();
		System.out.println();
		System.out.println("������������������������������������������������ʹ��java8������ʱ�����ȡ��ǰϵͳʱ�䣬���Ը��ָ�ʽ������ʾ������������������������������������������������");
        
		System.out.println("��ǰSHORT������ʱ��Ϊ��"+cdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.SHORT,FormatStyle.SHORT)));
		System.out.println("��ǰMEDIUM������ʱ��Ϊ��"+cdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.MEDIUM,FormatStyle.MEDIUM)));
		System.out.println("��ǰLONG������ʱ��Ϊ��"+cdt.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG,FormatStyle.LONG)));
		
		System.out.println();
		System.out.println("����������������������ʹ��java8������ʱ�����ȡ��ǰϵͳʱ�䣬���޸����ʱ�䣨�ֱ��޸���ݡ��·ݡ��졢Сʱ����Ȼ���ӡ�������������������������");
		
		LocalDateTime cdt1=cdt.plus(2,ChronoUnit.YEARS);        //�޸����
		System.out.println("����������ʱ��Ϊ��"+cdt1.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
		
		LocalDateTime cdt2=cdt.plusMonths(3);                  //�޸��·�
		System.out.println("�����º������ʱ��Ϊ��"+cdt2.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
		
		LocalDateTime cdt3=cdt.plusDays(-10);                //�޸�����
		System.out.println("ǰ10�������ʱ��Ϊ��"+cdt3.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
		
		LocalDateTime cdt4=cdt.plusHours(5);                    //�޸�Сʱ
		System.out.println("��Сʱ�������ʱ��Ϊ��"+cdt4.format(DateTimeFormatter.ofLocalizedDateTime(FormatStyle.LONG)));
	}

}
