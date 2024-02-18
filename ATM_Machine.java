import java.util.*;
public class ATM_Machine{

void check_balance(int balance){
System.out.println("Balance money in your account is :"+balance);
}

int with_draw(int balance,int amount){
if(balance>amount){
  balance-=amount;
  System.out.println(amount+" is withdrawn successfully");
}
else
  System.out.println("You have insufficient Money in your account");
return balance;
}

int deposit_money(int balance,int amount){
balance+=amount;
System.out.println(amount+" is deposited successfully");
return balance;
}


public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int balance=20000;  //Initial Balance Money
int choice,amt;

ATM_Machine a=new ATM_Machine();
System.out.println("Select the Option: \n1. check balance \n2. WithDraw Money \n3. Deposit Money \n 4.EXIT");
while(true){
System.out.println("Enter the choice :");
choice=sc.nextInt();

switch(choice){
case 1:
a.check_balance(balance);
break;
case 2:
System.out.println("Enter the Amount to withdraw :");
amt=sc.nextInt();
balance=a.with_draw(balance,amt);
break;
case 3:
System.out.println("Enter the Amount to Deposit :");
amt=sc.nextInt();
balance=a.deposit_money(balance,amt);
break;
case 4:
System.exit(0);
}
}

}
}






