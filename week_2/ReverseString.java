// take a string and reverse it using recursive methods 


import java.util.Scanner;

public class ReverseString{

    static String reverse(String str) {
        // Base case
        if (str.length() <= 1) {
            return str;
        }

        // Recursive case
        return reverse(str.substring(1)) + str.charAt(0);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String str = sc.nextLine();

        System.out.println("Reversed string: " + reverse(str));

        sc.close();
    }
}