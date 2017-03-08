import java.util.Scanner;

public class CMANN {

	private static Scanner s;

	public static void main(String[] args) {
		s = new Scanner(System.in);
		int x=s.nextInt();
//		s.nextLine();
		for (int k=0;k<x;k++){
		String R=s.next();
		String c=s.next();

		String input1 = R.toLowerCase();// Make your input toLowerCase.

		String input2 = c.toLowerCase();// Make your input toLowerCase.
	    int[] alphabetArray = new int[26];
	    int[] alphabetArray2 = new int[26];

	    for ( int i = 0; i < input1.length(); i++ ) {
	         char ch=  input1.charAt(i);

	         int value = (int) ch;
	         if (value >= 97 && value <= 122){
	         alphabetArray[ch-'a']++;
	        }
	    }
	    for ( int i = 0; i < input2.length(); i++ ) {
	         char ch=  input2.charAt(i);

	         int value = (int) ch;
	         if (value >= 97 && value <= 122){
	         alphabetArray2[ch-'a']++;
	        }
	    }

	

	 for (int i = 0; i < alphabetArray.length; i++) {
		if(alphabetArray[i]>0){
	        char ch = (char) (i+97);
	        for(int j=0;j<Math.min(alphabetArray[i], alphabetArray2[i]);j++)
	        	{      System.out.print(ch);      
	        	}      
		}         
	 }
	 System.out.println();
	}
}
}

