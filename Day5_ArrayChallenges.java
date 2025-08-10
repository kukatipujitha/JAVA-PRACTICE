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

