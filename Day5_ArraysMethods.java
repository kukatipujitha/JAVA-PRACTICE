//Array methods
//sort,fill,equals,copy,binary search,stringify
----------------------------------------
import java.util.Arrays;
 class Methods{
     public static void main(String[] args){
         int[] arr= {1,6,3,4};
         int[] arr1={20,30,10,50};
         int[] arr3={1,6,3,4};
         //Arrays.fill(arr,5);
         System.out.println("new array is:"+ Arrays.toString(arr));
         Arrays.sort(arr);
         System.out.println("sorted array is:"+ Arrays.toString(arr));
         int index=Arrays.binarySearch(arr,4);
         System.out.println("index number of 4 is:"+index);
         int[] arr2=Arrays.copyOf(arr,2);
         System.out.println("new array is:"+ Arrays.toString(arr2));
         Arrays.sort(arr3);
         boolean res=Arrays.equals(arr3,arr);
         System.out.println(res);
         
     }
 }
//================compiler output====================
//new array is:[1, 6, 3, 4]
//sorted array is:[1, 3, 4, 6]
//index number of 4 is:2
//new array is:[1, 3]
//true
