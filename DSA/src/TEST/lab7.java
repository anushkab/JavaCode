package TEST;
import java.io.*;
class makestack{
	 int size;
	 String[] sstack;
	 int top=-1;
 public makestack(){
	 this.size=1000;
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
public class lab7 {
	public static makestack ADD(makestack a,makestack b){
	if(a.top<b.top)//having a as the high one
	{
		 makestack temp =a;
		a=b;
		b=temp;
			}
	int carry=0;
	makestack addedstack=new makestack();
	while(!a.isEmpty() && !b.isEmpty())
	{
		int adding=Integer.parseInt(a.pop())+Integer.parseInt(b.pop()) +carry;
	int add=adding%10;
	addedstack.push(String.valueOf(add));
	carry=adding/10;
	}
	while(!a.isEmpty())
	{
		addedstack.push(a.pop());
	}
	if (carry!=0){
		addedstack.push(String.valueOf(carry));
	};
	makestack finaladded= new makestack();
	while(!addedstack.isEmpty())
	{
		finaladded.push(addedstack.pop());
	}

	return finaladded;
		}
	
	public static void display(makestack x)
	{
		for(int h=x.top;h>=0;h--)
		{
			System.out.print(x.sstack[(int) h]);
		}
		System.out.println();
	}

	
	public static makestack multiply(  int a,int b)
	{
		if (a<b)
		{
			int temp=a;
			a=b;
			b=temp;
			
		}//a is always bigger
	
		makestack sum=new makestack();
		sum.push("0");
		String[] number2= String.valueOf(b).split("");
		makestack adder=new makestack();		
		int gi=number2.length-1;
			for (int p=number2.length-1;p>=0;p--)
				
					{
						int b1=Integer.parseInt(number2[(int) p]);
						String[] number1= String.valueOf(a).split("");
						int carry=0;
						for (int j=number1.length-1;j>=0;j--)
						{
								int tobepushed=((Integer.parseInt(number1[(int) j]))*b1 +carry)%10;
								carry =((Integer.parseInt(number1[(int) j]))*b1 +carry) /10;
								adder.push(String.valueOf(tobepushed));
								
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
		
					
		
		sum=ADD(sum,adder);
	}
			return sum;
	}
	public static makestack reverse_the_stack(makestack m)
	{
		makestack reversed= new  makestack();
		while(!m.isEmpty())
		{
			reversed.push(m.pop());
		}
		return reversed;
	}

	public lab7() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args)
	
	{			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		int n=1;
//for (int a=1;a<=x;a++)
{
	
}
		
		
		
		
		Long l1 = Long.parseUnsignedLong("1791688123794312345");

		int value = 987;

		reverse_the_stack(multiply(9,1006));	}

}
