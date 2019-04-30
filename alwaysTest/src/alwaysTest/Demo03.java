package alwaysTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Demo03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="woaijava183.114.221.78wuwuwuwuwuwu11122";
		String re="((2[0-4]\\d|25[0-5]|[01]?\\d\\d?)\\.){3}(2[0-4]\\d|25[0-5]|[01]?\\d\\d?)";
		Pattern p = Pattern.compile(re);
		Matcher m = p.matcher(str1);
		while (m.find()) {
			String result=m.group();
			System.out.println(result);
			}



	}

}
