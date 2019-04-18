package composite_pattern;

public class CompositePatternDemo {

	public static void main(String[] args){
		Employee CEO=new Employee("John","CEO",30000);
		Employee headSales=new Employee("Robert","Head Sales",20000);
		Employee headMarketing=new Employee("Michael","Head Marketing",20000);
		
		CEO.add(headSales);
		CEO.add(headMarketing);
		
		System.out.println(CEO);
		
		for(Employee headEmployee:CEO.getSubordinates());
		
	}
}
