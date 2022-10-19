import java.util.Scanner;

public class CarLot 
{

	public static Vehicle addVehicle() {
		String vehicleType;
		int cityFE, hwyFE, seating;
		double cargoVolume;
		Scanner input = new Scanner(System.in);

		System.out.println("Select a vehicle type for the car lot. ");
		System.out.print("Car, Truck, or Minivan: ");
		vehicleType = input.nextLine();
		System.out.print("Enter the city fuel economy: ");
		cityFE = input.nextInt();
		System.out.print("Enter the highway fuel economy: ");
		hwyFE = input.nextInt();
		System.out.print("Enter the seating capacity: ");
		seating = input.nextInt();
		System.out.print("Enter the cargo volume: ");
		cargoVolume = input.nextInt();
		if (vehicleType.equalsIgnoreCase("C")) {
			return(new Car(cityFE, hwyFE, seating, cargoVolume));
		} 
		else if (vehicleType.equalsIgnoreCase("T")) {
			return(new Truck(cityFE, hwyFE, seating, cargoVolume));
		} 
		else {	//default to minivan
			return(new Minivan(cityFE, hwyFE, seating, cargoVolume));
		}
	}
	
	
	public static void main(String[] args) {
		Vehicle vehicle1, vehicle2, vehicle3;
		Scanner input = new Scanner(System.in);
		int vehicleChoice;
		String action;
		double fuel, distance, cargo;
		int passengers;

		/* add vehicles */
		vehicle1 = addVehicle();
		vehicle2 = addVehicle();
		vehicle3 = addVehicle();
		System.out.println("Three vehicles added to car lot.");

		System.out.print("Learn about the Cargo area, see a vehicle Description, or Quit? ");
		action = input.nextLine();
		while (!action.equalsIgnoreCase("Q")) {
			System.out.print("Which vehicle (1, 2, 3)? ");
			vehicleChoice = input.nextInt();
			input.nextLine();	//read end of line
			if (action.equalsIgnoreCase("C")) {
				if (vehicleChoice == 1) {
					System.out.println(vehicle1.cargoContainer());
				} else if (vehicleChoice == 2) {
					System.out.println(vehicle2.cargoContainer());
				} else {
					System.out.println(vehicle3.cargoContainer());
				}
			} else if (action.equalsIgnoreCase("D")) {
				if (vehicleChoice == 1) {
					System.out.println(vehicle1.description());
				} else if (vehicleChoice == 2) {
					System.out.println(vehicle2.description());
				} else {
					System.out.println(vehicle3.description());
				}
			}
			System.out.print("Learn about the Cargo area, see a vehicle Description, or Quit? ");
			action = input.nextLine();
		}
	}	

}
