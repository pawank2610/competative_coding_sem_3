import java.util.Scanner;

public class CountDigits {

    public static int countDigits(int num) {
        int count = 0;

        if (num == 0) return 1;

        num = Math.abs(num);

        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        System.out.println("Number of digits: " + countDigits(number));
        sc.close();
    }
}