package QAInfotech.Session_2;

//import java.util.ArrayList;
import java.util.LinkedList;

public class CollectionReverseString {

	String reverse="";
	//ArrayList<String> specialChracter= new ArrayList<String>();
	LinkedList<String> inputList = new LinkedList<String>();
	int test = inputList.size();
	public void reverseString()
	{
		char currentChar = 'T';		
        String letters= "";
        String output = "";
		int currentAlphaindex = 0;
		int replacementCount = 0;		
		char[] alpha = new char[test];
        int[] alphaIndex = new int[test];
		 char[] fullText = new char[test];
		 for (int count = 0; count < test; count++)
		 {
	           currentChar = ((CharSequence) inputList).charAt(count);
	            fullText[count] = currentChar;
	            alphaIndex[count] = -1;
	            if(Character.isLetter(currentChar))
	            {
	                alpha[currentAlphaindex] = currentChar;
	                alphaIndex[currentAlphaindex] = count;
	                currentAlphaindex++;
	            }
		 }
		for (int i = (test - 1); i >= 0; i--){
            letters = letters + alpha[i];
            letters = letters.trim();
        }
        for(int i = 0; i < test; i++){
            if((alphaIndex[i] >= 0)){
                fullText[alphaIndex[i]] = letters.charAt(replacementCount);
                replacementCount++;
            }
            output = output + fullText[i];
        }
        System.out.println("input: " + inputList + "\noutput: " + output);
    
	}
}
