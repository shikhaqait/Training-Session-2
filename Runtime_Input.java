package QAInfotech.Session_2;


import java.util.Scanner;

public class Runtime_Input {
	
	public String userInput()
	{
		String input="T";
		
		System.out.println("Enter Input");
		Scanner scan = new Scanner(System.in);
		input+= scan.nextLine();
		scan.close();				
		return input;
	}

}
