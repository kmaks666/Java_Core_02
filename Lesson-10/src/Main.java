import java.util.Arrays;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		int count=0;
		int index = 0;
		Scanner scan = new Scanner(System.in);
		StringBuffer myString = new StringBuffer();
		String stringOne = new String(" The   publisher Offers discounts on this book when ordered in quantitY. in ");
		String stringArray[] = stringOne.trim().split("\\s+");
		int[] array=new int[stringArray.length];
		
		System.out.print("Enter five-letter word ");
		isPalindrome(myString.append(scan.next().toLowerCase()));
		replaceLetters(stringOne);
		numberOfWords(stringOne);
		numberOfRepetitions(count, index, stringArray, array);                   
	    }

	private static void numberOfRepetitions(int count, int index, String[] stringArray, int[] array) {
		for(int i=0; i<stringArray.length; i++) 
	            for(int j=0; j<stringArray.length; j++) 
	                if(stringArray[i].equals(stringArray[j])) array[i]++; 
	        for(int i=0; i<array.length; i++) 
	            if(array[i]>count) {
	                count = array[i];                  
	               index = i;                              
	            }
	       System.out.println("This word - "+stringArray[index].toString()+" - occurs "+count+" times");
	}
		
	private static void numberOfWords(String stringOne) {
		String stringArray[] = stringOne.trim().split("\\s+");
		System.out.println("Number of the words: " + stringArray.length);
		System.out.println(Arrays.toString(stringArray));
	}

	private static void replaceLetters(String s) {
		System.out.println("Original string: " + s);
		System.out.println("Modified string: " + s.replaceAll("[AEYUIOaeyuio]", "-"));
	}

	private static void isPalindrome(StringBuffer myString) {
		if ((myString.length() == 5) && (myString.equals(myString.reverse()))) {
			System.out.println("This word is palindrome");
		} else if (myString.length() != 5) {
			System.out.println("The word you entered does not match the conditions");
		} else {
			System.out.println("This word isn't palindrome");
		}
	}

}
