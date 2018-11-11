import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter nth position");
		int input = in.nextInt();
		int count = 1;
		int num = 1;
		int i;
		
		while ( count <= input)
		{
			num++;
			for(i = 2 ; i <= num; i++)
				{
				if(num %i ==0)
				{
					break;
				}
				}
			if( i == num)
			{
				count++;
			}
		}
		
		System.out.println(num);
		

	}

}
