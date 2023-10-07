package EmailApp;
import java.util.*;
public class EmailApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter your first name: ");
		String firstname = scanner.next();
		System.out.println("Enter your last name: ");
		String lastname = scanner.next();
		Email obj = new Email(firstname,lastname);
		obj.info();
		scanner.close();
		}
		}


