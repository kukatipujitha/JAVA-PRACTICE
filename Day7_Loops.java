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
  //for ----to print prime numner upto given number//


import java.util.Scanner;
class Loops{
    public static void main( String[] args){
        Scanner Prime=new Scanner(System.in);
        System.out.println("enter input");
        int num=Prime.nextInt();
        for (int i=1; i<=num;i++)
        {
            int c=0;
            for (int j=1; j<=i;j++){
                if (i%j==0){
                     c+=1;
                }
              
            }
            if (c==2){
                 System.out.println(i);}
                 
                 }
        }
        
        }
        
---compiler output--
enter input:45
2
3
5
7
11
13
17
19
23
29
31
37
41
43
========================================================

   
    
