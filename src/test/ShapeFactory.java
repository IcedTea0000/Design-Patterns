package test;

public class ShapeFactory {

	public static Shape getShape(String shapeInput){
		if (shapeInput.equalsIgnoreCase("circle")){
			return new Circle();
		}
		else if (shapeInput.equalsIgnoreCase("square")){
			return new Square();
		}
		else if (shapeInput.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}
		else {
			System.out.println("invalid shape input");
		}
		return null;
	}
}
