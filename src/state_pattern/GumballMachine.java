package state_pattern;

public class GumballMachine {
	
	State soldOutState;
	State noQuarterState;
	State hasQuarterState;
	State soldState;
	
	State state=soldOutState;
	int count=0;
	
	public GumballMachine(int numberGumballs){
		soldOutState=new SoldOutState(this);
		noQuarterState=new NoQuarterState(this);
		hasQuarterState=new HasQuarterState(this);
		soldState=new SoldState(this);
		
		this.count=numberGumballs;
		if (numberGumballs>0){
			state=noQuarterState;
		}
	}
	
	public void setState(State state){
		this.state=state;
	}
	
	public State getSoldOutState() {
		return soldOutState;
	}

	public State getNoQuarterState() {
		return noQuarterState;
	}

	public State getHasQuarterState() {
		return hasQuarterState;
	}

	public State getSoldState() {
		return soldState;
	}

	public State getState() {
		return state;
	}

	public int getCount() {
		return count;
	}

	public void insertQuarter(){
		state.insertQuarter();
	}
	
	public void ejectQuarter(){
		state.ejectQuarter();
	}
	
	public void turnCrank(){
		state.turnCrank();
		state.dispense();
	}
	
	void getState(State state){
		this.state=state;
	}
	
	void releaseBall(){
		System.out.println("Gumball rolling out...");
		if (count!=0){
			count--;
		}
	}

}
