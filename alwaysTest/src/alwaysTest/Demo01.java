package alwaysTest;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "this is a test of java";
		char[] a = {1,2,3};
		StringBuffer sb = new StringBuffer(s);   //string������stringBuffer������໥ת��
		
		sb.append("i").append("love").append("java");   //StringBuffer������
		System.out.println(sb);
		
		sb.delete(0,22);                 //StringBuffer���ɾ��
		System.out.println(sb);
		
		sb.insert(1," ");          //StringBuffer��Ĳ���
		sb.insert(6," ");
		System.out.println(sb);
		
		System.out.println(sb.reverse());   //StringBuffer��ķ�ת
		

	}

}
