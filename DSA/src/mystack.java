
/**public class mystack {int[] array;
int capacity;
int top;
public mystack(int cap)
{capacity=cap;
array=new int[cap];
top=-1;}


public void push(int val){
	if(top<capacity-1)
	{top++;
	array[top]=val;}
	else{System.out.println("Stack is full");}
}
public int pop(){
	if(top>-1){
		int o=array[top];
		top--;
		return o;}
	else{System.out.println("empty stack");
	return -1;
}

}
public int peek()
{
	if(top>0){return array[top];}
else
{System.out.println("the stack is empty");

	return -1;}
}
public boolean isempty()
{return top<0;}
public static void display(mystack stack){
	for(int i=stack.top;i>=0;i--){
		System.out.print(stack.array[i]);
		System.out.print(" ");
	}		System.out.println(" ");

}
public static void main(String[] args) {
	mystack tut=new mystack(5);
	tut.push(1);
	tut.push(2);
	tut.push(3);

	tut.push(4);

	tut.push(5);

	int y=tut.pop();
	System.out.println(y);
	display(tut);
	tut.peek(5);

	}
}

**/