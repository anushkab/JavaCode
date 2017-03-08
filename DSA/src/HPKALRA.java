import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HPKALRA {

	public static void main(String[] args)throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String dr=reader.readLine();
		int ya=Integer.parseInt(dr);
for (int a=0;a<ya;a++)
{
    Scanner scanner = new Scanner(System.in);
	
    long num = scanner.nextInt(), i;
    /*for (i = 2; i <= num / 2; i++) {
        if (num % i == 0) {
        	
count++  ;    
}
    }
	{count++;}  */
        long limit = num;
        int numberOfDivisors = 0;

        if (num == 1) numberOfDivisors= 1;
        else
        {
        for (int  j= 1; j < (limit)/2; j++)
        {
            if (num % j == 0) 
            
            {
                numberOfDivisors++;
            }
        }
        }


    
    if(numberOfDivisors==1)
    {
    	System.out.println(1);
    }
    else
	{
System.out.println((numberOfDivisors)%2);

}
	}
	}

}

