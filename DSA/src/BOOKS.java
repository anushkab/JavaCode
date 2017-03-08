import java.util.Scanner;

public class BOOKS {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
int x=s.nextInt();
int sum=0;
while(x>0)
{

	String z=String.valueOf(x);

	sum+=z.length();

	x--;
	
}
System.out.println(sum);




}

	
}