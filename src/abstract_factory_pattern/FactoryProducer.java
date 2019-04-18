package abstract_factory_pattern;

public class FactoryProducer {

	public static AbstractFactory getFactory(String inputFactory){
		if (inputFactory.equalsIgnoreCase("rounded")){
			return new RoundedShapeFactory();
		}
		else if(inputFactory.equalsIgnoreCase("")){
			return new ShapeFactory();
		}
		return null;
	}
}
