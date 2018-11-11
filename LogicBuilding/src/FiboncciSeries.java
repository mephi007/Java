import java.util.Scanner;
public class FiboncciSeries {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter limit");
		int limit = input.nextInt();
		
		System.out.println("Fibbonacci Series ::");
		int x =0;
		int y=1;
		int[] arr= new int[limit+1];
		int fib =0;
		
		arr[0]=0;
		arr[1]=1;
		for(int count=2; count <= limit; count ++)
		{
			fib = x+y;
			
			x = y;
			y = fib;
			arr[count]= fib;
			
			
		}
		
		for(int count =0; count <=limit ; count ++)
		{
			System.out.print(arr[count]);
			if(count != limit )
			{
				System.out.print(", ");
			}
		}
		System.out.println("\n");
		System.out.println("nth Fibonacci Series::");
		System.out.println(arr[limit]);
	}
}
