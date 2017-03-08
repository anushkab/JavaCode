/*
 *  Java Program to Implement Circular Singly Linked List
 */
 
import java.io.*;
import java.util.Scanner;
 
/*  Class Node  */
class Node
{
    protected int data;
    protected Node link;
 
    /*  Constructor  */
    public Node()
    {
        link = null;
        data = 0;
    }    
    /*  Constructor  */
    public Node(int d,Node n)
    {
        data = d;
        link = n;
    }    
    /*  Function to set link to next Node  */
    public void setLink(Node n)
    {
        link = n;
    }    
    /*  Function to set data to current Node  */
    public void setData(int d)
    {
        data = d;
    }    
    /*  Function to get link to next node  */
    public Node getLink()
    {
        return link;
    }    
    /*  Function to get data from current Node  */
    public int getData()
    {
        return data;
    }
}
 
/* Class linkedList */
class linkedList
{
    protected Node start ;
    protected Node end ;
    public int size ;
 
    /* Constructor */
    public linkedList()
    {
        start = null;
        end = null;
        size = 0;
    }
    /* Function to check if list is empty */
    public boolean isEmpty()
    {
        return start == null;
    }
    /* Function to get size of the list */
    public int getSize()
    {
        return size;
    }
    /* Function to insert element at the begining */
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
    public void delete()
    {    int pos=1;
        if (pos == 1) 
        {
            start = start.getLink();
            end.setLink(start);
            size--; 
            return ;
        }
    }
}
 
/* Class CircularSinglyLinkedList */
public class CircularSinglyLinkedList
{    
	public void main(String[] args) throws IOException 
	{
		// TODO Auto-generated method stub
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(reader.readLine());
		for (int l=0;l<T;l++)
		{
				int N = Integer.parseInt(reader.readLine());
				linkedList pewpew = new linkedList(); 
     
					for(int h=N;h>0;h--)
    {
    	pewpew.insertAtStart(h);
    }
					while(pewpew.size>2)
					{
						pewpew.delete();
					}
		System.out.println(pewpew.end.data);
		}
}
}
		
