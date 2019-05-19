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
		Apple[] app = new Apple[4]; 
		app[0] = a1;
		app[1] = a2;
		app[2] = a3;
		app[3] = a4;
		System.out.println("——————————第一次调用：使用lambda形式调用——————————");
		test.ConsumerApple(app, (Apple apps)->System.out.println(apps.color+"--"+apps.Weight));
		

	}

}
