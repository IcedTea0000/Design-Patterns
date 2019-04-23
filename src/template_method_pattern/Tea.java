package template_method_pattern;

public class Tea extends CaffeineBeverage {

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("steeping the tea");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("adding lemon");
	}

	
	
}
