

import java.io.*;

public class CSUM {


	public static void main(String[] args)throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String dr=reader.readLine();
		int limit=Integer.parseInt(dr);

		for(int a=0;a<limit;a++)
				{
			String dre=reader.readLine();
			int lit=Integer.parseInt(dre);
			float sum=0;

			String[] dr1 =reader.readLine().split(" ");
for(int i=0;i<lit;i++)
{
	sum+=Integer.parseInt(dr1[i]);

}
System.out.printf("%.2f", sum/2);

				}
		// TODO Auto-generated method stub

	}

}
