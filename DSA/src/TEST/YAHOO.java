package TEST;

//Anushka Bhandari (2016134)

import java.io.*;
import java.util.*;
 class YAHOOimp{
	 int size;
	 String[] YAHOO;
	 int top=-1;

	 public YAHOOimp(int size){
		 this.size=size;
       YAHOO= new String[2*size];
	 }
	public void push(String item){
		this.YAHOO[this.top+1]=item;
		this.top++;


	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top<0;
	}

	public String pop(){
		if (this.isEmpty())
		{
			{return "#";}
		}
		String e=this.YAHOO[top];
		this.YAHOO[top]=null;
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
		String e=this.YAHOO[top];
		return e;

	}

}

public class YAHOO  {

	private static String popped;
	public static String[] Y;
	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		int T = Integer.parseInt(s);

		String[] ti=reader.readLine().split(" ");
		YAHOOimp YES=new YAHOOimp(T);
		Y=new String[T];

		for(int a=0;a<ti.length;a++)
		{
			if(ti[a].equals("/"))
			{
				int b=a-1;
				if(leftpara(ti[b]))
				{
					ti[a]="~";
				}
			}
//			System.out.println("I AM" +ti[a]);
			buyah(ti[a],YES);
//			System.out.println(YES.topelem());

		}
while(!YES.isEmpty())
{
  System.out.print(YES.pop() + " ");
}
//for(int a=0;a<Y.length;a++)
//{
//{if(Y[a]==(null))
//{
//	break;
//}
//	System.out.print(Y[a] + " ");
//
//}
//}
	}
	 public static boolean operator(String s)
	 {if((s.equals("+"))||(s.equals("-"))||(s.equals("*"))||(s.equals("~"))||(s.equals("/")))
		 return true;
	 else
		 return false;


	 }

	 public static boolean leftpara(String s)
	 {return(s.equals("("));
	 }
	 public static boolean rightpara(String s)
	 {return(s.equals(")"));
	 }
	 public static boolean operand(String s)
	 {
     boolean sd=false;
     if((!s.equals("/"))&&(!s.equals("*"))&&(!s.equals("+"))&&(!s.equals("~"))&&(!s.equals("-"))&&(!s.equals("("))&&(!s.equals(")")))
     {sd= true;}

	 return sd;
		}

	 public static void Ldd(String h)
	 {
for(int i=0;i<Y.length;i++)
{
if(Y[i]==null)
{
	Y[i]=h;
//	System.out.println(" Ldd to Y value being"+Y[i]);
	return;
}
}
	 }
	 public static int incomingprec(String elem){
		 switch(elem)
		 {
		 case "~":return 4;
		 case "+":return 3;
		 case "*":return 3;
		 case "-":return 2;
		 case "/":return 2;

		 default :return 0;


		 }



	 }
	 public static void buyah(String k,YAHOOimp s)
	 {

		 if(operand(k))
		 {

			 System.out.print(k+" ");
//			 System.out.println("PUSHadded to string Y in operand");



		 }



		 else if(operator(k))
		 {
			 String elem=k;
			 int incomingpre=incomingprec(elem);
			 String ele=s.topelem();
			 int pretop=incomingprec(ele);
			 if(incomingpre>pretop)
			 {
				 s.push(elem);
//				 System.out.println("PUSH HAD TAKEN PLACEin operator");

			 }
			 else
			 {
				 while(pretop>=incomingpre)
				 {	if (ele=="#") {break;}
					 popped=s.pop();
					 ele=s.topelem();
					 pretop=incomingprec(ele);
					 System.out.print(popped+" ");
//					 System.out.println("continuos adding to Y and popping form stack HAD TAKEN PLACEin operator");

					 }
				 s.push(elem);
//				 System.out.println("PUSH HAD TAKEN PLACEin operator");

			 }

		 }
		 else if(leftpara(k))
		 {

			 s.push(k);
//			 System.out.println("PUSH HAD TAKEN PLACEin leftpara");
}



		 else if(rightpara(k))
	 {
		 popped=s.pop();
	 while(!leftpara(popped))
	 {
System.out.print(popped+" ");
//System.out.println("System.out.print to Y HAD TAKEN PLACEin rightpara0 popping done " );

if(!s.isEmpty())
{popped=s.pop();}
	 }

	 }


 }




}
