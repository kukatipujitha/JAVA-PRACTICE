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
