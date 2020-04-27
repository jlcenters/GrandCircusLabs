package lab12;

public class UsedCar extends Car{
	private double mileage;
	
	public double getMileage() {
		return mileage;
	}

	public void setMileage(double mileage) {
		this.mileage = mileage;
	}

	
	
	public UsedCar(String make,String model,int year,double price, double mileage) {
		super(make,model,year,price);
		this.mileage = mileage;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s %s * Year: %d * Price: $%-5.2f * Miles: %-5.2f", getMake(),getModel(),getYear(),getPrice(),mileage);
	}
	
}
