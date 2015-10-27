package task1b;

/**
 * Program to reverse number
 * @author Gosia
 *
 */
public class ReverseNumber {

	public static void main(String[] args) {
		int numberToReverse = 123456789;
		int reversedNumber = reverseNumber(numberToReverse);
		System.out.println("Reversed number: " + reversedNumber);
	}

	/**
	 * Reverses number
	 * @param int to reverse
	 * @return reversed number as int type
	 */
	private static int reverseNumber(int numberToReverse) {
		int reversedNumber = 0;
		while(numberToReverse != 0) {
			reversedNumber = reversedNumber * 10;
			reversedNumber = reversedNumber + numberToReverse % 10;
			numberToReverse = numberToReverse / 10;
		}
		return reversedNumber;
	}
}