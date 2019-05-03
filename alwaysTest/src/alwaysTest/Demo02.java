package alwaysTest;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "123";                   //实现包装类与基本数据类型之间转换
		int a1 = Integer.parseInt(s1);
		System.out.println(a1);
		int a2 = new Integer(s1);
		System.out.println(a2);
		
		String s2 = "3.14159" ;
		float b1 = Float.parseFloat(s2);
		System.out.println(b1);
		
		
		

	}

}
