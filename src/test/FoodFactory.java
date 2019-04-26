package test;

public class FoodFactory {

	Food order;
	
	
	public Food orderFood(String name){
		if (name.equalsIgnoreCase("wing")) this.order=new ChickenWing();
		if (name.equalsIgnoreCase("leg")) this.order=new ChickenLeg();
		return order;
	}
	
}
