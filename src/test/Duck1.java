package test;

public class Duck1 extends Duck {
	
	public Duck1(){
		this.quackBehavior=new Quack();
		this.flyBehavior=new FlyWithWing();
	}
	
	
	public static void main(String[] args){
		Duck duckTest=new Duck1();
		duckTest.performFly();
	}
	
}
