package alwaysTest;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("——————————①实现包装类与基本数据类型之间转换——————————");
		Boolean b = new Boolean(true);
		System.out.println(b);
		Boolean bb = true;
		System.out.println(bb);
		Byte bt = new Byte((byte)11);
		System.out.println(bt);
		Byte bbt = 11;
		System.out.println(bbt);
		Character c = new Character('a');
		System.out.println(c);
		Character cc = 'a';
		System.out.println(cc);
		Integer i = new Integer(99);
		System.out.println(i);
		Integer ii = 99;
		System.out.println(ii);
		
		
		System.out.println("——————————②实现基本数据类型与字符串之间相互转换—————————");
		String s1 = "123";                   
		int a1 = Integer.parseInt(s1);  //字符串转变为整型数据类型
		System.out.println(a1);
		int a2 = new Integer(s1);
		System.out.println(a2);
		
		String s2 = "3.14159" ;      //字符串转变为浮点型数据类型
		float b1 = Float.parseFloat(s2);
		System.out.println(b1);
		float b2 = new Float(s2);
		System.out.println(b2);
		
		int n = 100;                     //整型数据类型转变为字符串
		String strn = String.valueOf(n);
		System.out.println(strn);
		
		float f = 5.2f;                   //float数据类型转变为字符串
		String strf = String.valueOf(f);
		System.out.println(strf);
		
		
		System.out.println("————————————③实现包装类与字符串相互转换———————————");
		
		Integer i1 = new Integer(100);    //包装类转换为字符串
		String str1 = i1.toString(); 
		System.out.println(str1);
	}

}
