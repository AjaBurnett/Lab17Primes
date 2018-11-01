

import java.util.ArrayList;

import java.util.Scanner;



public class PrimeNumbers {
	
	public static void main (String [] args) {

	
	int status = 1;
	int num = 2;
	int x;
	ArrayList<Integer> primeNums = new ArrayList<>();{

////	@Test
//		void  factors2() {
//			
//			List<Integer>list = new ArrayList<>(Arrays.asList(2));
//			assertEquals(PrimeFactors.factorsOf(2),list);
//		}


		
		for (int i = 1; i <= 100;) {
			for (int j = 2; j <= Math.sqrt(num); j++) {
				if (num % j == 0) {
					status = 0;
					break;
				}
			}
			if (status != 0) {
				//System.out.println(num);
				i++;
				primeNums.add(num);
			}
			status = 1;
			num++;
		
		}
		
		String answer;
		System.out.println("Let's locate some primes!");
		System.out.println("This application will find you any prime, ");
		System.out.println("in order, from 1 to 100 ");
		
		do {
		
		//System.out.println("Which prime number are you looking for?");
		Scanner in = new Scanner(System.in);
		x= SampleValidator.getInt(in, "Which sequenced prime number would you like to locate?", 1,100);
		System.out.println("The number " + x + " prime is " +primeNums.get(x-1));
		System.out.println("Do you want to find another prime number? (y/n):");
		answer = in.next();
		}while (answer.equalsIgnoreCase("y"));
		 if(answer.equalsIgnoreCase("n"));{
			 System.out.println("Goodbye!");
		 }
		 }
}
}