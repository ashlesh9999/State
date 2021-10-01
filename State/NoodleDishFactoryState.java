package State;

public class NoodleDishFactoryState {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoodleDishFactory noodles=new NoodleDishFactory(true);
		
		System.out.println(noodles);
		
		noodles.slitterOff();
		System.out.println(noodles);

		noodles.slitterOn();
		System.out.println(noodles);

		noodles.makeDough();
		System.out.println(noodles);

		noodles.cool();
		System.out.println(noodles);
		
		
		noodles.makeDough();
		noodles.slitterOn();
		noodles.slitterOff();
		noodles.cool();
		System.out.println("Noodles are ready and sent for packaging");


	}

}
