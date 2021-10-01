package State;

public class CoolState implements State{
	
	NoodleDishFactory noodles;
	public CoolState(NoodleDishFactory noodles) {
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
		// TODO Auto-generated method stub
		System.out.println("Slitter is turned off and waiting for dough");
		
	}

	@Override
	public void Cool() {
		// TODO Auto-generated method stub
		System.out.println("Noodles are cooling at 100 degrees celsius");
		
	}
	
	public String toString() {
		return "Noodles are cooled at 100 degree celsius";
	}

}
