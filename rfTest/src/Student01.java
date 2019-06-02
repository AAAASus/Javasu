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
		Student01 s1 = new Student01("张三", 15);
		Student01 s2 = new Student01("李四", 16);
		Student01 s3 = new Student01("王五", 16);
		HashMap<Student01, String> hm = new HashMap<Student01, String>();
		hm.put(s1, "北京");
		hm.put(s2,"重庆");
		hm.put(s3,"上海");
		System.out.println("利用keyset方式 遍历MAP");
		Set<Student01> keys = hm.keySet();
		Iterator<Student01> it1 = keys.iterator();
		  while(it1.hasNext()) {
			  Student01 s = it1.next();
			  String values1 = hm.get(s);
			  System.out.println(s+"  "+values1);
		  }
		
	}


}
