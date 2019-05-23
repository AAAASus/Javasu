import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class student {
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
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<student> set = new TreeSet<student>();
		set.add(new student(01,"∞¢‹Á",80.5));
		set.add(new student(02,"∞¢«Ô",82.0));
		set.add(new student(03,"∞¢Ê√",83.5));
		set.add(new student(03,"∞¢Ê√",78.0));
		Iterator<student> it = set.iterator();

	}

}
