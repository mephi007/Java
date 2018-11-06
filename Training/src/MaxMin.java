import java.util.Scanner;
public class MaxMin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter array element number");
		int n = in.nextInt();
		int[] arr = new int[n];
		System.out.println("Enter elements");
		for(int i = 0; i<n; i++)
		{
			arr[i]= in.nextInt();
		}
		
		//Maximun and Minimun in array
		
		int max = arr[0];
		int min = arr[0];
		
		for(int i=1 ; i<n ; i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
			if(arr[i]< min)
			{
				min = arr[i];
			}
		}
		
		System.out.println("Maximun in array is::"+max);
		System.out.println("Minimum in array is::"+min);
		

	}

}
