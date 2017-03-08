package LABS;

import java.io.*;
public class MyArray {
	int maxLength;
	int[] newarr;
	int arrsize;
	public MyArray(int ml,int num,int[] first)
	{
		maxLength=ml;
		newarr=new int[maxLength];
		arrsize=num;
		for(int i=0;i<maxLength;i++)
		{
			if (i<arrsize)
			{
				newarr[i]=first[i];
			}
			else
			{
				newarr[i]=0;

			}
		}

	}

	public void INSERT(int val)
	{
		int i=arrsize-1;
		int count=0;
		
		if (arrsize<maxLength)
		{
			while(i>=0 && newarr[i]>val)
			{
				int tempo=newarr[i+1];
				newarr[i+1]=newarr[i];
				newarr[i]=tempo;
				count++;
				i--;
			}
			newarr[i+1]=val;
			arrsize++;
			System.out.println(arrsize+" "+count);
			
		}
		else
		{
			System.out.println(arrsize+" "+0);
		}

	}

	public void DELETE(int val)
	{
		int j,Su=0;
		for ( j=0;j<arrsize;j++)
		{
			if (newarr[j]==val)
			{
				break;
			}
		}
		for(int a=j;a<arrsize-1;a++)
		{
			newarr[a]=newarr[a+1];
			Su++;
		}
		arrsize--;
		System.out.println(arrsize+" "+Su);
	}
	public void DISPLAY()
	{
		for(int j=0;j<arrsize;j++)
		{
			System.out.print(newarr[j]+" ");
		}
		System.out.println();

	}

	public static void main(String[] args)throws IOException
	{
		BufferedReader reader=new BufferedReader(new InputStreamReader(System.in));
		String[] strrr=reader.readLine().split(" ");
		int maxn=Integer.parseInt(strrr[0]);
		int n=Integer.parseInt(strrr[1]);
		int q=Integer.parseInt(strrr[2]);
		
		String strry=reader.readLine();

		String[] strr1=strry.split(" ");
		int[] L=new int[n];
		for(int a=0;a<n;a++)
		{
			L[a]=Integer.parseInt(strr1[a]);
		}

		MyArray newArray=new MyArray(maxn,n,L);

		for(int d=0;d<q;d++)
		{
			String[] strr=reader.readLine().split(" ");
			String k=(strr[0]);
			switch(k)
			{
			case "1":newArray.INSERT(Integer.parseInt(strr[1]));
					break;
			case "2":newArray.DELETE(Integer.parseInt(strr[1]));
					break;
			case "3":newArray.DISPLAY();
					break;


			}

		}
	}
}
