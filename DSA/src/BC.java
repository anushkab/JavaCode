import java.util.Scanner;

public class BC {

	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		int k =s.nextInt();
		for(int a=0;a<k;a++)
		{
int c=s.nextInt();

int count=0;
String l=(Integer.toBinaryString(c));


char charToLookFor='1';
 
while(l.indexOf(charToLookFor) != -1)
{
count+=1;
l = l.substring(l.indexOf(charToLookFor)+1);
}







System.out.println(count);

		// TODO Auto-generated method stub

	
	}
	}
}

