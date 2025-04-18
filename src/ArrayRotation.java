import java.util.Arrays;
import java.util.Scanner;

public class ArrayRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter '1' to rotate Right and '0' to rotate Left: ");
        int dir = sc.nextInt();
        System.out.println("Enter number of rotations: ");
        int x = sc.nextInt();

        int[] A = {1, 2, 3, 4, 5, 6, 7, 8};
        int len = A.length ;
        int[] B = new int[len];

        if(dir == 1){
            for (int i = 0; i < len; i++) {
                B[(i+x)%len] = A[i];
            }
        }

        else{
            for (int i = 0; i < len; i++) {
                B[(i-x+len)%len] = A[i];
            }
        }

        sc.close();
        System.out.println(Arrays.toString(B));
    }
}
