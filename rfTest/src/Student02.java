import java.util.*;

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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public int compareTo(Student02 o) {
		// TODO Auto-generated method stub
		//if(this.getGrade()>o.getGrade()) {
		//	return 1;
		//}
		if(this.getId()>o.getId()) {
			return 1;
		}
		return -1;
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Student02> list = new ArrayList<Student02>();
		list.add(new Student02(01,"a",88.88));
		list.add(new Student02(02,"b",90.50));
		list.add(new Student02(03,"c",88.88));
		list.add(new Student02(01,"d",75.00));
		Collections.sort(list);
		Iterator<Student02> it = list.iterator();
		//Iterator的next方法输出List中的元素
		//while(it.hasNext()) {
		//	Student02 s = it.next();
		//	System.out.println(s);
		//}
		//使用Iterator的forEachRemaining方法输出
		it.forEachRemaining(stu->System.out.println(stu));

	}



	
}
