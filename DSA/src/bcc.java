import java.util.Scanner;

public class bcc {
	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		long k =s.nextLong();
		for(long a=0;a<k;a++)
		{
		long x=s.nextLong();
		int count=0;
		do {
			  if((x&1)==1)
			  {count++;}
			  x = x >> 1;
			} while (x > 0);
		  System.out.println(count);

	}
	}
}
