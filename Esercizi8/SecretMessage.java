import java.util.*;

public class SecretMessage{
	private String password, message;
	static int tryCounter = 0;

	public SecretMessage(){
		Scanner in = new Scanner(System.in);
		boolean check = false;
		
		System.out.println("Enter the message:");
		this.message = in.nextLine();
		System.out.println("Set password for the first time:");
		while(!check){	
			String input = "";
			if(passwordVerifier(input = in.nextLine())){
				this.password = input;
				check = true;
			}
			else
				System.out.println("Invalid password retry");
		}
	}


	static boolean passwordVerifier(String p){
		if(p.length() >= 6 && p.matches("(\\w{5,})\\d+"))
			return true;
		return false;
	}

	boolean passwordLog(String c){
		if(this.password.equals(c))
			return true;
		return false;
	}

	void passwordModifier(String n){
		if(passwordVerifier(n))
			this.password = n;
		else
			System.out.println("Replacement failed!");
	}

	
	static void menu(){
		System.out.println("\nEnter:\n" +
						   "1) to view secret message\n"+
						   "2) to reset password\n" +
						   "0) to end\n");
	}
	
	public static void main(String[] args){
		SecretMessage safeBox = new SecretMessage();
		Scanner in = new Scanner(System.in);
		int choice = -1;
		
		while(choice != 0){
			menu();
			choice = Integer.parseInt(in.nextLine());
			switch(choice){
				case 1:
					boolean check = false;
					while(!check){
						System.out.println("\nEnter current password:");
						String currentPassword = in.nextLine();
						if(safeBox.passwordLog(currentPassword)){
							System.out.println("\nThe secret message is " + safeBox.message);
							check = true;
						}
						else{
							System.out.println("\nWrong password! Retry");
							tryCounter++;
						}
						if(tryCounter == 3)
							throw new AccessDeniedException();
					}
					tryCounter = 0;
					break;
				case 2:
					System.out.println("\nConfirm latest password:");
					String currentPassword = in.nextLine();
					if(safeBox.passwordLog(currentPassword)){
						System.out.println("\nEnter new password:");
						String newPassword = in.nextLine();
						if()
						safeBox.passwordModifier(newPassword);
						System.out.println("Password setted");
					}
					else 
						System.out.println("Invalid password!");

					break;
			}
		}
	}

}

class AccessDeniedException extends RuntimeException{
	public AccessDeniedException(){
		super("Inserted an incorrect password for three times!\n  Access Denied  ");
	}
}