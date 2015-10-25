package programming2;

import java.util.Scanner;

/**
 * Program to reverse String
 * @author Gosia
 *
 */
public class ReverseString {

	public static void main(String[] args) {
		String string = inputString();
		String reversedString = reverseString(string);
		System.out.println("Reversed String: " + reversedString);
	}

	/**
	 * Reads string from console
	 * @return string as String type
	 */
	private static String inputString() {
		System.out.println("Type String to reverse");
		Scanner terminalInput = new Scanner(System.in);
		String string;
		string = terminalInput.nextLine();
		terminalInput.close();
		return string;
	}

	/**
	 * Reverses string
	 * @param string to reverse
	 * @return reversed string as String type
	 */
	private static String reverseString(String string) {
		char reversed[] = new char[string.length()];
		int counter = string.length()-1;
		for(int i=0; i<string.length(); i++) {
			reversed[counter] = string.charAt(i);
			counter--;
		}
		String reversedString = new String(reversed);
		return reversedString;
	}
}