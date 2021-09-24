import java.util.*;
import java.util.LinkedList;  
import java.util.List;  
public class NameGame {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("What is your name? ");
		String name = input.nextLine();
		verified=verify(name,input)
		if verified{
			singSong(firstName);
			System.out.println();
			singSong(lastName);			
		}
		else{
			System.out.print("TF wrong w your name? ");
			// detecct what problem is 
		}
		

	}

	public bool verify(name,input){
		String[] cusses=load_cusses()

		int firstSpace = name.indexOf(" ");

		if firstSpace < 0	{
			String firstName = name.substring(0, firstSpace);
			System.out.print("Enter your last name ");
			String lastName = name.substring(firstSpace + 1);
		}
		else{
			String firstName = name.substring(0, firstSpace);
			String lastName = name.substring(firstSpace + 1);
		}

		if (firstName==null){
			System.out.print("What is your first name? ");
			String name = input.nextLine();}
		if (lastName==null){
			System.out.print("What is your last name? ");
			String name = input.nextLine();}
		boolean firstcussMatch = cusses.stream().allMatch(s -> s.equals(firstname));
		boolean lastcussMatch = cusses.stream().allMatch(s -> s.equals(lastname));
		if (firstcussMatch==True) || (lastcussMatch==True){
			System.out.print("\u0007");
			System.out.print("You dirty dog... Try again-\n ");
		}
		String[] names = [firstname,lastname]

		// loops through first and last names and checks for string features 
		for (int i=0;i<2:i++){
			name = names[i]
			boolean singleVowel = vowels_or_consonate_rules(name,0)// Single Consonant (remove first letter):
			if singleVowel{

			}
			boolean singleConsonant = vowels_or_consonate_rules(name,1)// Single Vowel (name as is, no letters removed):
			else if {

			}
			boolean doubleConsonant = vowels_or_consonate_rules(name,2);// Double Consonant (remove first two letters):
			else if {

			}	
			boolean doubleVowel = vowels_or_consonate_rules(name,3);// Double Vowel (remove first letter):
			else if {

			}
			if name.startswith("B"){
				// b rules
			}
			if name.startswith("F"){
				// f rules
			}
			if name.startswith("M"){
				// m rules
			}
		}
		return True;
		
	}	
	public String[] load_cusses(){
		Scanner scanner = new Scanner(new File("pathToYourFile"));
		List<String> strings = new ArrayList<String>();
		while(scanner.hasNextLine()){
		strings.add(scanner.nextLine());
		}
		return strings;
	}	
	public static void singSong(String name) {
		String suffix = name.substring(1);
		System.out.println(name + ", " + name + ", bo-b" + suffix);
		System.out.println("Banana-fana fo-f" + suffix);
		System.out.println("Fee-fi-fo-m" + suffix);
		System.out.println(name.toUpperCase() + "!");
	}
	public boolean vowels_or_consonate_rules(name,method){

		String[] consonants={"B", "C", "D", "F", "G", "H", "J", "K", "L", "M", "N", "P", "Q", "R", "S", "T", "V", "X", "Z"}
		String[] vowels={"I","O","U","E","A"}
		String[] list ;

		if method==0
		{
			list=consonants
		}
		else if method==1
		{
			list=vowels	
		}
		for (int i=0;i<name.size();i++)
		{	
			for (int x=0;x<list.size();x++)
			{
				if name.charAt(i).equals(list[x])// Any Consonant found in name
				{	y=i+1;//look at the next character in name
					for (int d=i+1;d<list.size();d++)//loop ncompare name nxt name character with whole list of cons
					{	if name.charAt(y).equals(list[x])//If any consonant found then return true  
						{
							System.out.print("Double Consonates found ");
							return False;
						}
					}
	
				}			
			}
		}
	}
}