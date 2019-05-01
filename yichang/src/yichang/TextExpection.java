package yichang;

class MyException extends Exception{
	public MyException(String s) {
		super(s);
	}
	public String toString(){
		return "Exception in thread\"main\":for input string:"+this.getMessage();
		}
}

class MyTool{
	public static int parseInt(String str) throws MyException{
		int result=0;
		for(int i=0;i<str.length();i++) {
			char ch = str.charAt(i);
			if(ch>='0'&&ch<='9')
				result = result*10+ch-'0';
			else throw new MyException(str);
		}
		return result;
	}
}

public class TextExpection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
