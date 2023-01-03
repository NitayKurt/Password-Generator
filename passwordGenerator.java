import java.util.Scanner;
import java.util.Random;
import java.util.Random;
public class PasswordGenerator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		String passwordChart = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		String  passwordChart1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%";
		System.out.println("Do you want numbers inside? y/n");
		String insideNumber = input.nextLine();
		System.out.println("Do you want symbol inside? y/n");
		String insideSymbol = input.nextLine();
		System.out.println("What is the length of your password?");
		int length = input.nextInt();
		char[] password = new char[length];
		if (insideNumber.equals("y") && insideSymbol.equals("y")) {
			for(int i = 0; i < password.length; i++) 
				password[i] = passwordChart.charAt(random.nextInt(41-0)+0); //taking randomly char from passwordChart to password[i]
		}
		if(insideNumber.equals("y") && insideSymbol.equals("n")) {
			for(int i = 0; i < password.length; i++)
			password[i] = passwordChart.charAt(random.nextInt(35-0)+0);
		}
		if(insideNumber.equals("n") && insideSymbol.equals("y")) {
			for(int i = 0; i < password.length; i++)
			password[i] = passwordChart1.charAt(random.nextInt(30-0)+0);
		}
		if(insideNumber.equals("n") && insideSymbol.equals("n")) {
			for(int i = 0; i < password.length; i++)
			password[i] = passwordChart.charAt(random.nextInt(24-0)+0);
		}
		//printing password
		System.out.println("This is your new password: ");
		for(int j = 0 ; j < password.length; j++) {
		System.out.print(password[j]);
		}
		//printing sequence
		int base = 41;
		int sequence = (int) Math.pow(base,length);
		System.out.println();
		System.out.println("Your sequaence is : " + sequence);	
	}
}
