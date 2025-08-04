class company{
    public static void main(String[] args){
        manager mn=new manager();
        mn.displayInfo();
        mn.displayBranch();
        mn.display();
        
    }
}
class employee{
    String name="bagya";
    int exp=3;
    void displayInfo(){
        System.out.println("employee name:"+name);
        System.out.println("employee experience:"+exp);
        
    }
    
} 
class branch extends employee{
    int id=45;
    String city="chennai";
    void displayBranch(){
                System.out.println("employee id:"+id);
                System.out.println("employee branch  city:"+city);

    }
}
class manager extends branch {
    String TL="pujitha";
    void display(){
                System.out.println("employee TL:"+TL);

    }
    
}
------compiler output-------
employee name:bagya
employee experience:3
employee id:45
employee branch  city:chennai
employee TL:pujitha
  ============================================================================================


















