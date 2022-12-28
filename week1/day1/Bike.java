package week1.day1;

public class Bike {
	public static void main(String[] args) {
		Car assign = new Car();
		Bike second = new Bike();
		assign.applyBreak();
		assign.soundHorn();
		second.driveBike();
		
	}
	
	private void driveBike() {
		System.out.println("Second Class");

	}

}
