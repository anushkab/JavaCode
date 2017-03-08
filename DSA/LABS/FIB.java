package LABS;

import java.util.Scanner;

public class FIB {
	//recursive algo
	 public static int rFib( int n,int m) {
		 if (n<= 1)
			 return n;
		 else

			 return (rFib (n-1,m) + rFib (n-2,m))%m;

	 }
	 //iterative algo
	 public static long iFib( long n,int m) 
	 {
		 
		 if (n<= 1)
			 return n;
	 else
	 {
		 long a=0;
		 long b=1;
		 for(long i=2;i<n+1;i++)
		 {
			long temp=b;
			b=(a+b)%m;
			a=temp;
		 }
		 return b;

	 }
	 }
	 
	 
	 //for clever algo
	 
	 
	 
		public static void multiplyarray(int F[][],int A[][],int m){
			int x=F[0][0]*A[0][0]+F[0][1]*A[1][0];
			int y=F[0][0]*A[0][1]+F[0][1]*A[1][1];
			int z=F[1][0]*A[0][0]+F[1][1]*A[1][0];
			int w=F[1][0]*A[0][1]+F[1][1]*A[1][1];

			F[0][0]=x;
			F[0][1]=y;
			F[1][0]=z;
			F[1][1]=w;
		}
		static void raise(int F[][], long n,int m){
		    if( n==0 || n==1)
		      return;
		    int A[][]=new int[][]{{1,1},{1,0}};
		      
		    raise(F,n/2,m);
		    multiplyarray(F,F,m);
		      
		    if(n%2 != 0)
		       multiplyarray(F, A,m);
		    }

		public static long CLEVERfib(long l,int m)
		{
			int F[][] = new int[][]{{1,1},{1,0}};
		    if(l==0)
		    {
		    	return 0;
		    }
		    raise(F, l-1,m);
		    
		    return F[0][0];
		   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		Scanner scan =new Scanner(System.in);
//		long n =scan.nextInt();
//		int m =scan.nextInt();
		long starttime = System.currentTimeMillis();
		long a=CLEVERfib((long)1000000000000000.0,2014);
		//int a=rFib(n);
		
		//int a=iFib(n);

		long endtime =System.currentTimeMillis();
		System.out.println(a);
		double TimeElapsed =(endtime-starttime)/1000.0;
		System.out.println(TimeElapsed);
//		   int n = 9;
		     //System.out.println(iFib(n));

	}

}
