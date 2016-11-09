package ApacheStorm.ApacheStorm;

public class GeneratePrimeNumbersWithForLoop {
	
	public static void main(String[] args) throws InterruptedException {

		double max = 349500;
		long startTime = System.currentTimeMillis();
		System.out.println("Generate Prime numbers between 1 and " + max);

		// loop through the numbers one by one
		for (double i = 1; i<max; i++) {

			boolean isPrimeNumber = true;

			// check to see if the number is prime
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrimeNumber = false;
					break; // exit the inner for loop
				}
			}
			// print the number if prime
			if (isPrimeNumber) {
				System.out.println(i);
			}
		}
		long endTime = System.currentTimeMillis();
		System.out.println("That took " + (endTime - startTime)/1000 + " seconds!!");

	}

}
