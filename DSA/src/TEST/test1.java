package TEST;

import java.io.*;
import java.util.Scanner;
class STACKIT{
	 int size;
	
	 
	 String[] sstack;
	 int top=-1;
	 public STACKIT(){
	 this.size=3000;
      sstack= new String[(int) size];
	 }
	public void push(String item){
		this.sstack[(int) (this.top+1)]=item;
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
		String e=this.sstack[(int) top];
		this.sstack[(int) top]=null;
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
		String e=this.sstack[(int) top];
		return e;
	}
}
public class test1{
	public static STACKIT ADD(STACKIT a,STACKIT b){
	if(a.top<b.top)//having a as the high one
	{
		 STACKIT temp =a;
		a=b;
		b=temp;
			}
	int carry=0;
	STACKIT addedstack=new STACKIT();

	while(!(a.isEmpty()) && !(b.isEmpty()))
	{
		String j=a.pop();
	String h=b.pop();
try{
		int adding=Integer.parseInt(j)+Integer.parseInt(h) +carry;
	int add=adding%10;
	addedstack.push(String.valueOf(add));
	carry=adding/10;
}
catch(Exception e)
{
	System.out.println(e.getStackTrace());
}

	}
	while(!a.isEmpty())//a is not empptyyyyyyyyy
	{
		try{
		int adding=Integer.parseInt(a.pop()) +carry;

		addedstack.push(String.valueOf(adding%10));
		carry=adding/10;
		}
	
	catch(Exception e)
	{}

	}
	while(!b.isEmpty())//a is not empptyyyyyyyyy
	{
		try{
		int adding=Integer.parseInt(b.pop()) +carry;
		addedstack.push(String.valueOf(adding%10));
		carry=adding/10;
		}
	
	catch(Exception e)
	{
		System.out.println(e.getStackTrace());

	}

	}

	if (carry!=0){
		addedstack.push(String.valueOf(carry));
	};
	STACKIT finaladded= new STACKIT();
	while(!addedstack.isEmpty())
	{
		finaladded.push(addedstack.pop());
	}

	return finaladded;
		}

	public static void display(STACKIT x)
	{
		for(int h=x.top;h>=0;h--)
		{
			System.out.print(x.sstack[(int) h]);
		}
		System.out.println();
	}


	public static STACKIT multiply(  STACKIT a,int b)
	{
		STACKIT sum=new STACKIT();
		sum.push("0");

		String[] number2= String.valueOf(b).split("");
//		System.out.println(number2.length);
		STACKIT adder=new STACKIT();
		int gi=number2.length-1;
			for (int p=number2.length-1;p>=0;p--)

					{
//				int b1=0;
//				try{

						int b1=Integer.parseInt(number2[(int) p]);
//				}
				
//			catch(Exception e)
//			{
//				System.out.println(e.getStackTrace());

//			}

						String[] number1= (a.sstack);
						int carry=0;

						for (int j=a.top;j>=0;j--)
						{
							try
							{
								int tobepushed=((Integer.parseInt(number1[j]))*b1 +carry)%10;
								carry =((Integer.parseInt(number1[j]))*b1 +carry) /10;
								adder.push(String.valueOf(tobepushed));
							}
							catch(Exception e)
							{
								System.out.println(e.getStackTrace());
							}

						}
						if (carry!=0)
						{
							adder.push(String.valueOf(carry));
						}
					adder=reverse_the_stack(adder);
					for(int f=0; f<gi-p;f++)
						{
						adder.push("0");
						}

//					display(adder);

		sum=ADD(sum,adder);
	}
			return sum;
	}
	public static STACKIT reverse_the_stack(STACKIT m)
	{
		STACKIT reversed= new  STACKIT();
		while(!m.isEmpty())
		{
			reversed.push(m.pop());
		}
		return reversed;
	}

	public test1(){
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) throws IOException

	{
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	Scanner s= new Scanner(System.in);
//	String s=reader.readLine();
//	if(s == "") return;
	int n=s.nextInt();
//	int n = Integer.Int(s);
	STACKIT one =new STACKIT();
	
	one.push("1");
	
	for(int a=2;a<=n;a++)
	{
	one=multiply(one,a);
	
display(reverse_the_stack(one));
System.out.println();

}
	}
}
