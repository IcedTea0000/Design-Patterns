package abstract_factory_pattern;

public class RoundedShapeFactory extends AbstractFactory {

	@Override
	public Shape getShape(String inputShape) {
		if (inputShape.equalsIgnoreCase("rectangle")){
			return new RoundedRectangle();
		}
		else if (inputShape.equalsIgnoreCase("square")){
			return new RoundedSquare();
		}
		return null;
	}

}
