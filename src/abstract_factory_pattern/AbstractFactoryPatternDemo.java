package abstract_factory_pattern;

public class AbstractFactoryPatternDemo {

	public static void main(String args[]){
		AbstractFactory factory=FactoryProducer.getFactory("rounded");
		Shape roundedRectangle=factory.getShape("rectangle");
		roundedRectangle.draw();
	}
}
