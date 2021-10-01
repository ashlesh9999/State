package State;

public class SlitterOnState implements State{
	NoodleDishFactory noodles;
	public SlitterOnState(NoodleDishFactory noodles) {
		this.noodles=noodles;
		// TODO Auto-generated constructor stub
	}

	@Override
	public void MakeDough() {
		// TODO Auto-generated method stub
		System.out.println("Dough is already prepared.");
		
	}

	@Override
	public void slitterOn() {
		// TODO Auto-generated method stub
		System.out.println("Slitter is already turned on");
		
	}

	@Override
	public void slitterOff() {
		// TODO Auto-generated method stub
		if(noodles.doughAvailable) {
			System.out.println("Dough is being prepared.");			
		}else {
			System.out.println("Dough is not available");
			
		}
		
	}

	@Override
	public void Cool() {
		// TODO Auto-generated method stub
		System.out.println("Noodles are in cooling state.");
		
	}
	
	public String toString() {
		return "Slitter is turned on.";
	}

}
