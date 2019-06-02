import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Student01 implements Comparable<Student01>{
	private String name;
	private int age;
	
	public Student01(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}	
	@Override
	public String toString() {
		return  " name=" + name + " age=" + age ;
	}

	@Override
	public int compareTo(Student01 o) {
		// TODO Auto-generated method stub
		
			   Student01 stu = (Student01) o;
				int  result = compare(this.name,stu.name)?1:(age>stu.age?0:-1);
				if(0==result) {
					result=name.compareTo(stu.name);
				}
				return result;			
	}
	
	private boolean compare(String name2, String name3) {
		// TODO Auto-generated method stub
		return false;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	}


}
