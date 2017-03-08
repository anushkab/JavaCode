import java.util.Scanner;

public class FOOBARR {
	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		int x=s.nextInt();
		for (int k=0;k<x;k++){
		String c=s.next();
	    int index=c.indexOf("foobar");
	    int count=0;
	    while(index!=-1)
	    {
	    	count++;
	    	c=c.substring(index+1);
	    	index=c.indexOf("foobar");
	    	
	    }
	    System.out.println(count);
	}

}
}