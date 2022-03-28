package activities;

public class Car 
{

	String color;
	String transmission;
	int make;
	int tyres;
	int doors;
	
	Car()
	{
		tyres=4;
		doors=4;
	}
	
	public void displayCharacteristics() 
	{
		System.out.println("color of car is "+color);
		System.out.println("transmission of car is "+transmission);
		System.out.println("tyres of car are "+tyres);
		System.out.println("doors of car are "+doors);
		System.out.println("Car make is "+make);
	}
	public void accelarate()
	{
		System.out.println("Car is moving forward.");
	}
	public void brake()
	{
		System.out.println("Car has stopped");
	}
}
