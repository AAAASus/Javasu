import java.util.ArrayList;
import java.util.List;

public class Student02 implements Comparable<Student02> {
	private int id;
	private String name;
	private double grade;
	
	public Student02(int id, String name, double grade) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "id=" + id + ", name=" + name + ", grade=" + grade;
	}

	@Override
	public int compareTo(Student02 o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student02> list = new ArrayList<Student02>();
		list.add(new Student02(01,"a",88.88));
		list.add(new Student02(02,"b",90.50));
		list.add(new Student02(03,"c",88.88));
		list.add(new Student02(01,"d",75.00));

	}

	
}
