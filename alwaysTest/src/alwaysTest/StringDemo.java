package alwaysTest;

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
   }
}

