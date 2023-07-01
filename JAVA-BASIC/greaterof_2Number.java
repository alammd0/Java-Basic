import java.util.Scanner;

public class greaterof_2Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first Number : ");
        int a = sc.nextInt();

        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt();

        if (a > b) {
            System.out.println(a + " is greater number ");
        } else {
            System.out.println(b + " is grester number ");
        }
    }
}
