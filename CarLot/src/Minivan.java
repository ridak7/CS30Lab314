
public class Minivan extends Vehicle
{
	public Minivan(int fECity, int fEHwy, int seating, double cargo)
	{
		super(fECity, fEHwy, seating, cargo);
	}
	
	public String cargoContainer()
	{
		String cargoArea;
		cargoArea = "The cargo hold is"+ super.getCargoVolume();
		return cargoArea;
	}
	
	public String description()
	{
		String van;
		
		van = "This minivan can seat "+super.getSeating() + "passengers.\n";
		van += "The cargo space volume is "+ super.getCargoVolume() + ".\n";
		van += "The fuel economy is "+super.getfECity()+ " city and  "+super.getfEHwy()+ "highway km.\n";
		
		return van;
	}
	

}
