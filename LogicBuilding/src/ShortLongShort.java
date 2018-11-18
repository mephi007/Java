import java.util.Scanner;

public class ShortLongShort {
	public static void main(String[] args)
	{
		Scanner in =new Scanner(System.in);
		System.out.println("enter two string::");
		String s1 = in.nextLine();
		String s2 = in.nextLine();
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		String less="";
		String big="";
		
		if(len1<len2)
		{
			less = s1;
			big = s2;
		}
		else {
			less = s2;
			big = s1;
		}
		
		System.out.println(less.concat(big.concat(less)));
		
	}
}
