package abstract_factory_pattern;

public class ShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String inputShape) {
		if (inputShape.equalsIgnoreCase("rectangle")){
			return new Rectangle();
		}
		else if(inputShape.equalsIgnoreCase("square")){
			return new Square();
		}
		return null;
	}
}
