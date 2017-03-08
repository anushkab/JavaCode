import java.util.Scanner;

public class DEF {
private static Scanner s;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s=new Scanner(System.in);
		int t=s.nextInt();
		for(int a=0;a<t;a++)
		{
		int k=s.nextInt();
		int sum=0;
		for(int b=0;b<k;b++)
		{
			int numsock=s.nextInt();
			sum+=(numsock/3);
		}
		
		System.out.println(sum);
		
		}
		
		
		
		
		
		
		
		
	}

}
