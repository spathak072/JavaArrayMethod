import java.util.Arrays;

public class ArrayRotation1 {
    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static int[] rotateArray(int []a, int x, String dir) {
        // Write your code here.
        int n = a.length;
        x = x % n; // Handle cases where x > n

        if (dir.equalsIgnoreCase("LEFT")) {
            reverse(a, 0, x - 1);
            reverse(a, x, n - 1);
            reverse(a, 0, n - 1);
        } else if (dir.equalsIgnoreCase("RIGHT")) {
            reverse(a, 0, n - 1);
            reverse(a, 0, x - 1);
            reverse(a, x, n - 1);
        } else {
            System.out.println("Invalid direction. Use 'LEFT' or 'RIGHT'.");
        }
        return a;

    }
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int x = 1;
        String dir = "RIGHT";
        int[] result = rotateArray(a,x, dir);
        System.out.println(Arrays.toString(result));
        System.out.println(Arrays.toString(a));
    }
}
