package denemeler;
import java.util.Scanner;

public class UserPassword {
	
	public void password() {
		
		String userName, password, newPassword;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Please enter your username : ");
		userName = input.nextLine();
		
		System.out.print("Please enter your password : ");
		password = input.nextLine();
		
		if(userName.equals("Nilgun") && password.equals("java123")) 
			System.out.print("You have successfully logged in");
		else if(userName.equals("Nilgun") && !(password.equals("java123"))) {
			System.out.println("Your password is wrong. Do you want to reset your password ?");
			System.out.println("1 - Yes\n2 - No");
			int option = input.nextInt();
			switch(option) {
				case 1:
					System.out.print("Please enter a new password : ");
					newPassword = input.nextLine();
					if(newPassword.equals("java123"))
						System.out.println("Password could not changed, please enter another password!");
					else if(!(newPassword.equals("java123"))){
						System.out.println("Password is successfully changed!");
						password = newPassword;
					}
					break;
				case 2:
					System.out.print("Login failed");
					break;
			}
		}
	}

}
