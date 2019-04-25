package state_pattern;

public class SoldOutState implements State {

	GumballMachine gumballMachine;
	
	public SoldOutState(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("gumball sold out");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("quarter ejected");

	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("crank turned");

	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		System.out.println("gumball sold out");
		System.out.println("========================");

	}
	
	
	
}
