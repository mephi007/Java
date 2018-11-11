import java.util.Scanner;
public class RemoveRepeated {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter Element Number");
		int n = in.nextInt();
		
		int[] arr = new int[n];
		
		System.out.println("Enter the Elements in Array");
		for(int i = 0; i<n ; i++)
		{
			arr[i]=in.nextInt();
		}
		
		for(int i =0; i<n-1 ; i++)
		{
			for(int j=i+1; j<n ; j++)
			{
				if(arr[j]<arr[i])
				{
					int temp = arr[j];
					arr[j]= arr[i];
					arr[i]= temp;
				}
			}
		}
		
		
		for(int i = 0; i<n ; i++)
		{
			for(int j=i+1; j<n ; j++)
			{
				if(arr[i] == arr[j])
				{
					//left shifting, deleting repeated element
					for(int k = j+1; k<n ; k++)
					{
						arr[k-1]=arr[k];
					}
					n--;
					j--;
				}
			}
		}
		System.out.println("Array after removing repeated elements");
		for(int i= 0; i<n; i++)
		{
			System.out.println(arr[i]);
		}
		

	}

}
