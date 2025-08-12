//separate positives and negatives in array
import java.util.Arrays;
import java.util.ArrayList;
// import java.util.Scanner;

class NegativePositive{
    public static void main(String [] args){
      int[] Arr={10,-2,-4,4,7,-3};
      
      ArrayList<Integer> positiveList=new ArrayList<>();
      ArrayList<Integer> negativeList=new ArrayList<>();
      
    //   int[] arr1=new int[]
    for (int i=0;i<Arr.length;i++){
        if (Arr[i]<0){
              negativeList.add(Arr[i]);        }
        else{
            positiveList.add(Arr[i]);
        }
      
    }
    System.out.println("positives in array :"+ positiveList);
    System.out.println("negatives in array :"+ negativeList);
}
}
---compiler output---
positives are :[10, 4, 7]
negatives are :[-2, -4, -3]
=========================================================
    //separate positives and negatives in array by user input
import java.util.Arrays;
import java.util.Scanner;
import java.util.ArrayList;

class NegativePositive{
    public static void main(String [] args){
      Scanner scan=new Scanner(System.in);
          System.out.println("enter the length of the array:");

      int n=scan.nextInt();
      int[] Arr=new int[n];
      System.out.println("enter the elements of the array:");

      for(int i=0;i<n;i++){

          Arr[i]=scan.nextInt();
      }

      ArrayList<Integer> positiveList=new ArrayList<>();
      ArrayList<Integer> negativeList=new ArrayList<>();
      ArrayList<Integer> zeroesList=new ArrayList<>();
      
    for (int i=0;i<Arr.length;i++){
        if (Arr[i]<0){
              negativeList.add(Arr[i]);        }
        else if (Arr[i]>0){
            positiveList.add(Arr[i]);
        }
        else {
            zeroesList.add(Arr[i]);
        }
      
    }
    System.out.println("positives are :"+ positiveList);
    System.out.println("negatives are :"+ negativeList);
    System.out.println("zeroes are :"+ zeroesList);
    
}
}
----------compiler output-----
enter the length of the array:
5
enter the elements of the array:
-2 0 -3 7 8
positives are :[7, 8]
negatives are :[-2, -3]
zeroes are :[0]

========================================
//to seperate odd and even numbers in array with user input
import java.util.Scanner;
import java.util.ArrayList;
class main{
    public static void main(String[] args){
        // int[] Arr=new int[4];
        // int[] Arr={1,2,3,4};
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the length of array");
        int n=scan.nextInt();
        int[] Arr=new int[n];
        System.out.println("enter the numbers of array");
        for (int i =0;i<n;i++){
            // int[] Arr=new int[n];
            Arr[i]=scan.nextInt();
        }
        ArrayList<Integer> oddNum=new ArrayList<>();
        ArrayList<Integer> evenNum=new ArrayList<>();
        for (int i=0;i<(n);i++){
            if (Arr[i]%2==0){
                evenNum.add(Arr[i]);}
            else{
                oddNum.add(Arr[i]);            }
                
            }
           System.out.println("even number in array are:"+evenNum) ;
           System.out.println("odd number in array are:"+oddNum) ;
        }
    }
------------compiler output-------------
enter the length of array
5
enter the numbers of array
1 45 78 43 -5
even number in array are:[78]
odd number in array are:[1, 45, 43, -5] 
===============================================
//checking weather  Integer array is a polindrome are not with user input
import java.util.Arrays;
import java.util.Scanner;
class main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=scan.nextInt();
        int[] Array=new int[n];
         System.out.println("enter elements of array");
        for (int i=0;i<n;i++){
            Array[i]=scan.nextInt();
        }
        int[] Arraycopy=Array.clone();
        int temp=0;
        for(int i=0;i<n/2;i++){
            temp=Array[i];
            Array[i]=Array[n-i-1];
            Array[n-i-1]=temp;}
            if (Arrays.equals(Array, Arraycopy)){
                System.out.println("it is palindrome");
            }
            else{
                System.out.println("it is not palindrome");

            }
        
    }
}
------compiler output------------
enter length of array
4
enter elements of array
2 3 3 2
it is polindrome
================================
//checking weather  String array is a polindrome are not with user input
import java.util.Arrays;
import java.util.Scanner;
class main {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=scan.nextInt();
        String [] Array=new String [n];
         System.out.println("enter elements of array");
        for (int i=0;i<n;i++){
            Array[i]=scan.next();
        }
        String[] Arraycopy=Array.clone();
        String temp=" ";
        for(int i=0;i<n/2;i++){
            temp=Array[i];
            Array[i]=Array[n-i-1];
            Array[n-i-1]=temp;}
            if (Arrays.equals(Array, Arraycopy)){
                System.out.println("it is palindrome");
            }
            else{
                System.out.println("it is not palindrome");

            }
        
    }
}
----------compiler output-----------
    enter length of array
5
enter elements of array
m a d a m
it is palindrome
====================================================
 // program to find the missing number in a sorted array of consecutive integers
 import java.util.Scanner;
 import java.util.Arrays;
 import java.util.ArrayList;
 class Practice{
     public static void main(String[] args){
         Scanner s1=new Scanner(System.in);
         System.out.println("enter the length of array");
         int n=s1.nextInt();
         System.out.println("enter the elements of array");
         int[] Arr=new int[n];
         for (int i=0;i<n;i++){
             Arr[i]=s1.nextInt();
         }
         Arrays.sort(Arr);
         System.out.println("sorted array:"+Arrays.toString(Arr));

         for (int i = 0; i < n - 1; i++) {
            if (Arr[i + 1] != Arr[i] + 1) {
                
                    System.out.println("missing letter is:"+(Arr[i]+1));
                    
                
         }
         
         
     }
 }
 }
-----------compiler output----------
enter the length of array
9
enter the elements of array
8 2 4 7 5 9 10 1 3
sorted array:[1, 2, 3, 4, 5, 7, 8, 9, 10]
missing letter is:6
==========================================================
//program to find the elements that appear only once in array with user input
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
class main{
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the length of the array");
        int n=scan.nextInt();
        int[] arr=new int[n];
        ArrayList <Integer> uniqueList=new ArrayList<>();
        System.out.println("enter the elements of the array");

        for (int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        Arrays.sort(arr);
        for (int i=0;i<n;i++){
            boolean isOne=true;
            for (int j=0;j<n;j++){
                if(i!=j && arr[i]==arr[j] ){
                    isOne=false;
                    break;
                }
            }
            
        
       if (isOne){
           uniqueList.add(arr[i]);
       } 
    }
    System.out.println("only once appeared elements are:"+uniqueList);
}
}
-----------------compiler output-------
enter the length of the array
8
enter the elements of the array
1 3 4 5 6 7 3 5
only once appeared elements are:[1, 4, 6, 7]
==================================================
