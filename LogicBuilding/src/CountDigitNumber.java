import java.util.Scanner;

public class CountDigitNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// TODO Auto-generated method stub
				Scanner in = new Scanner(System.in);
				int input1 = in.nextInt();
				int count =0;
				
				while(input1 != 0)
				{
					input1=input1/10;
					count++;
				}
					System.out.println(count);

	}

}
