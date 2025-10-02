

import java.util.Scanner;

public class ThreeDigitSum {
    public static int sumOfDigit(int num) {
        int sum = 0;
        while (num > 0) {
            sum += num % 10;
            num = num / 10;
        }
        return sum;

    }

    public static int reduceToSingle(int digit) {
        while (digit > 9) {
            int tempSum = 0;
            while (digit > 0) {
                tempSum+= digit % 10;
                digit = digit / 10;
            }
            digit = tempSum;

        }
        return digit;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter 3-digit number");
        int number = sc.nextInt();
        sc.close();
        if (number >= 100 && number <= 999) {
            int digitSum = sumOfDigit(number);
            System.out.println("sum of digits :" + digitSum);

            if (digitSum > 9) {
                int result = reduceToSingle(digitSum);
                System.out.println("subtraction is : " + result);
            }
        }

    }

}
