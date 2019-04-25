package state_pattern;

public class NoQuarterState implements State {

	GumballMachine gumballMachine;

	public NoQuarterState(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}

	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("quarter inserted");
		gumballMachine.setState(gumballMachine.getHasQuarterState());
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
		System.out.println("gumball rolling out...");
		System.out.println("========================");
	};
	

}
