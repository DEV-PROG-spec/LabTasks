/**
 * @author : Devendra Srivastava(DEV-PROG-spec)
 * Section : B
 * Date and Time : 05-08-2020 & 17:33
 */
package course.lab.labTasks.lab5;

import java.lang.Math;

/**
 * Create a program in Java to create OTP (One-Time Passwords) for a customer
 * service.
 */
public class Lab5Task {
	private static final byte RANDOM_NUMBER_MAX_LIMIT = 10;

	/**
	 * This method generates an OTP for the customer depending upon the number of
	 * digits.
	 *
	 * @return the generated OTP.
	 */
	private static int generateOTP() {
		int noOfDigitsInOtp = 6;
		int oneTimePassword = 0;
		for (int index = 0; index <= (noOfDigitsInOtp - 1); index++) {
			int randomNumber = 0;
			randomNumber = createRandomNumber();
			int powerToTen = (int) Math.pow(10.0, index);
			powerToTen *= randomNumber;
			oneTimePassword += powerToTen;
		}
		return oneTimePassword;
	}

	/**
	 * This method generates a random number between 0 and 9 for the OTP.
	 *
	 * @return a random number between 0 and 9.
	 */
	private static int createRandomNumber() {
		return (int) (Math.random() * RANDOM_NUMBER_MAX_LIMIT);
	}

	/**
	 * This method prints the generated OTP with some dashes between the characters.
	 *
	 * @param generatedOTP the random OTP generated from the generateOTP method.
	 */
	private static void printOTP(int generatedOTP) {
		String otpString = String.valueOf(generatedOTP);
		for (int i = 0; i < otpString.length(); i++) {
			System.out.print(otpString.charAt(i) + (i < otpString.length() - 1 ? "-" : ""));
		}
	}

	public static void main(String[] args) {
		int generatedOTP = generateOTP();
		System.out.print("Your OTP is : ");
		printOTP(generatedOTP);
	}
}
