package alwaysTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="woaijava183.114.221.78wuwuwuwuwuwu11122";   //��2����һ���ַ��������е�ip��ַ��ӡ����
		String re="((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(str1);
		while (m.find()) {
			String result=m.group();
			System.out.println(result);
			}
		
		String str2="aaabbbccccd";                   //��3�����ַ������������ֵ��ַ�ѹ����һ��������aaabbbccccd��ѹ������abcd��
		String rs=str2.replaceAll("(.)(\\1)*", "$1");
		System.out.println(rs);
		
		int arr[] = new int[10];    //��8����һ���ַ����е�����������ȡ������������һά�����С����硱ae256dd��w348e6������ȡ��256,348,6��������
		String str3 = "ae256dd��w348e6";
		Pattern p1 = Pattern.compile("(\\d{1,3})");
		Matcher m1 = p1.matcher(str3);
		int i = 0;
		while (m1.find()) {
			int j = 0;
			j=Integer.parseInt(m1.group());
			arr[i]=j;
			i++;
		}
		for(int c=0;c<i;c++) {
			System.out.print(" "+arr[c]);
		}
	}

}
