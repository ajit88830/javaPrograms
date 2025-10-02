

public class Practice2 {
    public static void main(String[] args) {
        int num = 0;
        for (int i = 10; i < 100; i++) {
            if (i % 2 != 0 && i > 50) {
                num = i;
                System.out.println(num);
            }
        }
    }
}
