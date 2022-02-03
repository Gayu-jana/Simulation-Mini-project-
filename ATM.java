import java.util.*;
class ATM{
public static void main(String[] args){
try{
int a,pin,balance=1000,withdrawl=0,deposit=0;
Scanner s=new Scanner(System.in);
System.out.println("\t\t\t\t\t\t\t~Welcome TO Our ATM Service~");
Thread.sleep(3000);
System.out.println("Insert Your ATM_Card");
Thread.sleep(5000);
System.out.println("Processing....");
Thread.sleep(2000);
System.out.println("Enter Your PIN");
pin=s.nextInt(); 
Thread.sleep(2000);
System.out.println("1.Cash_Withdrawl");
System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t2.Balance_Enquiry\n");
System.out.println("3.Cash_Deposit");
System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t4.Print_Statement\n");
System.out.println("5.Pin_Change");
System.out.print("\t\t\t\t\t\t\t\t\t\t\t\t\t\t6.Link_Aadhar\n");
a=s.nextInt();
Thread.sleep(2000);
switch(a){
 case 1:
 System.out.println("1.Current");
 System.out.println("2.Credit");
 System.out.println("3.Savings");
 Thread.sleep(2000);
 int b=s.nextInt();
    switch(b){
    case 1:
    System.out.println("Enter The Amount To WithDrwal From Current");
    withdrawl=s.nextInt();
    Thread.sleep(5000);
    System.err.println("Deducting The Amount \nPlease Wait...");
    Thread.sleep(3000);
    System.out.println("Thank You For Visting Our Bank");
   
    break;
    case 2:
    System.out.println("Enter The Amount To WithDrwal From Credit");
    withdrawl=s.nextInt();
    Thread.sleep(5000);
    System.err.println("Deducting The Amount \nPlease Wait...");
    Thread.sleep(3000);
       System.out.println("Thank You For Visting Our Bank");
    break;
    case 3:
    System.out.println("Enter The Amount To WithDrwal From Savings");
     withdrawl=s.nextInt();
    Thread.sleep(5000);
    System.err.println("Deducting The Amount \nPlease Wait...");
    Thread.sleep(3000);
       System.out.println("Thank You For Visting Our Bank");
    break;
    }
    break;
 case 2:
	System.out.println("Balance    "+balance);
	Thread.sleep(3000);
    System.out.println("Thank You For Visiting Our Bank");
	break;
 case 3:
 	System.out.println("Enter The Cash Amount To Deposit");
    deposit=s.nextInt();
 	balance=balance+deposit;
 	Thread.sleep(3000);
 	System.out.println("Your Amount Has Been Successfully Deposited");
 	Thread.sleep(3000);
 	System.out.println("Balance  "+balance);
 	break;
 case 4:
 	System.out.println("Today's Transction Statement");
 	Thread.sleep(3000);
 	System.out.println("Withdrawl Amount         "+withdrawl);
 	Thread.sleep(3000);
 	System.out.println("Deposited Amount         "+deposit);
 	Thread.sleep(3000);
 	System.out.println("Balance       "+balance);
 	break;
 case 5:
 		int count=3;
 		System.out.println("Enter Your Old Pin");
 		int oldpin=s.nextInt();
 		if(pin==oldpin)
 		{
 			System.out.println("Enter Your New Pin");
 			int pin1=s.nextInt();
 			Thread.sleep(3000);
 			System.out.println("Re-Enter Your New Pin For Conformation");
 			int pin2=s.nextInt();
 			Thread.sleep(3000);
 			if(pin1==pin2)
 				System.out.println("Your Pin Has Been Changed Successfully");
 			else
 				System.out.println("Your Pin Is Not Matched ");
 		}	
 		else
 		{
 			count--;
 		}	
 		if(count==0)
 			System.out.println("Your Pin Change TimeLimit Over");
	break;
case 6:
	System.out.println("Enter Your Last Five Digit Of Account Number");
	int an=s.nextInt();
	Thread.sleep(3000);
	System.out.println("Enter Your 12 Digit Aadhar Number");
	int aadharno=s.nextInt();
	break;
} 
}
catch(InterruptedException ex){
ex.printStackTrace();
}
}
}
