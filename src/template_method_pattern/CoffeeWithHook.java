package template_method_pattern;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class CoffeeWithHook extends CaffeineBeverage{

	@Override
	void brew() {
		// TODO Auto-generated method stub
		System.out.println("dripping coffee through filter");
	}

	@Override
	void addCondiments() {
		// TODO Auto-generated method stub
		System.out.println("adding sugar & milk");
	}

	public boolean customerWantsCondiments(){
		String answer=getUserInput();
		
		if (answer.toLowerCase().startsWith("y")){
			return true;
		}
		else {
			return false;
		}
	}
	
	private String getUserInput(){
		String answer=null;
		
		System.out.println("would you like milk and sugar with your coffee y/n ?");
		
		BufferedReader in=new BufferedReader(new InputStreamReader(System.in));
		try {
			answer=in.readLine();
		}
		catch (Exception e){
			System.out.println("error reading your answer");
		}
		
		if (answer==null) {
			return "no";
		}
		return answer;
	}
	
}
