package activities;

public class Activity1 {

	public static void main(String args[]) {
		Car objCar=new Car();
		objCar.color="Blue";
		objCar.transmission="automatic";
		objCar.make=2020;
		
		objCar.displayCharacteristics();
		objCar.accelarate();
		objCar.brake();
		
	}
}
