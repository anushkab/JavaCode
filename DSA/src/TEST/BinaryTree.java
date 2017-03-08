package TEST;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// Java program to construct BST from given preorder traversal
 
// A binary tree node
class nodeee {
 
    int data;
    nodeee left;
    nodeee right;
 
    nodeee(int d) {
        data = d;
        left =  null;
        right=null;
    }
}
 
public class BinaryTree {
 
    int index = 0;
     
    // A recursive function to construct Full from pre[]. preIndex is used
    // to keep track of index in pre[].
    nodeee constructTreeUtil(int pre[], int preIndex ,int low, int high, int size) {
         
        // Base case
        if (preIndex>= size || low > high) 
        {
            return null;
        }
 
        // The first node in preorder traversal is root. So take the node at
        // preIndex from pre[] and make it root, and increment preIndex
        nodeee root = new nodeee(pre[preIndex]);
        preIndex = preIndex + 1;
 
        // If the current subarry has only one element, no need to recur
        if (low == high) {
            return root;
        }
 
        // Search for the first element greater than root
        int i;
        for (i = low; i <= high; ++i) {
            if (pre[i] > root.data) {
                break;
            }
        }
//12
//20
//24
//28
//32
// Use the index of element found in preorder to divide preorder array in
        // two parts. Left subtree and right subtree
        root.left = constructTreeUtil(pre, preIndex, preIndex,i - 1, size);
        root.right = constructTreeUtil(pre, preIndex, i, high, size);
 
        return root;
    }
 
    // The main function to construct BST from given preorder traversal.
    // This function mainly uses constructTreeUtil()
    nodeee constructTree(int pre[], int size) {
        return constructTreeUtil(pre, index, 0, size - 1, size);
    }
 
    // A utility function to print inorder traversal of a Binary Tree
    void printInorder(nodeee node) {
        if (node == null) {
            return;
        }
        printInorder(node.left);
        System.out.print(node.data + " ");
        printInorder(node.right);
    }
 
    // Driver program to test above functions
    public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		String s=reader.readLine();
		int T = Integer.parseInt(s);
        BinaryTree tree = new BinaryTree();
		String siu=reader.readLine();
		int TI = Integer.parseInt(siu);

        int pre[] = new int[T];
        for(int a=0;a<T;a++)
        {
    		String s1=reader.readLine();
    		int T1 = Integer.parseInt(s1);

        	pre[a]=T1;
        }
        
        nodeee root = tree.constructTree(pre, T);
        System.out.println("Inorder traversal of the constructed tree is ");
        tree.printInorder(root);
    }
}
class Reader {
    static BufferedReader reader;
    static StringTokenizer tokenizer;

    /** call this method to initialize reader for InputStream */
    static void init(InputStream input) {
        reader = new BufferedReader(
                     new InputStreamReader(input) );
        tokenizer = new StringTokenizer("");
    }

    /** get next word */
    static String next() throws IOException {
        while ( ! tokenizer.hasMoreTokens() ) {
            //TODO add check for eof if necessary
            tokenizer = new StringTokenizer(
                   reader.readLine() );
        }
        return tokenizer.nextToken();
    }

    static int nextInt() throws IOException {
        return Integer.parseInt( next() );
    }
	
    static double nextDouble() throws IOException {
        return Double.parseDouble( next() );
    }
}