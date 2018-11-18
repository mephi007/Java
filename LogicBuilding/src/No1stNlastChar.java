import java.util.Scanner;

public class No1stNlastChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter the string");
		String str = in.nextLine();
		
		System.out.println(str.substring(1, str.length()-1));
		
	}

}
