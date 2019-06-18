import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class VoteDemo {
	private int id;
	private String name;
	private int vote = 0;
	

	public VoteDemo(int id, String name, int vote) {
		super();
		this.id = id;
		this.name = name;
		this.vote = vote;
	}
	
	@Override
	public String toString() {
		return "VoteDemo [id=" + id + ", name=" + name + ", vote=" + vote + "]";
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<VoteDemo> list = new ArrayList<VoteDemo>();
		list.add(new VoteDemo(01,"°¢Üç",0));
		list.add(new VoteDemo(02,"½ðÇï",0));
		list.add(new VoteDemo(03,"¼ÒæÃ",0));
		//Iterator<VoteDemo> it = list.iterator();
		//it.forEachRemaining(v->System.out.println(v));
		

	}

}
