import java.util.Scanner;

public class FOOBAR {
	private static Scanner s;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		int x=s.nextInt();
		for (int k=0;k<x;k++){
		String c=s.next();
		String input = c.toLowerCase();// Make your input toLowerCase.
	    int[] alphabetArray = new int[26];

	    for ( int i = 0; i < input.length(); i++) {
	         char ch=  input.charAt(i);

	         int value = (int) ch;
	         if (value >= 97 && value <= 122){
	         alphabetArray[ch-'a']++;
	        }
	    }
        int f =  alphabetArray['f'-'a'];
        int o =  alphabetArray['o'-'a']/2;
        int b =  alphabetArray['b'-'a'];
        int a =  alphabetArray['a'-'a'];
        int r =  alphabetArray['r'-'a'];

     {
    	 int y=Math.min(f, o);
    	 int t=Math.min(b, a);
    	 int p=Math.min(a, r);
    	 int q=Math.min(p, t);
    	System.out.println(Math.min(y,q ));
     }
	    
	    
	}

}
}