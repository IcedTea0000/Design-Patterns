package state_pattern;

public class SoldState implements State {

	GumballMachine gumballMachine;
	
	public SoldState(GumballMachine gumballMachine){
		this.gumballMachine=gumballMachine;
	}
	
	@Override
	public void insertQuarter() {
		// TODO Auto-generated method stub
		System.out.println("please wait...processing");
	}

	@Override
	public void ejectQuarter() {
		// TODO Auto-generated method stub
		System.out.println("sorry, you already turned the crank");
	}

	@Override
	public void turnCrank() {
		// TODO Auto-generated method stub
		System.out.println("turning twice doesn't get you another gumball");
	}

	@Override
	public void dispense() {
		// TODO Auto-generated method stub
		gumballMachine.releaseBall();
		if (gumballMachine.getCount()>0){
			gumballMachine.setState(gumballMachine.getNoQuarterState());
		}
		else 
		{
			System.out.println("oops, out of gumballs");
			gumballMachine.setState(gumballMachine.getSoldOutState());
		}
		System.out.println("========================");
	}
	
}
