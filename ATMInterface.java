import java.io.*;
import java.util.*;   
public class ATMInterface 
{  
    public static void main(String args[] )  
    {  
        int balance = 10000, withdraw, deposit;  
        Scanner sc = new Scanner(System.in);  
          
        while(true)  
        {  
            System.out.println("==== ATM INTERFACE ====");  
            System.out.println("1 Withdraw");  
            System.out.println("2 Deposit");  
            System.out.println("3 Check Balance");  
            System.out.println("4 EXIT");  
            System.out.print("Choose option to perform: ");  
              
            int choice = sc.nextInt();  
            switch(choice)  
            {  
                case 1:  
                  System.out.print("Enter money to withdraw:");
                  withdraw = sc.nextInt();
                  if(balance >= withdraw)
                  {
                     balance = balance - withdraw;  
                     System.out.println("Please collect money!\n");
                  }  
                  else  
                  {  
                     System.out.println("Insufficient Balance\n");  
                  }
                  break;  
   
                case 2:       
                  System.out.print("Enter money to deposit:");  
                  deposit = sc.nextInt();
                  balance = balance + deposit;  
                  System.out.println("Deposit Successful\n"); 
                  break;  
   
                case 3:
                  System.out.println("Balance : "+balance+"\n");
                  break;  
   
                case 4:  
                  System.out.println("\n\n============= THANKYOU =============");
                  System.exit(0);
            }  
        }  
    }
}  
