import java.util.Scanner;
public class Max2Min2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Element Number of Array");
		int n = in.nextInt();
		int[] arr = new int[n];
		
		System.out.println("Enter Arry Element");
		for(int i=0; i<n; i++)
		{
			arr[i]=in.nextInt();
			
		}
		int large = arr[0];
		int secLarge = arr[0];
		int min = arr[0];
		int secMin = arr[0];
		
		//Largest , 2nd largest , Minimum , 2nd minimum
		
		for(int i=1 ; i<n ; i++)
		{
			if(arr[i]>large)
			{
				secLarge =large;
				large = arr[i];
			}
			else if( arr[i]> secLarge)
			{
				secLarge = arr[i];
			}
			
			if(arr[i]< min)
			{
				secMin = min;
				min = arr[i];
			}
			else if(arr[i]< secMin)
			{
				secMin = arr[i];
			}
		}
		System.out.println("Largest::"+large);
		System.out.println("Second largest::"+secLarge);
		System.out.println("Minimun::"+min);
		System.out.println("Second Minimum::"+secMin);
	}

}
