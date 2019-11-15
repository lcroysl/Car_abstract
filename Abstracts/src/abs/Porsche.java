package abs;

public class Porsche extends Car{
	
	public Porsche() {
		super.name = "Porsche";
	}
	

	@Override
	public void Topspeed() {
		System.out.println("339 km/h");
		
	}

	@Override
	public void Accel() {
		System.out.println("0-100 km/h in 3s");
		
	}

	@Override
	public void Weight() {
		System.out.println("1300 kg averaged");
		
	}


	
	


}
