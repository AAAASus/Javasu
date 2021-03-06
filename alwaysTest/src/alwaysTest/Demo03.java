package alwaysTest;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("—————————————————————————————（1）检查一个电话号码是否符合(0000)0000-0000——————————————————————————————");
		String str1="(0777)6216-5683";		      
		String re1 ="(\\(\\d{4}\\)\\d{4}-\\d{4})$" ;               	
		Pattern p1 = Pattern.compile(re1);    	    	
		Matcher m1 = p1.matcher(str1);    	
		if(str1.matches(re1)) {
			System.out.println("电话号码合法！");
			}
			else {
			System.out.println("电话号码不合法！");
			}                
		System.out.println();
		
		System.out.println("———————————————————————————————（2）将一个字符串中所有的ip地址打印出来———————————————————————————————");
		String str2="woaijava183.114.221.78wuwuwuwuwuwu11122";   
		String re="((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";
		Pattern p2 = Pattern.compile(re);
		Matcher m2 = p2.matcher(str2);
		while (m2.find()) {
			String result=m2.group();
			System.out.println(result);
			}
		System.out.println();
		
		System.out.println("—————————————————（3）将字符串中连续出现的字符压缩成一个。比如aaabbbccccd，压缩后变成abcd。—————————————————");
		String str3="aaabbbccccd";                   //
		String rs=str3.replaceAll("(.)(\\1)*", "$1");
		System.out.println(rs);
		System.out.println();
		
		System.out.println("—————————————————————————————（5）从控制台输入邮箱地址，验证是否为邮箱地址。—————————————————————————————");
		Scanner sc = new Scanner(System.in);
		String e = sc.nextLine();
		String re5 =  "[\\w]+@[\\w]+.[\\w]+";
		Pattern p5 = Pattern.compile(re5);
		Matcher m5 = p5.matcher(e);   
		if(e.matches(re5)) {
			System.out.println("邮箱地址合法！");
			}
			else {
			System.out.println("邮箱地址不合法！");
			}
		System.out.println();
		
		System.out.println("—————————————————————————（6）输入一个字符串，判断该字符串是否以abc结尾。—————————————————————————");
		Scanner sc6 = new Scanner(System.in);
		String s =sc6.nextLine();
		 String re6 = "abc$";
		 Pattern p6 = Pattern.compile(re6);
		 Matcher m6 = p6.matcher(s);
		if(m6.find()) {
			
				System.out.println("yes！");
		 }else {
			 System.out.println("no！");
		 }
		System.out.println();

		System.out.println("——————（8）将一个字符串中的所有整数提取出来，保存在一维数组中。比如”ae256dd—w348e6”，提取出256,348,6三个整数——————");
		int arr[] = new int[10];    
		String str8 = "ae256dd—w348e6";
		Pattern p8 = Pattern.compile("(\\d{1,3})");
		Matcher m8 = p8.matcher(str8);
		int i = 0;
		while (m8.find()) {
			int j = 0;
			j=Integer.parseInt(m8.group());
			arr[i]=j;
			i++;
		}
		for(int c=0;c<i;c++) {
			System.out.print(" "+arr[c]);
		}
		System.out.println();
		System.out.println();
		
		System.out.println("——————————————————————（9）文本替换：将字符串中所有的”pupel”替换为”pupil”。——————————————————————");
		String str9 = "1234 pupel whatis pupel ? pupel pupel aaabbb";
		Pattern p9 = Pattern.compile("pupel",Pattern.CASE_INSENSITIVE);
		Matcher m9 = p9.matcher(str9);
		StringBuffer buf = new StringBuffer();
		while (m9.find()) {
			m9.appendReplacement(buf,"pupil");
			}
		m9.appendTail(buf);
		System.out.println(buf);
		System.out.println();
		
		System.out.println("—————————————————————（10）从一个字符串中提取以%cxll=开头，右部是%的字符串（不包含%）。—————————————————————");
		String str10 = "%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11";
		String re10 = "%CXLL=.*?(?=%)";
		Pattern p10 = Pattern.compile(re10);
		Matcher m10 = p10.matcher(str10);
		while (m10.find()) {
			String result1=m10.group();
			System.out.println(result1);
			}
	}

}
