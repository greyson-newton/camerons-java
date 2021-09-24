import java.util.Scanner;
public class strings
{	public static void main(String[] args)
	{	
		bool verified=False

		String rhyme="";
		System.out.println("\tyeeeeeeeeHAAAA\n------------");// prints out a title,
	    Scanner myObj = new Scanner(System.in);  // Create a Scanner object
	    System.out.println("Enter an alter ego:");	// requests a name from the user,
	    String userName = myObj.nextLine(); //stores
	    verified=verification(username);	// verifies the name
	    if verified{
		    ryhme();		// creates and printsthe verse or rhyme as indicated in the video,
		    output();	    //thanks user	
	    }
	    else{
	    	//handles wrong name input
	    	System.out.println("\n------------\n\tu crashedit\n------------");
	    }

	}
	public bool verification(String s) //name need for ver.
	{
		//codein verification rules
	}
	public void rhyme() //what input do you need for this?
	{
		//codein rhyme rules
		System.out.println("your rhyme: "+rhyme)
	}
	public void output()
	{
		System.out.println("Thanksfor your ip ");
	}

}
