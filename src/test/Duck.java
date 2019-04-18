package test;

public class Duck {
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	
	
	public void performQuack(){
		quackBehavior.quack();
	}
	
	public void performFly(){
		flyBehavior.fly();
		
	}
	
	public void swim(){
		System.out.println("swim method");
	}
	
	public void display(){
		System.out.println("display method");
	}
	
	
		
}
