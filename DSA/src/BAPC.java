import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BAPC {

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
boolean b=false;
boolean[] arry=new boolean[(int) maxn+5];
for(int d=1;d<=maxn;d++)
{
	arry[d]=false;
}

for(int a=1;a<=maxn;a++)
{
	{
		if(maxun%a!=0)
		{
			b=!b;
			
		}
	}
}
if(arry[maxun])
{
	System.out.println("on");
}
else
	{
	System.out.println("off");
	}
}
	}

}
