
public class selection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] yo={2,3,5,1,77,2,-1,0};
		for(int i=0;i<yo.length;i++)
		{
			int min=i;
			for(int j=i+1;j<yo.length;j++)
			{
				if(yo[min]>yo[j])
				{
					min=j;
					
				}
			}
			int temp=yo[i];
			yo[i]=yo[min];
			yo[min]=temp;
		}

		System.out.println( yo);

}
}
