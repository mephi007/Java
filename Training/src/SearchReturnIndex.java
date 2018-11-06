import java.util.Scanner;
public class SearchReturnIndex {
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		
		int[] arr = {1,4,34,56,7};
		System.out.println("enter element to be find");
		int num = in.nextInt();
		for(int i = 0; i<arr.length ; i++)
		{
			if(arr[i]==num)
			{
				System.out.println("element is at::"+i);
			}
			
			
		}
			
	}

}
