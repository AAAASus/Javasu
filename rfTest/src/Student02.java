
public class Student02 implements Comparable<Student02> {
	private String name;
	private int id;
	private double grade;
	
	public Student02(String name, int id, double grade) {
		super();
		this.name = name;
		this.id = id;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "name=" + name + ", id=" + id + ", grade=" + grade;
	}

	@Override
	public int compareTo(Student02 o) {
		// TODO Auto-generated method stub
		return 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
}
