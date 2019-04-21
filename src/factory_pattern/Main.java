package factory_pattern;

public class Main {
	
	public static void main(String args[]){
		PizzaStore nyPizzaStore=new NYPizzaStore();
		Pizza order1=nyPizzaStore.orderPizza("cheese");
		
		PizzaStore chicagoPizzaStore=new ChicagoPizzaStore();
		Pizza order2=chicagoPizzaStore.orderPizza("cheese");
	}

}
