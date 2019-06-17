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
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
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
