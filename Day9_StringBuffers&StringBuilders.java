-------------------------string buffer------------------------

class Main {
    public static void main(String[] args) {
        StringBuffer s1 = new StringBuffer("java ");
        System.out.println(s1);
        s1.append("prog");
        System.out.println(s1);
        s1.insert(0,"welcome to ");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        s1.delete(1, 4);
        System.out.println(s1);
        s1.deleteCharAt(5);
        System.out.println(s1);
        System.out.println(s1.reverse());
        s1.replace(0,5,"python");
        System.out.println(s1);
    }
}

-----------------------------StringBuilders---------------------
class Main {
    public static void main(String[] args) {
        StringBuilders s1 = new StringBuilders("java ");
        System.out.println(s1);
        s1.append("prog");
        System.out.println(s1);
        s1.insert(0,"welcome to ");
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.charAt(1));
        s1.delete(1, 4);
        System.out.println(s1);
        s1.deleteCharAt(5);
        System.out.println(s1);
        System.out.println(s1.reverse());
        s1.replace(0,5,"python");
        System.out.println(s1);
    }
}
------------------compiler output for both  is same but time efficiency differs a bit-----------
  java 
java prog
welcome to java prog
20
e
wome to java prog
wome o java prog
gorp avaj o emow
pythonavaj o emow


--------------------time efficieny difference btw time efficieny of String/Stringbuffer/Stringbuilder classes---------------------


class TimeEfficiency{
    public static void main(String[] args){
        
        long time=System.currentTimeMillis();
        System.out.println(time);
        // StringBuffer str2=new StringBuffer ("puji");//takes lesser time than String but more than String builder
        StringBuilder str1=new StringBuilder ("puji");//takes more time than String , more than String buffer
        // String str=new String ("puji");// takes more thime than  both 
        
        for(int i=0;i<10000;i++){
            str1.append("check");//for stringBuilder 
            str2.append("check");// for stringBuffer 
            str+="check";// for string class
    }
    System.out.println("time taken for for loop by using string is:"+(System.currentTimeMillis()-time));
  }
}
