package password;

import java.util.Random;

import javax.swing.JOptionPane;

public class RandomPasswordGenerator {

	public static void main(String[] args) {
		int length = 8;
		char character = 0;
		String password = "" + character;
		Random random = new Random();
		for (int i = 0; i <= length; i++) {
			character = (char) (random.nextInt(126 - 33 + 1) + 33);
			password += character;
		}
		JOptionPane.showMessageDialog(null, password, "Your New Password", JOptionPane.INFORMATION_MESSAGE);

	}

}
@DEV-PROG-spec
 
