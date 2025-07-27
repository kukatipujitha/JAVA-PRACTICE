// example for break  statement//
class Break {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Breaking the loop at i = " + i);
                break; // Exits the loop when i == 5
            }
            System.out.println("i = " + i);
        }
    }
}
--compiler output----
i = 1
i = 2
i = 3
i = 4
Breaking the loop at i = 5

=======================================================================
// example for continue statement//
class ContinueExample {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("Skipping i = " + i);
                continue; // Skips when i == 3
            }
            System.out.println("i = " + i);
        }
    }
}
-----compiler output----------
i = 1
i = 2
i = 4
i = 5

