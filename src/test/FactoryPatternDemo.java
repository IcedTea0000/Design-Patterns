package test;

public class FactoryPatternDemo {

	public static void main(String args[]){
		Shape newRectangle=ShapeFactory.getShape("RECTANGLE");
	}
}
