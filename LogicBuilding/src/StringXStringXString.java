import java.util.Scanner;

public class StringXStringXString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Scanner in = new Scanner(System.in);
			System.out.println("enter string");
			String str = in.nextLine();
			System.out.println("enter char");
			char c=in.next().charAt(0);
			System.out.println("enter frq of repition");
			int n = in.nextInt();
			
			for(int i=1; i <= n; i++)
			{
				System.out.print(str);
				if(i != n)
					System.out.print(c);
			}
			
			
			
	}

}
