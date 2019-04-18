package alwaysTest;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "this is a test of java";
		int n=0;
		for(int i=0;i<s.length();i++) {   //(1) 统计该字符串中字母s出现的次数
			if(s.charAt(i)=='s'){
				n++;
			}
			
		}
		System.out.println("字符s出现的次数：" + n);
   }
}

