
public class ProcessStudents {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student[] students=new Student[10];
		students[0]=new Student("2016123","Mehak Saha","B.Tech-CSE", 6.7);
		students[1]=new Student("2016021","Krishna Kumar","B.Tech-CSM", 8.7);
		students[2]=new Student("2016103","Balaram","B.Tech-CSE", 6.7);
		students[3]=new Student("2016211","Pooja Jain","B.Tech-ECE", 8.9);
		students[4]=new Student("2016120","Tanya Gupta","B.Tech-CSE", 4.5);
		students[5]=new Student("2016003","Prerna Saha","B.Tech-ECE", 8.7);
		students[6]=new Student("2016113","Valari Sinha","B.Tech-CSM", 8.3);
		students[7]=new Student("2016013","Mona Roy","B.Tech-CSE", 6.7);
		students[8]=new Student("2016112","Pulkit Saha","B.Tech-ECE", 9.7);
		students[9]=new Student("2016223","Pheona James","B.Tech-CSE", 9.3);
		ProcessStudents ps=new ProcessStudents();
		Student[] sortedlist=ps.SortStudents(students);
		ps.display(sortedlist);
	}

	private Student[] SortStudents(Student[] students)
	{
		for(int j=0;j<students.length;j++)
		{
			int smallest=j;
			for (int i=j+1 ;i<students.length;i++)
			{
				if(students[i].CGPA<students[smallest].CGPA)
					{			
					smallest=i;
					}
				else if(students[i].CGPA==students[smallest].CGPA)
				{if (students[i].Rollnumber.compareTo(students[smallest].Rollnumber)<0)
				{
					smallest=i;
				}
				}					
				

				
		}	
			Student temp=students[j];
			students[j]=students[smallest];
			students[smallest]=temp;
			
			}
		return students;
}

		
		// TODO Auto-generated method stub
		


	private void display(Student[] sortedlist) {
		for(int j=1;j<sortedlist.length;j++){
			System.out.print(sortedlist[j-1].Rollnumber);
			System.out.print(" ");

			System.out.print(sortedlist[j-1].Fullname);
			System.out.print(" ");

			System.out.print(sortedlist[j-1].CGPA);
			System.out.print(" ");

			System.out.print(sortedlist[j-1].Program);
			System.out.println(" ");

		}
		
	}

}
