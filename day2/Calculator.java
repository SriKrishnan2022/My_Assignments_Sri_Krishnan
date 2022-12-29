package week1.day2;

public class Calculator {

	public static void main(String[] args) {
		Calculator add = new Calculator();
		Calculator mul = new Calculator();
		Calculator div = new Calculator();
		int addtion = add.addThreeNumbers(1, 2, 3);
		System.out.println(addtion);
		int multiplication = mul.multiply(3, 3);
		System.out.println(multiplication);
		div.divide();
	}
	
	public int addThreeNumbers(int num1,int num2, int num3) {
		return num1+num2+num3;
	
	}
	
	public int multiply(int num1,int num2) {
		return num1*num2;
	
	}
	
	public void divide() {
		int num1 = 3;
		int num2 = 3;
		
		System.out.println(num1/num2);
		
	}

}
