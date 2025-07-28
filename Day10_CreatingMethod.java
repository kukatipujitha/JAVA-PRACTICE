// creating a method to check whether the given number is even or not ---using Int datatype as a input
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
==================================================
    //creating method to print full name----------using String data type
    
import java.util.Scanner;
class methodExample2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter name:");
        String name=scan.next();        
        System.out.println("enter surname:");

        String surname=scan.next();

        System.out.println("full name:"+ inserting(name,surname));
        
        
    }
    static String inserting(String s1,String l1){
        return s1.concat(l1);
    }
}
----compiler output---
    enter name:
pujitha
enter surname:
k
full name:pujithak

=================================================
    //code to find out the index of a given 

import java.util.Scanner;
class methodExample2{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter name:");
        String name=scan.next();
        System.out.println("enter letter:");
        char letter=scan.next().charAt(0);
        

        System.out.println("full name:"+ inserting(name,letter));
        
        
    }
    static int inserting(String s1,char l1){
        return s1.indexOf(l1);
    }
}
----compiler output---
enter name:
[popyhujgb
enter letter:
[
full name:0

====================================================================
