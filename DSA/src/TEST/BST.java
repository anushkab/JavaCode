package TEST;
//LAB 8
//Anushka Bhandari
//2016134
import java.io.*;

class noddyyy {
	  int data;
     noddyyy right;
     noddyyy left;
    
    
    noddyyy(int d) {
        data = d;
        left =  null;
        right=null;
    }
}
 

public class BST {
	static int max=0;
	static noddyyy root;
	 public noddyyy insert (noddyyy root, int value) {
		if(root==null)
		{
			root=new noddyyy(value);
		}
		else
		{
			if(value<root.data)
			{
				root.left=insert(root.left,value);
			}
			else
			{
				root.right=insert(root.right ,value);
			}
			
			
		}
		return root;
	}
	 public void right(noddyyy node,int level,int max)
	 
	 {
		 if(node==null)
		 {
			 return;
		 }
		 if(max<=level)
		 {
			 System.out.print(node.data+" ");
			 max=level;
		 }
		 right(node.right,level+1,max);
		 right(node.left,level+1,max);
		 
		 
	 }
	    public void printInorder(noddyyy node) {
	        if (node == null) {
	            return;
	        }
	        printInorder(node.left);
	        System.out.print(node.data + " ");
	        printInorder(node.right);
	    }
	    public static noddyyy minBST (noddyyy root) {
	    	if(root.left==null)
	    	{
	    		return root;
	    	}
	    	else
	    	{
	    		return minBST(root.left);
	    	}
	    }
	    public static noddyyy delete (noddyyy root, int value)
	    {
	    	 if (root == null)
	    		 return null;
	    	 if (root.data > value)
	    		 root.left = delete (root.left, value);
	    	 else if (root.data < value)
	    		 root.right = delete (root.right, value);
	    	 else

	    	 {
	    		 if (root.left != null && root.right != null)
	    		 {
	    
	    			 noddyyy temp = root; 
	    			 noddyyy minRight = minBST (temp.right); 
	    			 root.data = minRight.data; 
	    			 root.right=delete (root.right, minRight.data);
	    		 }
	    		 else if (root.left != null) 
	    			 root = root.left;
	    		 else if (root.right != null) 
	    			 root = root.right;
	    		 else
	    			 {root = null;
	    	 }
	    	 }
	    	 return root;
	    }
	    public void rightprofile(noddyyy P,int H){
            if(P == null){
                return;
            }
            else{
                if(H>=BST.max)
                {    System.out.print(P.data+" ");
                    BST.max++;
                }    
                rightprofile(P.right,H+1);
                rightprofile(P.left,H+1);
                
            }
        }
	    public static void main(String[] args) throws IOException {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String[] s=reader.readLine().split(" ");
			int T = Integer.parseInt(s[0]);
			
			
			int TI = Integer.parseInt(s[1]);
			String s11=reader.readLine();


		String[] T1 = (s11).split(" ");

		int pre[] = new int[T];
		for(int a=0;a<T;a++)
	        {
	    		
	        	pre[a]=Integer.parseInt(T1[a]);
	        }
	        noddyyy noddy=new noddyyy(pre[0]);

	        BST zo = new BST();
	        zo.root=noddy;
	        for(int k=1; k<T;k++){
	            
	            zo.root=zo.insert(zo.root, pre[k]);
	        }
	        
	        
	    	for(int u=0;u<TI;u++)
			{
	    		String[] casee=reader.readLine().split(" ");
	    		int T2 = Integer.parseInt(casee[0]);

			if(T2==2)
			{

				zo.rightprofile(zo.root, max);
				System.out.println();
			}
			else if(T2==1)
			{
				int T111 = Integer.parseInt(casee[1]);

				zo.root = delete(zo.root,T111);
				
			}
			}
	    }
}
