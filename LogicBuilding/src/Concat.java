import java.util.Scanner;

public class Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("enter two string");
	   String s1 = in.nextLine();
	   String s2 = in.nextLine();
	   int len = s1.length();
	   int len1 = s2.length();
	   String temp="";
	   if(s1.charAt(len-1)==s2.charAt(0))
	   {
		   for(int i= 0;i < len; i++)
		   {
			   temp = temp+s1.charAt(i);
		   }
		   for(int i =1; i<len1; i++)
		   {
			   temp = temp+s2.charAt(i);
		   }
	   }
	   else {
		   temp = s1.concat(s2);
	   }
		System.out.println("concated string::"+temp);
	}

}
