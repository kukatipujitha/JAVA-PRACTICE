------------------creating object-------------------
  import java.util.Scanner;
public class Practice{
    int a;
    String name;
    public static void main(String[] args){
        Practice Student=new Practice();         //creating object
        System.out.println("enter");
        Scanner scan=new Scanner(System.in);
        Student.a=scan.nextInt();           //user input as a
        System.out.println("enter");
       Student.name=scan.next();              //user input as name           (we can also declare as int a=scan.next();
        System.out.println("student id:"+ Student.a);
        System.out.println("student name:"+ Student.name);            // System.out.println("student name:"+ name);       
        
        
    }
    
}
--compiler output--
  enter
14
enter
pujitha
student id:14
student name:pujitha

=====================================
