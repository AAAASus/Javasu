package alwaysTest;

public class Demo01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "this is a test of java";
		char[] a = {1,2,3};
		StringBuffer sb = new StringBuffer(s);   //string对象与stringBuffer对象的相互转换
		
		sb.append("i").append("love").append("java");   //StringBuffer类的添加
		System.out.println(sb);
		

	}

}
