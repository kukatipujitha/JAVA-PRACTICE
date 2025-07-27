//String methods//
class Main {
    public static void main(String[] args) {
        String s1=new String("sai venkat niroop");
        String s3=new String("sai venkat niroop");
        String s2=new String ("welcome ");
    String[] s5={"java","python","c","c++"};
        char ch=s1.charAt(4);
        System.out.println("char at 4 of s1  is:" +ch);
        System.out.println("is s1==str :" +(s1==str));
        System.out.println("comparing s1 and s2 :"+s2.compareTo(s1));
        System.out.println("comparing ignore cases1 and s2:"+s1.compareToIgnoreCase(s3));
        System.out.println("index of c in s2:"+ s2.indexOf("c"));
        System.out.println("s1 and s2 is Equal or not:"+s2.equals(s1));
        System.out.println("upper case of s1:"+ s1.toUpperCase());
        System.out.println("lower case of s1:"+ s1.toLowerCase());
        System.out.println("s1 contains k:"+ s1.contains("k"));
        System.out.println("s1 ends with:"+ s1.endsWith("roop"));
        System.out.println(" s1 starts with:"+ s1.startsWith("sai"));
        System.out.println("is empty:"+ s1.isEmpty());
        System.out.println("last index of a:"+ s1.lastIndexOf("a"));
        System.out.println("length of s1:"+ s1.length());
        System.out.println("replacing :"+ s1.replace("kat","KAT"));
        System.out.println("length of s1:"+ s1.length());
        System.out.println("substring of s1:"+ s1.substring(2,7));
        System.out.println("String joining:"+ (String.join(" and ",s5)));    
        }
}
----compiler output--------
  char at 4 of s1  is:v
is s1==s3 :false
comparing s1 and s2 :4
comparing ignore cases1 and s2:0
index of c in s2:3
s1 and s2 is Equal or not:false
upper case of s1:SAI VENKAT NIROOP
lower case of s1:sai venkat niroop
s1 contains k:true
s1 ends with:true
 s1 starts with:true
is empty:false
last index of a:8
length of s1:17
replacing :sai venKAT niroop
length of s1:17
substring of s1:i ven
String joining:java and python and c and c++

=== Code Execution Successful ===

