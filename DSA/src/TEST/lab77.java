package TEST;
import java.io.*;
class satckmade{
	 int size;
	 String[] sstack;
	 int top=-1;
 public satckmade(){
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
public class lab77 {
	public static satckmade ADD(satckmade a,satckmade b){
	if(a.top<b.top)//having a as the high one
	{
		 satckmade temp =a;
		a=b;
		b=temp;
			}
	int carry=0;
	satckmade addedstack=new satckmade();
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
	satckmade finaladded= new satckmade();
	while(!addedstack.isEmpty())
	{
		finaladded.push(addedstack.pop());
	}

	return finaladded;
		}
	
	public static void display(satckmade x)
	{
		for(int h=x.top;h>=0;h--)
		{
			System.out.print(x.sstack[(int) h]);
		}
		System.out.println();
	}

	
	public static satckmade multiply(  satckmade a,int b)
	{
//		if (a<b)
//		{
//			int temp=a;
//			a=b;
//			b=temp;
//			
//		}//a is always biggsatcker'
		satckmade sum=new satckmade();
		sum.push("0");
		String[] number2= String.valueOf(b).split("");
		int gi=number2.length-1;
			for (int p=number2.length-1;p>=0;p--)
			{
						int b1=Integer.parseInt(number2[(int) p]);
						satckmade addeer= new satckmade();
						int carry=0;
								while(!a1.isEmpty())
									{
										int tobe=	Integer.parseInt(a1.pop())*b1 +carry ;
										int tobepush= tobe%10;
										carry= tobe/10;
										addeer.push(String.valueOf(tobepush));
									}
								if (carry!=0)
								{
									addeer.push(String.valueOf(carry));
								}
									addeer=reverse_the_stack(addeer);
								for(int f=0; f<gi-p;f++)
								{
									addeer.push("0");
								}


								 a1=a.clone();
				sum=ADD(sum,addeer);
				
				}
				return sum;
	}
	public static satckmade reverse_the_stack(satckmade m)
	{
		satckmade reversed= new  satckmade();
		while(!m.isEmpty())
		{
			reversed.push(m.pop());
		}
		return reversed;
	}


	public static void main(String[] args)
	
	{			
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		
		
		
		

	
satckmade hu=new satckmade();
hu.push("1");
//hu.push("6");
		display(reverse_the_stack(multiply(hu,393)));	}

}
