package messengerapp;
import java.util.*;
interface MessageService{
	void sendMessage();
}

class SMSMessagingService implements MessageService{
	public void sendMessage() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String number = scanner.next();
		
		String regex = "[6-9]\\d{9}";
		if(number.matches(regex)) {
			System.out.println("Enter the message");
			String message = scanner.next();
			System.out.println(name+"The message has been sent successfully");
			System.out.println();
		}
		else {
			System.out.println("Enter a valid mobile number");
		}
	}
}
class EmailMessagingService implements MessageService{
	public void sendMessage() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String email = scanner.next();
		
		String regex = "^\\S+@\\S+$";
		if(email.matches(regex)) {
			System.out.println("Enter the Subject");
			String message = scanner.next();
			System.out.println("Enter the Content");
			String content = scanner.next();
			System.out.println(name+" "+"The Email has been sent successfully");
			System.out.println();
		}
		else {
			System.out.println("Enter a valid Email id");
		}
	}
}
class WhatsappMessagingService implements MessageService{
	public void sendMessage() {
		Scanner scanner = new Scanner(System.in);
		String name = scanner.next();
		String number = scanner.next();
		
		String regex = "[6-9]\\d{9}";
		if(number.matches(regex)) {
			System.out.println("Enter the message");
			String message = scanner.next();
			System.out.println(name+"The message has been sent successfully");
			System.out.println();
		}
		else {
			System.out.println("Enter a valid mobile number");
		}
	}
}
public class MessengerApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MessageService sms =new SMSMessagingService();
		MessageService email =new EmailMessagingService();
		MessageService whatsapp =new WhatsappMessagingService();
		Scanner scanner = new Scanner(System.in);
		System.out.println("The services are:\n1)SMS\n2)EMAIL\n3)WHATSAPP");
		System.out.println("Enter service");
		int option = scanner.nextInt();
		if(option == 1) {
			sms.sendMessage();
		}
		else if(option == 2) {
			email.sendMessage();
		}
		else if(option == 3) {
			whatsapp.sendMessage();
		}
		else {
			System.out.println("Enter a valid service");
		}
	}

}
