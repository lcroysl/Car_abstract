package abs;

public class Challenger extends Car{
	
	public Challenger() {
		super.name = "Challenger";
	}
	

	@Override
	public void Topspeed() {
		System.out.println("292 km/h");
		
	}

	@Override
	public void Accel() {
		System.out.println("0-100 km/h in 3.5s");
		
	}

	@Override
	public void Weight() {
		System.out.println("1900 kg averaged");
		
	}


	
	

}
