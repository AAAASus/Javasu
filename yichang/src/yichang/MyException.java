package yichang;

class MyException1 extends Exception{
	int num;
	MyException1(int a){
		num = a;
	}
	public String toString() {
		return num+"<0\r\n值必须大于0";
	}
}

public class MyException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		try {
			
		}catch(MyException1 e) {
			System.out.println("\r\n"+e);
		}
		

	}

}
