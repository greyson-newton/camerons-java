import java.util.*;

public class NameGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = input.nextLine();
		
		int firstSpace = name.indexOf(" ");
		String firstName = name.substring(0, firstSpace);
		String lastName = name.substring(firstSpace + 1);	
		
		singSong(firstName);
		System.out.println();
		singSong(lastName);
	}
	
	public static void singSong(String name) {
		String suffix = name.substring(1);
		System.out.println(name + ", " + name + ", bo-b" + suffix);
		System.out.println("Banana-fana fo-f" + suffix);
		System.out.println("Fee-fi-fo-m" + suffix);
		System.out.println(name.toUpperCase() + "!");
	}
}