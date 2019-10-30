package bikeproject;

public class BikeDriver {

	public static void main(String[] args) {
		
		RoadBike bike1 = new RoadBike();
		bike1.setPostHeight(20);
		RoadBike bike2 = new RoadBike("drop", "tourer", "semi-grip", "comfort", 14, 25, 18);		
		MountainBike bike3 = new MountainBike();
		Bike bike4 = new Bike();

		System.out.println(bike1.toString());
		System.out.println(bike2.toString());
		System.out.println(bike3.toString());
		System.out.println(bike4.toString());


		Bike myBikes[] = {bike1,bike2,bike3,bike4}; // polymorphism
		for (Bike b : myBikes) {
			System.out.println(b.toString()); // polymorphism

		}
	}//end method main

}//end class BikeDriver
