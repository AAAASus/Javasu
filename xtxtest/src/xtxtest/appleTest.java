package xtxtest;

import java.util.function.Consumer;


class Apple{
	String color;
	double weight;
	public Apple(String color,double weight) {
		this.color = color;
		this.weight = weight;
	}
}

class test{
	public static void ConsumerApple(Apple[] apps,Consumer<Apple> c){
		 for(Apple app:apps){
			 c.accept(app);
		 }
	 }
}

public class appleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
