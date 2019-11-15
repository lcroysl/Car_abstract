package abs;

public class Main {
	
	public static void main(String[] args) {
		Car[] cars = {new Challenger(), new Porsche(), new Fiesta()};
		
		for(Car car : cars) {
			
			System.out.println(car.name);
			Car.car();
			car.Topspeed();
			car.Accel();
			car.Weight();
			System.out.println("");
			
		}
	}

}
