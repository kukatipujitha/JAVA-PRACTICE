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
