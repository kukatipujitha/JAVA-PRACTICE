/---------------simple if------------------------------



// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your number");
        int num=scan.nextInt();
        if (num>0){
            System.out.println("Positive");
        }
        
    }
}

compiler output-----------
  enter your number
-25
  //////nothing will give as output becoz i didn't gave any statement for negative

=======================================================
 /----------if else conditional statements--------------------

import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter your number:");
        int num=scan.nextInt();
        if (num>0){
            System.out.println("Positive");
}        else  {
           System.out.println("Negative");       
}        

    }
} 
//output:
//enter your number:-45
//Negative

==============================================================
-------------------------------if else if--------------------------
  // Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("enter your number:");
        int num=scan.nextInt();
        if (num>0){
            System.out.println("Positive");
}        else if(num<0) {
           System.out.println("Negative");       
}        else{
           System.out.println("Zero");
}


        
    }
}
//output:enter your number:0
//Zero
===========================================================
//problem to findING IF  number is Positive /Odd/Even/ Divisible 9 or not

    import java.util.Scanner;
class nestedIf{
    public static void main(String[]args){
        Scanner scan1=new Scanner(System.in);
        System.out.println("enter a number");
        int num1=scan1.nextInt();
        if (num1>0){
            System.out.println("positive");
            if (num1%2==0){
            System.out.println("even");}
            else{
                System.out.println("odd");
                if(num1%9==0){
                    System.out.println("divisible  by nine");}
                    else{
                        System.out.println("not by 9");
                    }
                    
                    }
                }
            }
                
            }

 ---compiler coutput---
enter a number
27
positive
odd
divisible  by nine
=======================================================
//problem to find name based on roll number//
import java.util.Scanner;
class nestedIf{
    public static void main(String[]args){
        Scanner scan1=new Scanner(System.in);
        System.out.println("enter your roll  number:");
        int rollNo=scan1.nextInt();
        switch (rollNo) {
            case 1:
                System.out.println("pujitha");
                break;
            case 2:
                System.out.println("vyshu");
                break;
            case 3:
                System.out.println("sai");
                break;
            case 4:
                System.out.println("panvith");
                break;
               default:
                System.out.println("invalid");
                
        }

        
            }
                
       }
--compiler output--
enter your roll  number:
2
vyshu

=============================================================================================== 
//while-- to print natural number if enter number is greater than 0;

import java.util.Scanner;
class While {
    public static void main(String [] args){
        Scanner input=new Scanner(System.in);
        int i=1;
        System.out.println("enter a number");
        int num=input.nextInt();
        while (i<=num){
            System.out.println(i);
            i+=1;
        }

        
    }
}
compiler output----

enter a num
12
1
2
3
4
5
6
7
8
9
10
11
12
=============================================================
//do while--The do-while loop executes the code block once before checking the condition. It guarantees at least one execution of the loop body.
import java.util.Scanner;
class DoWhileExample {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num;

        do {
            System.out.print("Enter a positive number (enter 0 to stop): ");
            num = input.nextInt();
            System.out.println("You entered: " + num);
        } while (num != 0);

        System.out.println("Loop ended because you entered 0.");
    }
}
----compiler output----
Enter a positive number (enter 0 to stop): 9
You entered: 9
Enter a positive number (enter 0 to stop): 5
You entered: 5
Enter a positive number (enter 0 to stop): 2
You entered: 2
Enter a positive number (enter 0 to stop): 0
You entered: 0
Loop ended because you entered 0.
================================================================
   
    
