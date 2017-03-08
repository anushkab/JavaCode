package TEST;
//factorial of a large number
//through elemtary stack multiplication
import java.io.*;
import java.util.Scanner;
class stackm{
	int size;
	Integer[] sstack;
	int top=-1;
	public stackm(){
		this.size=3000;
		sstack= new Integer[ size];
	}
	public void push(int item){
		this.sstack[(int) (this.top+1)]=item;
		this.top++;
	}
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		return top<0;
	}
	public int pop(){
		if (this.isEmpty())
		{
			return -1;
		}
		int e=this.sstack[top];
		this.sstack[top]=(Integer) null;
		top--;
		return e;
	}
	public int topelem()
	{
		if (this.isEmpty())
		{
			//			System.out.println("isEmpty so printong #");
			return -1;
		}
		int e=this.sstack[top];
		return e;
	}
}
public class lab777 {
	public static stackm ADD(stackm a,stackm b){
		if(a.top<b.top)//having a as the high one
		{
			stackm temp =a;
			a=b;
			b=temp;
		}
		int carry=0;
		stackm addedstack=new stackm();

		while(!(a.isEmpty()) && !(b.isEmpty()))
		{
			int j=a.pop();
			int h=b.pop();
			if(j != -1 && h != -1){
				int adding=(j)+(h) +carry;
				int add=adding%10;
				addedstack.push((add));
				carry=adding/10;
			}
		}
		while(!a.isEmpty())//a is not empptyyyyyyyyy
		{
			int j = a.pop();
			if (j != -1){
				int adding=j +carry;
				addedstack.push((adding%10));
				carry=adding/10;
			}
		}
		while(!b.isEmpty())//a is not empptyyyyyyyyy
		{
			int j = b.pop();
			if(j != -1){
				int adding= j +carry;
				addedstack.push((adding%10));
				carry=adding/10;
			}
		}	
		if (carry!=0){
			addedstack.push((carry));
		};
		stackm finaladded= new stackm();
		while(!addedstack.isEmpty())
		{
			int j = addedstack.pop();
			if(j != -1)
				finaladded.push(j);
		}

		return finaladded;
	}

	public static void display(stackm x)
	{
		for(int h=x.top;h>=0;h--)
		{
			System.out.print(x.sstack[(int) h]);
		}
	}


	public static stackm multiply(  stackm a,int b)
	{
		
		
		stackm sum=new stackm();
				sum.push(0);
		String[] number2= (String.valueOf(b)).split("");
		int b1=0;
		stackm adder=new stackm();		
		int gi=number2.length-1;
		for (int p=number2.length-1;p>=0;p--)
		{ 
			//				if(number2[p]=="")
			//					{
			//					return sum	;
			//					}
			//					System.out.println(number2[p]);
			try{
			 b1=Integer.parseInt(number2[p]);
			}
			catch(Exception e)
			{
				System.out.println(e.getStackTrace());
			}
			Integer[] number1= (a.sstack);
			int carry=0;
			for (int j=a.top;j>=0;j--)
			{
				int tobepushed=(((number1[j]))*b1 +carry)%10;
				carry =(((number1[j]))*b1 +carry) /10;
				adder.push((tobepushed));

			}	
			if (carry!=0)
			{
				adder.push((carry));
			}
			adder=reverse_the_stack(adder);
			for(int f=0; f<gi-p;f++)
			{
				adder.push(0);
			}

			//					display(adder);

			sum=ADD(sum,adder);
		}
		return sum;
	}
	public static stackm reverse_the_stack(stackm m)
	{
		stackm reversed= new  stackm();
		while(!m.isEmpty())
		{
			reversed.push(m.pop());
		}
		return reversed;
	}
//
//	public lab777() {
//		// TODO Auto-generated constructor stub
//	}

	public static void main(String[] args) throws IOException
	{
		Scanner s= new Scanner(System.in);
		int n=s.nextInt();
		stackm one =new stackm();
		one.push(1);
		for(int a=2;a<=n;a++)	
		{
			one=multiply(one,a);
		}
		display(reverse_the_stack(one));
		Scanner sI= new Scanner(System.in);
		String nI=sI.next();
		
//	IF(	NI=="ANUSHKA")
//	{
//		SYSTEM.OUT.PRINTLN("YOOOO");
//	}
//	ELSE
//	{
//		SYSTEM.OUT.PRINTLN("NOOOO");
//
//	}
				
				

	}
}
