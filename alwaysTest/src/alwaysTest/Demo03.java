package alwaysTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("������������������������������������������������������������1�����һ���绰�����Ƿ����(0000)0000-0000������������������������������������������������������������");
		String str1="(0777)6216-5683";		      
		String reg ="(\\d{4})\\d{4}-\\d{4}$" ;               	
		Pattern p1 = Pattern.compile(reg);    	    	
		Matcher m1 = p1.matcher(str1);    	
		boolean rs1 = m1.matches();    
		System.out.println(rs1);                    
		System.out.println();
		
		System.out.println("����������������������������������������������������������������2����һ���ַ��������е�ip��ַ��ӡ������������������������������������������������������������������");
		String str2="woaijava183.114.221.78wuwuwuwuwuwu11122";   
		String re="((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";
		Pattern p2 = Pattern.compile(re);
		Matcher m2 = p2.matcher(str2);
		while (m2.find()) {
			String result=m2.group();
			System.out.println(result);
			}
		System.out.println();
		
		System.out.println("������������������������������������3�����ַ������������ֵ��ַ�ѹ����һ��������aaabbbccccd��ѹ������abcd������������������������������������");
		String str3="aaabbbccccd";                   //
		String rs=str3.replaceAll("(.)(\\1)*", "$1");
		System.out.println(rs);
		System.out.println();
		
		System.out.println("��������������8����һ���ַ����е�����������ȡ������������һά�����С����硱ae256dd��w348e6������ȡ��256,348,6��������������������");
		int arr[] = new int[10];    
		String str8 = "ae256dd��w348e6";
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
		
		System.out.println("����������������������������������������������9���ı��滻�����ַ��������еġ�pupel���滻Ϊ��pupil������������������������������������������������");
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
		
		System.out.println("��������������������������������������������10����һ���ַ�������ȡ��%cxll=��ͷ���Ҳ���%���ַ�����������%����������������������������������������������");
		String str10 = "%...%CXLL=add1,31,123.12%CXLL=add2,32,124%CXLL=,33,125.12%LL=-121.11";
		String re1 = "%CXLL=.*?(?=%)";
		Pattern p10 = Pattern.compile(re1);
		Matcher m10 = p10.matcher(str10);
		while (m10.find()) {
			String result1=m10.group();
			System.out.println(result1);
			}
	}

}
