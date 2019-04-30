package alwaysTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1="woaijava183.114.221.78wuwuwuwuwuwu11122";   //（2）将一个字符串中所有的ip地址打印出来
		String re="((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(str1);
		while (m.find()) {
			String result=m.group();
			System.out.println(result);
			}
		
		String str2="aaabbbccccd";                   //（3）将字符串中连续出现的字符压缩成一个。比如aaabbbccccd，压缩后变成abcd。
		String rs=str2.replaceAll("(.)(\\1)*", "$1");
		System.out.println(rs);




	}

}
