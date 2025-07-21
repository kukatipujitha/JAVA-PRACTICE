//student details
import java.util.Scanner;
class main{
    public static void main(String [] args ){
        Scanner puji=new Scanner(System.in);
        System.out.print("enter your name:");
        String input1=puji.next();
        puji.nextLine(); // to consume leftover newline character
        System.out.print("enter your college name:");
        String input2=puji.nextLine();
        System.out.print("enter your Grade:");
        String input3=puji.next();
        System.out.print("enter your marks in maths:");
        int input4=puji.nextInt();
        System.out.print("enter your cgpa:");
        Float input5=puji.nextFloat();
    }
}
