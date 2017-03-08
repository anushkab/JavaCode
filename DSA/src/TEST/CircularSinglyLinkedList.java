package TEST;
/*
 *  Anushka Bhandari 2016134
 *  
 */
 
import java.io.*;
 
class Node
{
     int data;
     Node link;
 
    public Node()
    {
        link = null;
        data = 0;
    }    
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }    
    public void setLink(Node n)
    {
        link = n;
    }    
    public void setData(int d)
    {
        data = d;
    }    
    public Node getLink()
    {
        return link;
    }    
    public int getData()
    {
        return data;
    }
}
 
class KILI
{
    protected Node start ;
    protected Node end ;
    public int size ;
 
    public KILI()
    {
        start = null;
        end = null;
        size = 0;
    }
    public boolean isEmpty()
    {
        return start == null;
    }
    public int getSize()
    {
        return size;
    }
    public void insertAtStart(int val)
    {
        Node nptr = new Node(val,null);    
        nptr.setLink(start);
        if(start == null)
        {            
            start = nptr;
            nptr.setLink(start);
            end = start;            
        }
        else
        {
            end.setLink(nptr);
            start = nptr;        
        }
        size++ ;
    }
}


 
public class CircularSinglyLinkedList
{    
	public static void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		int T = Integer.parseInt(s);
		for (int l=0;l<T;l++)
		{String hii=reader.readLine();
				int N = Integer.parseInt(hii);
				KILI pewpew= new KILI(); 
     
					for(int h=N;h>0;h--)
    {
    	pewpew.insertAtStart(h);
    }
					Node x=pewpew.start;
					while((x.link.link != x))
					{
						x.setLink((x.link.getLink()));
						x = x.link;
					}
					System.out.print(x.data);
					System.out.println();

					
		}
}
}
		
