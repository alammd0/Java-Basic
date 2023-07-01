import java.util.Scanner;

public class simple_interest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Principle Amount : ");
        int p = sc.nextInt() ; 

        System.out.println("Enter the rate : ");
        int r = sc.nextInt() ; 

        System.out.println("Enter the time of this P : ");
        int t = sc.nextInt() ; 

        int SI = p*r*t ; 

        int ans = SI / 100 ;

        System.out.println("Calculate the Simple interest : " + ans);
    }
}
