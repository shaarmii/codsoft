import java.util.*;
public class Grade_calculator{
public static void main(String args[]){
int n,total=0;
int marks[]=new int[10];
float avg=0;
Scanner sc=new Scanner(System.in);
System.out.println("Enter Number of Subjects :");
n=sc.nextInt();
for(int i=1;i<=n;i++){
System.out.print("Enter the Mark of Subject "+i+": ");
marks[i]=sc.nextInt();
total+=marks[i];
}
System.out.println("Total Marks : "+total);
avg=total/n;
System.out.println("Average Percentage : "+avg);

for(int i=1;i<=n;i++){
if(marks[i]>=90) 
  System.out.println("Subject "+i+": "+marks[i]+"\t GRADE O");
else if(marks[i]>=80 && marks[i]<90)
  System.out.println("Subject "+i+": "+marks[i]+"\t GRADE A+");
else if(marks[i]>=70 && marks[i]<80)
  System.out.println("Subject "+i+": "+marks[i]+"\t GRADE A");
else if(marks[i]>=60 && marks[i]<70)
  System.out.println("Subject "+i+": "+marks[i]+"\t GRADE B+");
else if(marks[i]>=50 && marks[i]<60)
  System.out.println("Subject "+i+": "+marks[i]+"\t GRADE B");
else 
  System.out.println("Subject "+i+": "+marks[i]+"\t FAIL");
}

}
}



