import java.util.*;

class Student {
	private Integer id;
    private String name;
	public Student(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
}

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Student> set = new HashSet<>();
		Student student1 = new Student(1104103,"¼ÒæÃ");
		Student student2 = new Student(1104103,"¼ÒæÃ");
		set.add(student1);
		set.add(student2);
		set.forEach(student -> System.out.println(student));
	
	}

}
