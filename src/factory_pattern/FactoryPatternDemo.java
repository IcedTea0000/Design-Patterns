package factory_pattern;

public class FactoryPatternDemo {

	public static void main(String args[]){
		Shape newRectangle=ShapeFactory.getShape("RECTANGLE");
	}
}
