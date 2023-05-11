public class Main{
    public static void main(String[] args) {
        int n = 5; // Number of rows in the pattern
        int count = 1; // Starting number to print
        System.out.println("Printing pattern in zigzag order:::-->>");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                if (i % 2 == 0) {
                    System.out.print(count + " ");
                    count--;
                } else {
                    System.out.print(count + " ");
                    count++;
                }
            }
            if (i % 2 == 0) {
                count += i + 1;
            } else {
                count += i;
            }
            System.out.println();
        }
    }
}

