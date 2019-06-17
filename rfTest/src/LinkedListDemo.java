import java.util.*;

public class LinkedListDemo {
	//实现队列
	LinkedList ll = new LinkedList();
	public void push(Object o) {
		ll.addFirst(o);
	}
	public Object pop() {
		return ll.removeFirst();
	}
	public Object peak() {
		return ll.getFirst();
	}
	public boolean empty(){
		return ll.isEmpty();
	}
	public int size(){
        return ll.size();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListDemo lld=new LinkedListDemo();
	        lld.push("12");
	        lld.push("13");
	        lld.push("14");
	        lld.push("15");
	 
	        while(lld.size()!=0){
	            System.out.println(lld.pop());
	        }
	  }


}
