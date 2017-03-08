package TEST;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class madestack {
	public static Integer CAP=3000;
	public Integer c;
	public Integer s[];
	public Integer top=-1;
	public int size(){
		return(top+1);
	}
	public madestack (Integer cap) {
		c=cap;
		s=new Integer[c];
	}
	public madestack(){
		this(CAP);
	}
	public Integer pop(){
		if (this.top>=0){
			Integer ptr=s[this.top];
			s[this.top]=null;
			this.top--;
			return(ptr);
			}
		return(null);
	}
	public void print(){
		for(int i=0; i<this.size(); i++){
			System.out.print(this.s[i]);
		}
	}	

	public void push(Integer n){
		s[this.top+1]=n;
		this.top+=1;
	}
	
		
	public madestack reverrse_the_stack(){
		madestack S=new madestack();
		while(this.top!=-1){
			S.push(this.pop());
		}
		return(S);
	}
	public static madestack add(madestack a, madestack b){
		madestack resultrev=new madestack();
		Integer sum=0;
		Integer second=b.size();
		Integer carry=0;
		Integer first=a.size();

		a=a.reverrse_the_stack();
		b=b.reverrse_the_stack();
		Integer j;
		//checking the max between frst and second
		
if(first>second)
{
	j=first;
}
else
{
	j=second;
}
		for (int i=0; i<j; i++)
		{
			if( b.size()!=0 && a.size()!=0 )
			{
				sum=a.pop()+b.pop()+carry;
			}
			else if(a.size()==0)
			{
				sum=b.pop()+carry;
			}
			else if(b.size()==0)
			{
				sum=a.pop()+carry;
			}
			resultrev.push(sum%10);
			carry=sum/10;
		}
		if (carry!=0)
		{
			resultrev.push(carry);
		}
		madestack result=resultrev.reverrse_the_stack();
		return(result);
	}
	
	public madestack mult(Integer n)
	{
		Integer si=this.size();
		Integer m=n;
		madestack result=new madestack();
		int VaL=0;
		while (m!=0)
		{
			Integer product=0;
			Integer carry=0;
			madestack l=new madestack();
			for (int i=0; i<VaL; i++)
			{
				l.push(0);
			}
			for (int i=0; i<si; i++)
			{
				product=this.s[i]*(m%10)+carry;
				l.push(product%10);
				carry=product/10;
			}
			m=m/10;
			if (carry!=0)
			{
				l.push(carry);
			}
			result=result.reverrse_the_stack();
			result=add(result,l);
			VaL++;
		}
		return(result);
	}
	
	public static madestack factorial(Integer n){
		Integer m=n;
		madestack result=new madestack();
		while(m!=0)
		{
			result.push(m%10);
			m=m/10;
		}
		for(int i=n-1; i>1; i--)
		{
			result=result.mult(i);
			result=result.reverrse_the_stack();
		}
		result=result.reverrse_the_stack();
		return(result);
	}

public static void main(String[] args) throws NumberFormatException, IOException 
{
	BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
	 int n=Integer.parseInt(inp.readLine());
		madestack s1=factorial(n);
		s1.print();
	}
}