import java.util.*;

public class LinkedListDemo {
/*	//ʵ�ֶ���
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
		System.out.println("����������������ʵ�ֶ��С�������������������");
		LinkedListDemo lld=new LinkedListDemo();
	        lld.push("12");
	        lld.push("13");
	        lld.push("14");
	        lld.push("15");
	 
	        while(lld.size()!=0){
	            System.out.println(lld.pop());
	        }
	  }
*/
	//ʵ�ֶ�ջ
	LinkedList<Object> link = new LinkedList();
	public void myAdd(Object obj){
        link.addFirst(obj);
    }
    public Object myGet(){
        return link.removeLast();
    }
 
    public boolean isNull(){
        return link.isEmpty();
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
			System.out.println("����������������ʵ�ֶ�ջ��������������������");
			LinkedListDemo lld = new LinkedListDemo();
	        lld.myAdd("zhangsan");
	        lld.myAdd("lisi");
	        lld.myAdd("wangwu");
	        lld.myAdd("zhaoqi");
	        while (!lld.isNull())
	        {
	            System.out.println(lld.myGet());
	        }
	}

}
