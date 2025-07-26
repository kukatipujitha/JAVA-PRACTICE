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
