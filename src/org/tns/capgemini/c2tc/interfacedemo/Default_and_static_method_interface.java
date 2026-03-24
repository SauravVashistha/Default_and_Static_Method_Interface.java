package org.tns.capgemini.c2tc.interfacedemo;

// Corrected and Completed Code - Fully Runnable on Eclipse
// 1. Interface is unchanged (already correct)
// 2. Car6 class is unchanged (already correct)
// 3. Bike6 class is now fully implemented (was incomplete - missing body, constructor & method overrides)
// 4. Added a public test class with main() method so the code can be compiled and run directly in Eclipse

interface Vehicle6
{
	void start();
	void stop();
	int Max_speed = 120;
	
	default void repair()
	{
		System.out.println("Vehicle is being repaired");
	}
	
	static void checkMaintaince()
	{
		System.out.println("vehicle maintaince taken care here");
	}
}

class Car6 implements Vehicle6
{
	private String model;
	
	public Car6(String model)
	{
		this.model = model;
	}
	
	@Override
	public void start()
	{
		System.out.println("Car " + model + " is starting");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Car " + model + " is stopping");
	}
}

class Bike6 implements Vehicle6
{
	private String model;
	
	public Bike6(String model)
	{
		this.model = model;
	}
	
	@Override
	public void start()
	{
		System.out.println("Bike " + model + " is starting");
	}
	
	@Override
	public void stop()
	{
		System.out.println("Bike " + model + " is stopping");
	}
}

// Public class with main() method - required to run the program successfully in Eclipse
public class Default_and_static_method_interface
{
	public static void main(String[] args)
	{
		// Testing Car6
		Car6 c = new Car6("BMW");
		c.start();
		c.stop();
		c.repair();                    // calling default method from interface
		Vehicle6.checkMaintaince();    // calling static method from interface
		System.out.println("Max speed of vehicle = " + Vehicle6.Max_speed);
		
		System.out.println("-----------------------------------");
		
		// Testing Bike6
		Bike6 b = new Bike6("Pulsar");
		b.start();
		b.stop();
		b.repair();                    // calling default method from interface
		Vehicle6.checkMaintaince();    // calling static method from interface
	}
}
