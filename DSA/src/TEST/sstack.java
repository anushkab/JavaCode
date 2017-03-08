package TEST;

//Anushka Bhandari (2016134)

import java.io.*;
import java.util.*;
 class YEHIHAI{
	 int size;
	 String[] sstack;
	 int top=-1;

	 public YEHIHAI(int size){
		 this.size=size;
       sstack= new String[size];
	 }
	public void push(String item){
		this.sstack[this.top+1]=item;
		this.top++;


	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top<0;
	}
	public YEHIHAI store(String[] x){
		YEHIHAI hello=new YEHIHAI(x.length);
		for(int h=0;h<x.length;h++){
			hello.push(x[h]);
		}
		
		
		
		return hello;
		
	}
	public String pop(){
		if (this.isEmpty())
		{
			{return "#";}
		}
		String e=this.sstack[top];
		this.sstack[top]=null;
		top--;
		return e;

	}
	public String topelem()
	{
		if (this.isEmpty())
		{
//			System.out.println("isEmpty so printong #");
			{return "#";}
		}
		String e=this.sstack[top];
		return e;

	}

}

public class sstack  {

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
//		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//		String s=reader.readLine();
//		int T = Integer.parseInt(s);
		int T=2;

System.out.println(fact1(T));

	 }
	 public static int ADD (int j,int o){
		 String[] y=Integer.toString(j).split("");
		 YEHIHAI first =new YEHIHAI(y.length) ;
		first.store(y);

		 String[] z=Integer.toString(j).split("");
		 YEHIHAI second =new YEHIHAI(z.length) ;
			second.store(y);
int c=0;
YEHIHAI answer =new YEHIHAI(Math.max(z.length,y.length)+1) ;
int g=0;
		 while(!first.isEmpty() || !second.isEmpty())
		 {if(!first.isEmpty() && !second.isEmpty())
			{g= (Integer.parseInt(first.pop())+Integer.parseInt(second.pop()));}
		 else if(first.isEmpty())
		 {
			  g=Integer.parseInt(second.pop());
			 
		 }
		 else if(second.isEmpty())
		 {
			  g=Integer.parseInt(first.pop());
 
		 }
			g+=c;
			 String T=Integer.toString(g);

			answer.push(T);
			c=carry(g);
			 
			 
		 }
		 


 int f=valur(answer);	
 return f;
		 
		 
		 
		 
		 
	 }


	 private static int  valur(YEHIHAI answer) {
String[] ui=new String[answer.size];
int a=0;
		 while(!answer.isEmpty()){
	      ui[a]=(answer.pop());
a++;
		 }
         String str1 = Arrays.toString(ui);               

		 return Integer.parseInt(str1);
		// TODO Auto-generated method s
		 
		
	}
	private static int carry(int g) {
		 if(g<=9){
			 return g;
		 }
		 else{
			 return (int)g/10;
		 }
		// TODO Auto-generated method stub
	}
	public static int fact1 (int x)
	 {if (x<  1) 
		 return 1;
	 else
		 return mul(x, (fact1 ( x-1)));
	 }

	 private static int mul(int x, int i) 
	 {
		 String[] y=Integer.toString(x).split("");
		 YEHIHAI first =new YEHIHAI(y.length) ;
		 int o=0;
		 int sum=0;
for(int a=y.length-1; a>=0;a++)
{
	int j= Math.abs(a-y.length)
			;
	int u=(int) (Integer.parseInt(y[a])*i * (Math.pow(10, j )));
	
	sum=ADD(u,o);
	o=sum;
	
	
}

	return sum;
		 
		 
	}

 }





