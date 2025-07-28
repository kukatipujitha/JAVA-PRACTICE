// creating a method to check whether the given number is even or not
------------------------------------------
import java.util.Scanner;
class Methods{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter");
        int num=scan.nextInt();
               EvenOrOdd(num);


    }
    static void EvenOrOdd(int num){
        if (num%2==0){
            System.out.println("even");}
        else{
            System.out.println("odd");

        }
        }
    
}
----compiler output-----
  enter
45
odd
========================================
