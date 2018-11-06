import java.util.Scanner;
public class SortedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter element Number");
		int n = in.nextInt();
		int[] a = new int[n];
		System.out.println("Enter Array element");
		for(int i =0 ; i<n ; i++)
		{
			a[i]= in.nextInt();
		}
		int[] b 
		//Sorting array in decreasing 
		for(int i= 0; i<n-1; i++)
		{
			for(int j = i+1; j<n ; j++)
			{
				if(a[j]>a[i])
				{
					int temp = a[j];
					a[j] = a[i];
					a[i]= temp;
				}
			}
		}
//		//Sorting array in increasing 
//				for(int i= 0; i<n-1; i++)
//				{
//					for(int j = i+1; j<n ; j++)
//					{
//						if(a[j]<a[i])
//						{
//							int temp = a[j];
//							a[j] = a[i];
//							a[i]= temp;
//						}
//					}
//				}
//		
		//displaying decreasing order
		System.out.println("Decresing");		
		for(int i=0 ; i<n ; i++)
		{
			System.out.println(a[i]);
		}
		
		//displaying increasing order
		System.out.println("Increasing");
				for(int i=0 ; i<n ; i++)
				{
					System.out.println(a[i]);
				}

	}

}
