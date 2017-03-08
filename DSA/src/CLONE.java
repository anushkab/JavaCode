import java.util.Scanner;

public class CLONE {
private static Scanner s;


	public static void main(String[] args) {
		// TODO Auto-generated method stub
s=new Scanner(System.in);
int N = s.nextInt();
int n= s.nextInt();
int[] DNAnum=new int[n];
for (int i =0;i<n;i++)
{
DNAnum[i]=s.nextInt();

}
for (int d =0;d<n;d++)
{if(N-DNAnum[d]==0)
{
	System.out.print(-1);
	System.out.println();

}
	for(int j=0;j<N-DNAnum[d];j++)
{
System.out.print(DNAnum[d]);
System.out.println();
}
}


	}

}
