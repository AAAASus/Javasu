
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

	}

}
