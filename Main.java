package AssignmentTask_2;

import java.util.Scanner;

public class Main {
	static Scanner scanner = new Scanner(System.in);
	static String originalString;
	
	public static void main(String arg[]) {
		while(true) {
			System.out.print(Constant.ENTER_STRING);
			originalString = scanner.nextLine();
			
//			append();
//			WordsCount();
//			replace();
//			isPalindrome();
//			MaxRepeat();
			Shift();
//			Reverse();
//			Sort();
//			Split();
//			Splice();
			
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
	        String str1= scanner.nextLine();
	        
	        System.out.println(Constant.ENTER_NEW_STRING);
	        String str2 = scanner.nextLine();

	        String newString = "";
	        
	        for (int i = 0; i < originalString.length(); i++) {
	            char currentChar = originalString.charAt(i);

	            if (originalString.substring(i).startsWith(str1)) {
	                newString += str2;
	                i = i + str1.length() -1;
	            }else{
	                newString = newString + currentChar;
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
		int maxCount = 1;
		char maxChar = originalString.charAt(0);
		
		for(int i=1; i<=originalString.length()-1; i++) {
			if(originalString.charAt(i) == originalString.charAt(i-1)) {
				count++;
			}
			else {
				count = 1;
			}
			if(count >= maxCount) {
				maxCount = count;
				maxChar = originalString.charAt(i);
			
			}
		}
		System.out.println("The maximum repeated character is: "+maxChar+"  ->  "+maxCount);
//		System.out.println(maxChar);
//		System.out.println(maxCount);
	}
	
	
	public static void Shift() {
		//Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter the number of index: ");
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
		char[] chars = originalString.toCharArray();
		
		for(int i=0; i<chars.length-1; i++) {
			for (int j=0; j<chars.length-1-i; j++) {
				if(chars[j] > chars[j+1]) {
					char temp = chars[j];
					chars[j] = chars[j+1];
					chars[j+1] = temp;
				}
			}
		}
		String newString = new String(chars);
	    System.out.println(newString);
	}
	




