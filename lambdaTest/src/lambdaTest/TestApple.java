package lambdaTest;

import java.util.function.Consumer;

class Apple{
	String color;
	double Weight;
	public Apple(String color,double weight){
		this.color = color;
		this.Weight = weight;
	}
}

class test{
	public static void ConsumerApple(Apple[] apps,Consumer<Apple> c){
		 for(Apple app:apps){
			 c.accept(app);
		 }
	 }

}

public class TestApple {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
