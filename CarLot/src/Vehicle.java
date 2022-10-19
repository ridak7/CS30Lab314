
public abstract class Vehicle 
{
	private int fuelEconomyCity;
	private int fuelEconomyHwy;
	private int seatingCapacity;
	private double cargoVolume;
	
	//constructor for creating a vehicle
	public Vehicle(int fECity, int fEHwy, int seating, double cargo)
	{
		fuelEconomyCity = fECity;
		fuelEconomyHwy = fEHwy;
		seatingCapacity = seating;
		cargoVolume = cargo;
		
	}
	//Accessor Methods for the Vehicle Class
	
	public int getfEHwy()
	{
		return(fuelEconomyHwy);
	}	
	public int getfECity()
	{
		return(fuelEconomyCity);
	}
	public int getSeating()
	{
		return(seatingCapacity);
	}
	public double getCargoVolume()
	{
		return(cargoVolume);
	}
	
	abstract String cargoContainer();
	
	abstract String description();
	
}
