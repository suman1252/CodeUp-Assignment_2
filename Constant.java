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


public class Constant {
	
	public static String ENTER_STRING = "Enter String: ";
	
	public static String ENTER_NEW_STRING = "Enter new String: ";
	
	public static String ENTER_INDEX = "Enter starting Index: ";
	
	public static String ENTER_REPLACING_STRING = "Enter Replacing String: ";
	
	public static String ENTER_INDEX_LENGTH = "Enter length from starting Index: ";
	
	public static String ENTER_SENTENCE = "Enter Sentence: ";
	
	public static String NUMBER_OF_WORDS = "Number of Words ";
	
	public static String ENTER_CHARACTER = "Enter Character";
	
	
	public static String ENTER_PATTERN = "Enter a pattern for spliting into Array: ";
	
    public static String METHOD_COMMENT = "Enter 1 for Append the String: \n" +
		                                         "Enter 2 for WordsCount in the String: \nEnter 3 for Replace the String: \n" +
		                                         "Enter 4 for check Palindrome: \nEnter 5 for MaxRepeat element: \n" +
		                                         "Enter 6 for Shift the String\nEnter 7 for Reverse the String: \n" +
		                                         "Enter 8 for Sort the String: \n" + "Enter 9 for Split the String\n" +
		                                         "Enter 10 for Splice the String\n" ;



		
}
