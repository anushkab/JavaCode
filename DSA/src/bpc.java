import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class bpc {

	public static void main(String[] args)throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String dr=reader.readLine();
		int testcases=Integer.parseInt(dr);
		for(int g=0;g<testcases;g++)
		{
		String[] strrr=reader.readLine().split(" ");
		int maxn=Integer.parseInt(strrr[0]);
		int maxun=Integer.parseInt(strrr[1]);

boolean[] arry=new boolean[(int) maxn];
if(maxn%2==0)
{
	if((int) Math.sqrt(maxun)==Math.sqrt(maxun))
	{
		System.out.println("on");
		
	}
	else 
	{
		System.out.println("off");

	}
}
else 
{
	if((int) Math.sqrt(maxun)==Math.sqrt(maxun))
	{
		System.out.println("off");
		
	}
	else
	{
		System.out.println("on");

	}

}

	}

}
}
