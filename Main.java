/*
 * Name : Suman Kumari
 * Date: 04/09/2024
 * 
 * Problem Description :
 *  [When the program is run, the user will first enter a string. After that, the program should
	ask the user which operation they want to execute on the string. The available operations are
	listed below: Append, CountWords, Replace, isPalindrome, Splice, Split,
	MaxRepeatingCharacter, Sort, Shift, and Reverse. Each method should perform its
	respective operation based on the user's input.]
	
	Examples:
		1. append(String newString)
			String currentString = "Hello";
			append(" World"); // Result: "Hello World"
			append(" Java"); // Result: "Hello World Java"
		2. countWords()
			String text = "Hello World from Codeup";
			int wordCount = countWords(); // Result: 4
		3. replace(String a, String b)
			String text = "Java Programming";
			replace('a', 'o'); // Result: "Jovo Progromming"
			replace('ava', 'o'); // Result: "Jo Progromming"
		4. isPalindrome()
			String text = "madam";
			boolean isPal = isPalindrome(); // Result: true
		5. splice(int start, int length)
			String text = "Academy";
			splice(2, 2); // Result: "Acemy"
		6. split(String pattern)
			String text = "Codeup ACE Academy";
			String[] words = split(“ “); // Result: ["Codeup", "ACE", "Academy"]
		7. maxRepeat()
			String text = "success";
			char maxChar = maxRepeat(); // Result:
			's' -> 3
		8. sort()
			String text = "program";
			String sortedText = sort(); // Result: "agmnoprr"
		9. shift(int n)
			String text = "abcdef";
			shift(2); // Result: "efabcd"
		10. reverse()
			String text = "Java";
**/

package AssignmentTask_2;

import java.util.Scanner;

public class MyString {
	static Scanner scanner = new Scanner(System.in);
	static String originalString;
	
	public static void main(String arg[]) {
		while(true) {
			System.out.print(Constant.ENTER_STRING);
			originalString = scanner.nextLine();
			
			System.out.println(Constant.METHOD_COMMENT);
			do {
                System.out.println("\nenter the methodkey");
                int methodkey = scanner.nextInt();
                switch (methodkey) {
                
                case 1:
                	 append();
                    break;
                case 2:
                	 WordsCount();
                    break;
                case 3:
                   replace();
                    break;
                case 4:
                    isPalindrome();
                    break;
                case 5:
                	MaxRepeat();
                    break;
                case 6:
                    Shift();
                    break;
                case 7:
                    Reverse();
                    break;
                case 8:
                   Sort();
                    break;
                case 9:
                    Split();
                    break;
                case 10:
                   Splice();
                    break;
          

                    default:
                        System.out.println("Invalid method key");
                        break;
                }
            } 
			while(true);
			
		}
	}
	
	public static void append(){
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println(Constant.ENTER_STRING);
			String newString = scanner.nextLine();
			
			if(newString.equals("leave")) {
				System.out.println(newString);
				break;
			}
			else {
				originalString = originalString+" "+newString;
				System.out.println(originalString);
			}
		}
		
	}

	
	
	public static void WordsCount() {
		int wordCount = 0;
		boolean isWord = false;
		
		for(int i=0; i<originalString.length(); i++) {
			if(originalString.charAt(i) != ' ') {
				if(!isWord) {
					wordCount++;
					isWord = true;
				}
			}
			else {
				isWord = false;
			}
		}
		System.out.println("Total number of words: "+wordCount);
	}
	

	public static void replace() {
		 System.out.println(Constant.ENTER_REPLACING_STRING);
	        String firstString= scanner.nextLine();
	        
	        System.out.println(Constant.ENTER_NEW_STRING);
	        String secondString = scanner.nextLine();

	        String newString = "";
	        
	        for (int i = 0; i < originalString.length(); i++) {
	            char currentCharacter = originalString.charAt(i);

	            if (originalString.substring(i).startsWith(firstString)) {
	                newString += secondString;
	                i = i + firstString.length() -1;
	            }
	            else{
	                newString = newString + currentCharacter;
	            }
	        }
	        System.out.println("The replaced string is: "+newString);

	}
	
	
	public static void isPalindrome() {
		String newString = "";
		for(int i=originalString.length()-1; i >= 0; i--) {
			newString += originalString.charAt(i);
		}
		if(newString.equals(originalString)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}			
		System.out.println("The new string is: "+newString); 
		
	}
	
	
	public static void MaxRepeat() {
		int count = 1;
		int maximumCount = 1;
		char maximumCharacter = originalString.charAt(0);
		
		for(int i=1; i<=originalString.length()-1; i++) {
			if(originalString.charAt(i) == originalString.charAt(i-1)) {
				count++;
			}
			else {
				count = 1;
			}
			if(count >= maximumCount) {
				maximumCount = count;
				maximumCharacter = originalString.charAt(i);
			
			}
		}
		System.out.println("The maximum repeated character is: "+maximumCharacter+"  ->  "+maximumCount);
	}
	
	
	public static void Shift() {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println(Constant.ENTER_INDEX);
		int index = scanner.nextInt();
		
		String part1 = "";
		String part2 = "";
		
		for(int i=0 ; i<index; i++) {
			part1 += originalString.charAt(i);
		}
		for(int i=index; i<originalString.length(); i++) {
			part2 +=originalString.charAt(i);
		}
		String newString = part2 + part1;
		System.out.println("The shifted string is: "+newString);
	}
	
	
	public static void Reverse() {
		String newString = "";
		
		for(int i=originalString.length()-1; i>=0; i--) {
			newString = newString + originalString.charAt(i);	
		}
		System.out.println("The reverse string is: "+newString);
	}

	
	public static void Sort() {
		char[] arrayOfCharacter = originalString.toCharArray();
		
		for(int i=0; i<arrayOfCharacter.length-1; i++) {
			for (int j=0; j<arrayOfCharacter.length-1-i; j++) {
				if(arrayOfCharacter[j] > arrayOfCharacter[j+1]) {
					char temp = arrayOfCharacter[j];
					arrayOfCharacter[j] = arrayOfCharacter[j+1];
					arrayOfCharacter[j+1] = temp;
				}
			}
		}
		String newString = new String(arrayOfCharacter);
	    System.out.println(newString);
	}
	
	
	public static void Split() {
        System.out.println(Constant.ENTER_PATTERN);
        scanner.nextLine();
        String pattern = scanner.nextLine();
        String[] words = new String[originalString.length() + 1];
        int indexCount = 0;

        for (int i = 0; i < originalString.length(); i++) {
            if (originalString.startsWith(pattern, i)) {
                words[indexCount++] = originalString.substring(0, i);
                originalString =originalString .substring(i + pattern.length());
                i = -1;
            }
        }

        words[indexCount] = originalString;


        String[] withoutNullWords = new String[indexCount+1];
        for (int i = 0; i < indexCount+1; i++) {
            withoutNullWords[i] = words[i];
        }
        System.out.println(java.util.Arrays.toString(withoutNullWords));
   
	}

	
	public static void Splice() {
		 System.out.println(Constant.ENTER_INDEX);
	        int startIndex = scanner.nextInt();

	        System.out.println(Constant.ENTER_INDEX_LENGTH);
	        int length = scanner.nextInt();

	        String newString = "";
	        for (int i = 0; i <originalString.length() ; i++) {
	            char currentCharacter = originalString.charAt(i);
	            if (!(i>=startIndex && i<=startIndex+length-1)) {
	                newString += currentCharacter;
	            }
	        }
	        System.out.println("Spliced String : "+newString);
	    }
	
	
}





