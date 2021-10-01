package State;

public class SlitterOffState implements State{
	NoodleDishFactory noodles;
	public SlitterOffState(NoodleDishFactory noodles) {
		// TODO Auto-generated constructor stub
		this.noodles=noodles;
	}

	@Override
	public void MakeDough() {
		// TODO Auto-generated method stub
		if(noodles.doughAvailable) {
			System.out.println("Dough is being prepared.");			
		}else {
			System.out.println("Dough is not available");
		}
		
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
		return "Slitter is turned off.";
	}
}
