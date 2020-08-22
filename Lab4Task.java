//author:Devendra Srivastava(DEV-PROG-Spec)
//sec:B
package course.lab.labTasks.lab4;

import java.util.Scanner;

public class Lab4Task {
	private static final byte TOTAL_PARTICIPANTS = 100;

	private static void sellTicket(String participantName) {
		String message = "Congratulations, " + participantName + ". " + "See you at the conference!";
		System.out.println(message);
	}

	public static void main(String[] args) {
		byte ticketSold = 0;
		while (ticketSold <= TOTAL_PARTICIPANTS) {
			System.out.println("Total Tickets Left: " + (TOTAL_PARTICIPANTS - ticketSold));
			System.out.println("Please enter your name: ");
			Scanner scannerObject = new Scanner(System.in);
			String participantName = scannerObject.nextLine();
			if (participantName.isBlank()) {
				System.out.println("Name can not be blank.");
				continue;
			}
			Lab4Task.sellTicket(participantName);
			ticketSold++;
			if (ticketSold == TOTAL_PARTICIPANTS) {
				System.out.println("Sorry, The tickets are sold-out!");
				scannerObject.close();
				break;
			}
		}
	}
}
