
public class Truck extends Vehicle
{

	public Truck(int fECity, int fEHwy, int seating, double cargoHold) 
	{
		super(fECity, fEHwy, seating, cargoHold);
		
	}
	
	public String cargoContainer()
	{
		String cargoArea;
		cargoArea = "The cargo hold space is "+ super.getCargoVolume();
		return cargoArea;
	}
	
	public String description()
	{
		String truck;
		
		truck = "This truck can seat "+super.getSeating() + "passengers.\n";
		truck += "The cargo hold has a volume of"+ super.getCargoVolume() + ".\n";
		truck += "The fuel economy is "+super.getfECity()+ " city and  "+super.getfEHwy()+ "highway km.\n";
		
		return truck;
	}
	


}
