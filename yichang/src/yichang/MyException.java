package yichang;

public class MyException {

	class MyException1 extends Exception{
	int num;
	MyException1(int a){
		num = a;
	}
	public String toString() {
		return num+"<0\r\n值必须大于0";
	}
}

    class MyExceptionTest{
    	static void makeException(int a) throws MyException1{
		if(a<0)
			throw new MyException1(a);
		System.out.println("没有产生例外！");
	}
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		try {
			a=Integer.parseInt(args[0]);
			makeException(a);
			System.out.println("a="+a);
			
		}catch(MyException1 e) {
			System.out.println("\r\n"+e);
		}
		

	}

}
