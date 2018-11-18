import java.util.Scanner;

public class EvenReturn1stHalf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("Enter the string");
			String str = in.nextLine();
			if(str.length()%2 == 0)
			{
				System.out.println(str.substring(0, str.length()/2));
			}
			else {
				System.out.println("null");
			}

	}

}
