// [4,6,9,10,20,22]
//two sumn target 

public class Main {
    public static void main(String[] args) {

        int[] arr = {4, 6, 9, 10, 20, 22};
        int target = 16;

        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int sum = arr[left] + arr[right];

            if (sum == target) {
                System.out.println("Pair: " + arr[left] + ", " + arr[right]);
                break;
            } 
            else if (sum < target) {
                left++;
            } 
            else {
                right--;
            }
        }
    }
}