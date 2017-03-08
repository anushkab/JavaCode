/*import java.util.Scanner;

public class LAB {
	private static Scanner s;
	int[] first;
	int t ;
	public LAB(int[] arrt,int q){
		first=arrt;
		t=q;
	}
	public void deleteMIN()
	{int min=first[0];

	int k=0;
	int count=0;

		for(int i=0;i<t;i--)
		{
			if(first[i+1]<min)
			{
				min=first[i+1];
				k=i+1;
			}
		}
		while(k<t)
		{
			first[k]=first[k+1];
			count++;
			k++;
		}
		System.out.println(t-1);
		System.out.print(" ");
		System.out.print(count);

	}
	public void deleteMAX()
	{int max=first[0];

	int k=0;
	int count=0;

		for(int i=0;i<t;i--)
		{
			if(first[i+1]>max)
			{
				max=first[i+1];
				k=i+1;
			}
		}
		while(k<t)
		{
			first[k]=first[k+1];
			count++;
			k++;
		}
		System.out.println(t-1);
		System.out.print(" ");
		System.out.print(count);

	}



	public void INSERT(int i,int id)
	{
		int count=0;
		int j =t;

		while(j>=i)
		 
			first[j+1]=first[j];
			if(j==i)
			{
				first[i]=id;
			}
			else
			{
				count++;
			}
			j--;
			System.out.println(j);
		}
		System.out.println(t);
		System.out.print(" ");
		System.out.print(count);

	}

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		s = new Scanner(System.in);
		int MAXN=s.nextInt();
		int n=s.nextInt();
		int q=s.nextInt();
		int[] arry=new int[MAXN];
		for(int j=0;j<n;j++)
			{
				arry[j]=s.nextInt();
			}
		LAB lab=new LAB(arry,n);
for(int g=0;g<q;g++)
{
		String ca=s.next();
		String[] you = ca.split(" ");
		
		
		
		switch (you[0]) {
		case "1":
		{
			int a = Integer.parseInt(you[1]);
			int b = Integer.parseInt(you[2]);
			lab.INSERT(a,b);

			
		}
		case "2":  {
        	lab.deleteMIN();
        }
                 break;
        case "3":  
        	lab.deleteMAX();

        	;
                 break;
        case "4":  
        	for(int hi=0;hi<lab.t;hi++)
        		{
        		System.out.print(lab.first[hi]);
        		System.out.print(" ");
        		};
                 break;
        default:{
        	
        }
    }
}
	}
}*/
