//right-angled triangle pattern
//package com.Practice;
import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			for (int i=1;i<=n;i++) {
				for(int c=1;c<=i;c++) {
						System.out.print(i);
				}	
				System.out.println();
					
				}
			
			}
		}
---------compiler output----------
user input:5
1
22
333
4444
55555
==========================
//printing reverse right-angled triangle with user input
//package com.Practice;
import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			for (int i=1;i<=n;i++) {
				for(int c=n;c>=i;c--) {
				    System.out.print(c);
				    
			

}
System.out.println();
}
}
}
---------compiler output-----------
user input:5
54321
5432
543
54
5
=========================================
  //printling  pyramid pattern
//package com.Practice;
import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			for (int i=1;i<=n;i++) {
				for(int c=i;c<n;c++) {
						System.out.print(" ");
				}	
				for(int k=1;k<=(2*i-1);k++) {
					System.out.print("*");
				}
				System.out.println();
					
				}
			
			}
		}
	-----------compiler output----------
   user input: 5
    *
   ***
  *****
 *******
*********
===========================
//printing pyramid pattern in reverse order
//package com.Practice;
import java.util.Scanner;
public class Pattern {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
			int n=s.nextInt();
			for (int i=1;i<=n;i++) {
				for(int c=1;c<i;c++) {
				    System.out.print(" ");
                }
                for(int k=n;(k>(2*i-1));k--){
                    System.out.print("*");
                }

                System.out.println();
        }
    }
}
------------compiler output---------
user input:15
**************
 ************
  **********
   ********
    ******
     ****
      **
==================================================

	


