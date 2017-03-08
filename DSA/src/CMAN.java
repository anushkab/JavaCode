import java.util.Scanner;


public class CMAN {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		String x=s.nextLine();
		String R=s.nextLine();
		int count=0;
		String str = "";
char[] arr= x.toCharArray() ;
for(int i=0; i<arr.length;i++){ 
	count=R.indexOf(arr[i]);
	if(count!=-1 ){

		str+=arr[i];
}

}
String [] strr = str.split("");


for (int i = 0; i < strr.length - 1; i++)
{
    for (int j = 0; j < strr.length - 1; j++)
    {
        if (strr[j].compareTo(strr[j+1]) > 0)

        {

            String temp = strr[j];

            strr[j] = strr[j+1];

            strr[j+1] = temp;

        }

    }

}
String str4="";
for (int i = 0; i < strr.length - 1; i++)
{
	str4+=strr[i];
	}
System.out.print(str4);

	}

}