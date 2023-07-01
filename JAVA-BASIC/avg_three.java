import java.util.Scanner;

public class avg_three {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the 1st Number : ");
        int a = sc.nextInt() ; 

        System.out.println("Enter the 2nd nummber : ");
        int b = sc.nextInt() ; 


        System.out.println("Enter the 3rd Number : ");
        int c = sc.nextInt() ; 


        int avg = (a+b+c) / 3 ;

        System.out.println("Avg. of three number is = " + avg);
    }
}
