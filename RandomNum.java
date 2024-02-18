import java.util.*;
public class RandomNum{
public static void main(String args[]){
int num,guess,count=0,score=110;
Scanner sc=new Scanner(System.in);
System.out.println("You have only 10 chances to guess the number. \n All the Best.");
Random rd=new Random();
num=rd.nextInt(100);
while(true){
 count+=1;
 score-=10;
 if(count==11){
  System.out.println("SORRY!!! Your chance is over..");
  System.exit(0);
   }
System.out.println("GUESS A NUMBER BETWEEEN 1 AND 100:");
guess=sc.nextInt();
if(guess>num)
  System.out.println("Too high,enter again");
else if(guess<num)
  System.out.println("Too low,enter again");
else if(guess==num){
  
  System.out.println("Congratulations! you have guessed the correct number");
  System.out.println("Your score is :"+score+"%");
  System.exit(0);
   }
  }
}
}
   
