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
		//创建苹果对象并放到苹果数组里
		Apple a1 = new Apple("red",5.00);     
		Apple a2 = new Apple("green",10.00);
		Apple a3 = new Apple("blue",8.00);
		Apple a4 = new Apple("yellow",9.00);
		Apple[] a = new Apple[4]; 
		

	}

}
