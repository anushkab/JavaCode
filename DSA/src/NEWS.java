import java.util.Scanner;

public class NEWS {
	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		String P=s.next();
		
		int a=s.nextInt();

for(int k=0;k<a;k++){
		int x=s.nextInt();
		String str=s.next();
	    int count=0;
		String t=P;

		if(str.length()==x)
		{
		    int index=t.indexOf(str);
		    while(index!=-1)
		    {
		    	count++;
		    	t=t.substring(index+1);
		    	index=t.indexOf(str);
		    	
		    }
		    System.out.println(count);
		}
}

	}

}
