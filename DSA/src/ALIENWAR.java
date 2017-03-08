import java.util.Scanner;

public class ALIENWAR {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
int x=s.nextInt();
for (int i=0;i<x;i++)
{
	int a=s.nextInt();
	
	int b=s.nextInt();

	int c=s.nextInt();

	int d=s.nextInt();
	if(b*(Math.log(a )/Math.log(2))>(d*(Math.log(c )/Math.log(2))))
	{
		System.out.println("Alien");
	}
	else 
	{
		System.out.println("Warrior");

	}
	


}

	}

}
