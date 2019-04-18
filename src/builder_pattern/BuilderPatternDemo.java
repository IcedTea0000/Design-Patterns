package builder_pattern;

public class BuilderPatternDemo {

	public static void main(String[] args){
		MealBuilder mealBuilder=new MealBuilder();
		
		Meal vegMeal=mealBuilder.prepareVegMeal();
		vegMeal.showItems();
	}
}
