import java.util.Scanner;

public class IsPalindromeString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String input = in.nextLine();
		int len = input.length();
		String rev = "";
		
		for(int i = len -1 ; i >= 0 ; i--)
		{
			rev = rev+input.charAt(i);
		}
		
		System.out.println("Reverse of a string is::"+rev);
		
		if(rev.equals(input))
		{
			System.out.println("palindrome");
		}
		else
		{
			System.out.println("Not a Plaindrome");
		}
		
		char[] s2 = input.toCharArray();
	}

}
