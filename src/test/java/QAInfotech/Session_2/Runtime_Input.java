package QAInfotech.Session_2;


import java.util.ArrayList;
import java.util.Scanner;


public class Runtime_Input {
	
	public void userInput()
	{
		char currentChar = 'T';		
        String letters= "" ;
        String output = "";
		int currentAlphaindex = 0;
		int replacementCount = 0;
		System.out.println("Enter Input");
		/*Scanner scan = new Scanner(System.in);
		input+= scan.nextLine();
		scan.close();				
		return input;*/
		int i = 0;
		Scanner scan = new Scanner(System.in);
	    ArrayList<String> lines = new ArrayList<String>();
	    String s=null;
	        s=scan.nextLine();
	        lines.add(s);
	        int len = lines.get(0).length();
	        String temp=lines.get(0);
	        char[] alpha = new char[len];
	        int[] alphaIndex = new int[len];
			 char[] fullText = new char[len];
			 
			 for (int count = 0; count < len; count++)
			 {
		           currentChar = lines.charAt(count);
		            fullText[count] = currentChar;
		            alphaIndex[count] = -1;
		            if(Character.isLetter(currentChar))
		            {
		                alpha[currentAlphaindex] = currentChar;
		                alphaIndex[currentAlphaindex] = count;
		                currentAlphaindex++;
		            }
			 }
			for (int j = (len - 1); j >= 0; j--){
	            letters = letters + alpha[j];
	            letters = letters.trim();
	        }
	        for(int k = 0; k < len; k++){
	            if((alphaIndex[k] >= 0)){
	                fullText[alphaIndex[i]] = letters.charAt(replacementCount);
	                replacementCount++;
	            }
	            output = output + fullText[k];
	        }
	        System.out.println("input: " + lines + "\noutput: " + output);
	    
		}
		
		
	}
	


