-------single inheritance---acessing variables----


class fruits{          //main method
    public static void main(String[] args){
        lemon l=new lemon();  //creating object to only child class so that we can also access parent
        System.out.println(l.colour1);      //accessing parent class using object
    }
}
class mango{             //parent class
    String taste1="sweet";
    String colour1="yellow";
    int count=10;
}
class lemon extends mango{   //child class
        String taste3="sour";
        String colour3="green";
        int count=20;
}
----output---
  yellow
  =========================single inheritance ---acessing methods==============
 class school{
    public static void main(String[] args){
      Teacher t=new Teacher();
      t.studentinfo();
      t.TeacherInfo();
    }
}
class student{
    public void studentinfo(){
        int marks=100;
        if (marks>35){
            System.out.println("pass");
        }
    }
    
}
class Teacher extends student{
    int noOfStudentsPass=20;
    public void TeacherInfo(){
    if (noOfStudentsPass>15){
        System.out.println("good teacher");
    }}
    
    
}
----------output------------
  pass
  good teacher
  ===============================================
