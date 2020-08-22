package course.lab.labTasks;

import java.util.Scanner;

public class Lab3Task {
	public static final String DISCOUNT_CODE = "CoVid19";

	public static void main(String[] args) {
		Scanner scannerObject = new Scanner(System.in);
		System.out.println("Please enter your code");
		String clientInputDiscountCode = scannerObject.nextLine();
		scannerObject.close();
		if (clientInputDiscountCode.isBlank() || clientInputDiscountCode.isEmpty()) {
			System.out.println("The coupon code can't be empty or blank");
		} else if (DISCOUNT_CODE.equalsIgnoreCase(clientInputDiscountCode)) {
			System.out.println("Congrats, you get $ 100 off on your bill!");
		} else {
			System.out.println("Wrong coupon code");
		}
	}
}
