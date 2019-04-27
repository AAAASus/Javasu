package alwaysTest;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "this is a test of java";
		int n=0;
		for(int i=0;i<s.length();i++) {   
			if(s.charAt(i)=='s'){
				n++;
			}
			
		}
		System.out.println("字符s出现的次数：" + n);    //(1) 统计该字符串中字母s出现的次数
		
		System.out.println(s.substring(10,14));   //(2) 取出子字符串"test"  //substring
	 
		System.out.println(s.toCharArray());     //(3) 将本字符串复制到一个字符数组Char[] str中.// toCharArray
		
		StringBuffer buf = new StringBuffer();  

 
        Pattern p = Pattern.compile("\\b\\w");  
        Matcher m = p.matcher(s);
        
        while (m.find()) {                      //(4) 将字符串中每个单词的第一个字母变成大写， 输出到控制台。//用正则表达式
            m.appendReplacement(buf, m.group().toUpperCase());
        }
        m.appendTail(buf);
        System.out.println(buf);
        
        
        StringBuffer buf1 = new StringBuffer();  //(5) 用StringBuffer方式实现该字符串的倒序输出。(用和for循环方式分别实现)
        buf1.append(s);
        System.out.println(buf1.reverse());
        
       for(int i=s.length()-1;i>=0;i--) {     //(5) 用for方式实现该字符串的倒序输出。
        	
        	System.out.print(s.charAt(i));
        }
       
        
	}
}

