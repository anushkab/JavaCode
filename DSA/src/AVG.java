import java.util.Scanner;

public class AVG {
	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
int x=s.nextInt();
int sum=0;
int count=0;

int[] arr=new int[x];
for(int i=0;i<x;i++)
{
arr[i]=s.nextInt();
sum+=arr[i];
}
int avg=sum/x;
for(int i=0;i<x;i++)
{
if(arr[i]>avg)
	count++;
}
System.out.println(count);

	}

}
