package TEST;

public class test {
	public static void hanoi(int n, char from, char to, char temp){
	
	if(n==1)
	{
		System.out.print(from + "to" + to);
		
	}
	
	else
	{
		hanoi(n-1,from,temp,to);
		System.out.print(from + "to" + to);
		hanoi(n-1,temp,to,from);
	}
	
	}

}
