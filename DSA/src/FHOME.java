import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FHOME {

		public static void main(String[] args)throws IOException
		{
			BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
			String dr=reader.readLine();
			int ya=Integer.parseInt(dr);

			String rory=reader.readLine();

			String[] testcases=(rory).split(" ");
			String[] yo=testcases;
			int count=0;
			for(int g=0;g<ya;g++)
			{
			//if(testcases[0].equals(yo[g])==false&& testcases.indexOf(yo[g] ))
			{
				yo[g]=" ";
				count++;
			}
			
	}
			if(count>3)
			{
				System.out.println("NO");
			}
			else
			{
				System.out.println("YES");
			}

		}
}
