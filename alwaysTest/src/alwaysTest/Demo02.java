package alwaysTest;

public class Demo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("����������������������ʵ�ְ�װ���������������֮��ת����������������������");
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
		
		
		System.out.println("����������������������ʵ�ֻ��������������ַ���֮���໥ת��������������������");
		String s1 = "123";                   
		int a1 = Integer.parseInt(s1);  //�ַ���ת��Ϊ������������
		System.out.println(a1);
		int a2 = new Integer(s1);
		System.out.println(a2);
		
		String s2 = "3.14159" ;      //�ַ���ת��Ϊ��������������
		float b1 = Float.parseFloat(s2);
		System.out.println(b1);
		float b2 = new Float(s2);
		System.out.println(b2);
		
		int n = 100;                     //������������ת��Ϊ�ַ���
		String strn = String.valueOf(n);
		System.out.println(strn);
		
		float f = 5.2f;                   //float��������ת��Ϊ�ַ���
		String strf = String.valueOf(f);
		System.out.println(strf);
		
		
		System.out.println("��������������������������ʵ�ְ�װ�����ַ����໥ת������������������������");
		
		Integer i1 = new Integer(100);    //��װ��ת��Ϊ�ַ���
		String str1 = i1.toString(); 
		System.out.println(str1);
	}

}