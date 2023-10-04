

import java.io.*;
import java.util.Scanner;
import java.lang.*;


class Atm {
public static void main (String args[]){
System.out.println("WECOME TO ATM MACHINE");
int pin = 1234 ;
int n =1;
int balance = 100000, withdraw, deposit;
Scanner sc = new Scanner(System.in);

// PIN SLOT
 do {
    
    System.out.print("It is Your " +n+"th chance to Enter your PIN NUMBER  : " );
    int ppn = sc.nextInt();
    
    if (ppn == pin){ 
        System.out.println("your password is correct ");
        break;}
        else {
                System.out.print("");
                n++;
        }
    
        
 }

 while (n<=3);
 if (n==4){
System.out.println("Login Failed. So,Your card has been blocked for 5 days. Contact your Bank");

    System.out.println("");
System.exit(0);
}
// OPTION SLOT 
 while(true){

System.out.println(" choose 1 for withdraw");
System.out.println("choose 2 for Deposit");
System.out.println(" choose 3 for check Balance");
System.out.println(" choose 4 for EXIT");
System.out.print(" choose the  Operation you want to perform :");

// USER CHOICE SLOT
 int choice = sc.nextInt();
 switch (choice)

 {
    case 1:
    System.out.print(" Enter Money to withdraw : ");
    withdraw = sc.nextInt();
    if (balance >=withdraw)
    { balance = balance - withdraw;
        System.out.println("Please collect your money");
        System.out.println("");
        System.out.println(" Your Balance now  : " + balance);
        System.out.println("");
    }
    else {
        System.out.println(" Insufficient Balance");
        System.out.println(" Your Balance now  : " + balance);
    }
    System.out.print("");
    break;
    case 2:
    System.out.print(" Enter money to be deposited : ");
    deposit = sc.nextInt();
    balance = balance + deposit ;
    System.out.println(" Your Money has been successfully deposited");
    System.out.println("");
    System.out.println(" Your Balance now  : " + balance);
    System.out.println("");
    break;

    case 3:
    System.out.print(" Your Balance now  : " + balance);
    deposit = sc.nextInt(); break;

    case 4 :
    System.exit(4); 

}
}
}
}