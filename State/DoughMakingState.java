package State;

public class DoughMakingState implements State{
	NoodleDishFactory noodles;
	public DoughMakingState(NoodleDishFactory noodles) {
		this.noodles=noodles;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void MakeDough() {
		// TODO Auto-generated method stub
		System.out.println("Dough is prepared.");
		
	}

	@Override
	public void slitterOn() {
		// TODO Auto-generated method stub
		System.out.println("Slitter is turned on.");
		
	}

	@Override
	public void slitterOff() {
		System.out.println("Slitter is turned off.");
		
	}

	@Override
	public void Cool() {
		System.out.println("Noodles are in cooling State.");
		
	}

	public String toString() {
		return "Dough is prepared.";
	}
}
