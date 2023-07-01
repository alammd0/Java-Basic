import java.util.Scanner;

public class maxof_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the first number : ");

        int a = sc.nextInt() ; 

        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt() ; 

        System.out.println("Enter the 3rd number : ");
        int c = sc.nextInt() ; 

        if(a > b && a > c){
            System.out.println(a + " is Maximum number ");
        }
        else if(b > a && b > c){
            System.out.println(b + " is Maximum number ");
        }
        else{
            System.out.println(c + " is Maximum number ");
        }
    }
}
