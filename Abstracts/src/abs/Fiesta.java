package abs;

public class Fiesta extends Car{
	
	public Fiesta() {
		super.name = "Fiesta";
	}

	@Override
	public void Topspeed() {
		System.out.println("231 km/h");
		
	}

	@Override
	public void Accel() {
		System.out.println("0-100 km/h in 6.5s");
		
	}

	@Override
	public void Weight() {
		System.out.println("1283 kg");
		
	}

}
