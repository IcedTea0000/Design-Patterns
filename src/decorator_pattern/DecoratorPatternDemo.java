package decorator_pattern;

public class DecoratorPatternDemo {

	public static void main(String[] args){
		Shape circle=new Circle();
		Shape redCircle=new RedShapeDecorator(new Circle());
		
		redCircle.draw();
		
	}
	
}
