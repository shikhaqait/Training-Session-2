package QAInfotech.Session_2;

public class MainProgram {

	public static void main(String[] args) {
		
		Runtime_Input run = new Runtime_Input();
		String input=run.userInput();
		CollectionReverseString reverse = new CollectionReverseString();
		/*reverse.specialChracter.add("!");
		reverse.specialChracter.add("~");
		reverse.specialChracter.add("@");
		reverse.specialChracter.add("#");
		reverse.specialChracter.add("$");
		reverse.specialChracter.add("%");
		reverse.specialChracter.add("^");
		reverse.specialChracter.add("&");
		reverse.specialChracter.add("*");*/
		reverse.inputList.add(input);
		reverse.reverseString();
	
	}

}
