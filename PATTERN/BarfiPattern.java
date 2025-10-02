package PATTERN;

public class BarfiPattern {
    public static void main(String[] args) {
        int s = 5;
        for (int i = 1; i <= s; i++) {
            for (int j = i; j < s; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        int t = 5;
        for (int i = 1; i <= t; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <= t; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }
}
