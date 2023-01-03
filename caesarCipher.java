import java.util.Scanner;
public class caesarCipher {
	public static void optionsCipher(String message) {
		for (int i = 0; i <= 26; i++) {
			System.out.println("Key =" + i + "message =" + encryptedMessage(message, i));
		}
	}
	public static String encryptedMessage(String message, int key) {
		String encryptedMessage = "";
		char letter;// the encrypted letter
		for (int i = 0; i < message.length(); ++i) {
			letter = message.charAt(i);
			if (letter >= 'a' && letter <= 'z') {
				letter = (char) (letter + key);

				if (letter > 'z') {
					letter = (char) (letter - 'z' + 'a' - 1);
				}
				encryptedMessage += letter;
			} else if (letter >= 'A' && letter <= 'Z') {
				letter = (char) (letter + key);

				if (letter > 'Z') {
					letter = (char) (letter - 'Z' + 'A' - 1);
				}
				encryptedMessage += letter;
			} else {
				encryptedMessage += letter;
			}
		}

		return encryptedMessage;
	}

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("CAESAR-CIPHER");
		System.out.println("Enter your messege");
		String message = input.nextLine();
		System.out.println("Enter your key");
		int key = input.nextInt();
		System.out.println("This is the encrypted messege: " + encryptedMessage(message, key));
		System.out.println();
		System.out.println("This is the decrypted messege: " + encryptedMessage(message, key *-1));
		optionsCipher(message);
	}
}
