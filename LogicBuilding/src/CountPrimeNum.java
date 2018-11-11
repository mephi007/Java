import java.util.Scanner;
public class CountPrimeNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("enter range of prime Number");
		int input1 = in.nextInt();
		int input2 = in.nextInt();
		int i;
		int count=1;
		while (input1 <= input2)
		{
			for(i = 2 ; i<= input1; i++)
			{
				if(input1%i ==0)
				{
					break;
				}
			}
			
			if(i == input1)
			{
				System.out.println(i);
				count++;
			}
			input1++;
		}
		
		System.out.println(count-1);
		

	}

}
