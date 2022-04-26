
public class Car extends Vehicle{
	
	private int numDoors ;
	private int numPassengers;
	
	public Car(String aMake, String aModel, String aPlate, int doors, int passengers) {
		this.make = aMake;
		this.model = aModel;
		this.plate = aPlate;
		this.numDoors = doors;
		this.numPassengers = passengers;
	}
	
	public int getDoors() {
		return this.numDoors;
	}
	
	public int getPassengers() {
		return this.numPassengers;
	}
	
	@Override
	public String toString() {
		String result = String.format("%d-door %s %s with license %s", this.numDoors, this.make, this.model, this.plate);
		return result;
	}
	
	@Override
	public boolean equals(Object other) {
		if(!(other instanceof Vehicle)) {
			return false;
		}
		
		Car otherCar = (Car) other;
		
		if(this.numDoors == (otherCar.getDoors())) {
			if(this.numPassengers == (otherCar.getPassengers())) {
				if(super.equals(otherCar)) {
					return true;
				}
			}
		}
		
		return false;
	}
	
	public Car copy() {
		String aMake = super.getMake;
		String aModel = super.getModel;
		String aPlate = super.getPlate;
		int doors = this.numDoors;
		int passengers = this.numPassengers;
		
		Car theCopy = new Car(aMake, aModel, aPlate, doors, passengers);
		
		return theCopy;
	}
	
}