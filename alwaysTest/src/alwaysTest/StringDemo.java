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
		System.out.println("�ַ�s���ֵĴ�����" + n);    //(1) ͳ�Ƹ��ַ�������ĸs���ֵĴ���
		
		System.out.println(s.substring(10,14));   //(2) ȡ�����ַ���"test"  //substring
	 
		System.out.println(s.toCharArray());     //(3) �����ַ������Ƶ�һ���ַ�����Char[] str��.// toCharArray
   }
}

