
import java.util.Scanner;
public class Main{                                  //main method
   public static void main(String[] args){
       System.out.println("enter id");
       Scanner scan=new Scanner(System.in);
       int id=scan.nextInt();
       System.out.println("enter name");
       String name=scan.next();
       System.out.println("enter marks");
       int marks=scan.nextInt();

        Ptc s1=new Ptc(id,name,marks);
        s1.info("welcome");
        
    }
}
class Ptc{
    int id;
    String name;
    int marks;
    public Ptc(int id,String name){                      //constructor1
        this.id=id;
        this.name=name;
        System.out.println("from 2 params constructor");
    }
    public Ptc(int s_id, String s_name,int marks){            //constructor2 overloaded but arguments differ so no error will rise
        this.id=s_id;
        this.name=s_name;
        this.marks=marks;
        System.out.println("from 3 params constructor");
    }
public void info(String wish){                              //method
    System.out.println("student id:"+ id);
    System.out.println("student name:"+ wish +" "+name);
    
   }
    
}
------------compiler output------
  enter id
15
enter name
puji
enter marks
89
from 3 params constructor
student id:15
student name:welcome puji

