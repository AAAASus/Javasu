import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

class student implements Comparable {
	private int id;
	private String name;
	private double grade;
	public student(int id,String name,double grade) {
		this.id = id;
		this.name = name;
		this.grade = grade;
	}
	public String toString(){
		return "id="+id+"-"+"name="+name+"-"+"grade="+grade;
	}
	
@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		student s = (student) o;
		int  result = grade>s.grade?1:(grade==s.grade?0:-1);
		if(0==result) {
			result=name.compareTo(s.name);
		}
		return result;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<student> set = new TreeSet<student>();
		set.add(new student(01,"°¢Üç",80.5));
		set.add(new student(02,"°¢Çï",82.0));
		set.add(new student(03,"°¢æÃ",83.5));
		set.add(new student(03,"°¢æÃ",90.0));
		Iterator<student> it = set.iterator();
		

	}
	

}
