package trend.nxtCorejava;

import java.util.ArrayList;

public class dec_binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int dec = 156;
			ArrayList<Integer> bin = new ArrayList<Integer>();
			int rem[] = new int[20];
			//int i=0;
			while(dec!= 1)
			{
				bin.add(dec%2);
				dec = dec/2;
				
				//i++;
			}
			if(dec == 1)
			{
				bin.add(1);
			}
			else if(dec == 0)
			{
				bin.add(0);
			}
			
			for(int i =bin.size()-1 ; i>=0 ; i--)
			{
				System.out.print(bin.get(i));
			}
			
			
			
	}

}
