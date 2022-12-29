package week1.day2;

public class IsPrime {
	
	//public static void main(String[] args) {

		//System.out.println(isprime(4));
		//System.out.println(isprime(20));
		//System.out.println(isprime(3));
		//System.out.println(isprime(27));
	//}

	//public static boolean isprime(int num)

	public static void main(String[] args) {
		
		int number=5;
		boolean prime = true;
		
		for (int i = 2; i < number; i++) {
			if (number%i==0) {
				prime = false;
				break;
			}
		}
		
		if (prime == false) {
			System.out.println(number + " " + "is not a prime number");
		}

		else {
			System.out.println(number + " " + "is a Prime Number");
		}
			
			
		}

}
