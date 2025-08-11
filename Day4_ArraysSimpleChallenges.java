// Programming questions on arrays
//sum,minimum, maximum of the array

import java.util.Arrays;
class Practice1{
    public static void main(String[] args){
        int sum=0;
        int arr[]={10,2,23,34};
        int max=arr[arr.length-1];
        int min=arr[0];
        for(int i=0;i<arr.length;i++){  ///iterates the array
            sum+=arr[i];
            if (arr[i]>max){  //condition to find max
                max=arr[i];
            }
            if (arr[i]<min){ //condition to find min
                min=arr[i];
            }
            
        }
        System.out.println("sum:"+sum);
        System.out.println("max:"+max);
        System.out.println("min:"+min);
        
    }
}

=====================================

output:
sum:69
max:34
min:2

=== Code Execution Successful ===
    // program to move zeroes to the end of the array with user input
import java.util.Scanner;
import java.util.Arrays;
class Main {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter length of array");
        int n=scan.nextInt();
        int[] Array=new int[n];
        int index=0;
        System.out.println("enter elements of array");
        for(int i=0;i<n;i++){
            Array[i]=scan.nextInt();}
            for(int j=0;j<n;j++){
            if (Array[j]!=0){
                Array[index]=Array[j];
                index++;
            }
        }
        while(index<n){
            Array[index]=0;
            index++;
        }
        System.out.println("new array is:"+Arrays.toString(Array));
    }
}
---------compiler output------------
enter length of array
5
enter elements of array
3 0 9 0 8
new array is:[3, 9, 8, 0, 0]
===================================================
