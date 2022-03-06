/**
 * @author Blurout
 */
import java.util.Scanner;
public class isPalindrome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String word = input.nextLine();
		input.close();
		boolean TorF = check(word);
		System.out.println(TorF);
		if (TorF) {
			System.out.println(word + " is a palindrome!\n" + word +" spelled backwards is: " + emordnilap(word));
		} else {
			System.out.println("the String is NOT a palindrome!\n" + word +" spelled backwards is: " + emordnilap(word));
		}
	}
	public static boolean check(String word) {
		word = word.toLowerCase();
		String bword = emordnilap(word);
		int len = word.length();
		boolean b = false;
		for (int i = 0; i < len; i++) {
			if(word.charAt(i) == ' ') {
				i++;
				len--;
			}
			if (word.charAt(i) == bword.charAt(i)) {
				b = true;
				len--;
			} else {
				return false;
			}
		}
		return b;
	}
	public static String emordnilap(String word) {
		word = new StringBuilder(word).reverse().toString();
		return word;
	}
}