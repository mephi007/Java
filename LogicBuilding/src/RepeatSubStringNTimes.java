import java.util.Scanner;

public class RepeatSubStringNTimes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter a string");
		String str = in.nextLine();
		
		System.out.println("Enter Frequency of Repetition::");
		int n = in.nextInt();
		
		int len = str.length();
		
		if(len >=2)
		{
			String sub = str.substring(0, 2);
			for(int i = 1; i<=n ; i++)
			{
				System.out.print(sub);
			}
			
		}
		else
		{
			for(int i = 1; i<=n ; i++)
			{
				System.out.print(str);
			}
		}
			
		
	}

}
