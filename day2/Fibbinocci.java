package week1.day2;

public class Fibbinocci {

	public static void main(String[] args) {
// Print Fibbinocci series for first 11 numbers
//0  1  1  2  3  5  8  13  21  34  55  89  1446
		int num1 = 0;
		int num2 = 1;
		
		
        System.out.println(num1);
        for (int i = 0; i < 11; i++) {
        	int sum=num1+num2;
			System.out.println(sum);
			num1=num2;
			num2=sum;
		}
		
		
	}
}
