class Vehicle
{
    void run()
    {
        System.out.println("Vehicle is running");
    }
}

public class Bike extends Vehicle
{
	public static void main(String[] args) {
		//System.out.println("Hello World");
		Bike b=new Bike();
		b.run();
	}
}
