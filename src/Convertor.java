/*
 * Student Name: Ishtiaque
 * Lab Professor: Leanne Seaward
 * Due Date: Sep 17th, 2021
 * Modified: Sep 17th, 2021
 * Description: This class will convert a value in kilograms to pounds
 *
 */

public class Convertor {

	public static void main(String[] args) {

		// set weightkg value
		double weightkg = 5;

		// converting to pound
		double weightlb = 2.20462 * weightkg;

		// rounding to 2 decimal points
		double total = Math.round(weightlb * 100) / 100;

		// printing output results
		System.out.println(weightkg + " kg is equivalent to " + total + " lb");

	}

}
