import java.util.Scanner;

public class side_of_sq {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the side : ");
        int side = sc.nextInt() ; 

        // int sq =side * side * side * side ; 4

        int sq = 4 * side;

        System.out.println("Square of Side is = " + sq);
    }
}
