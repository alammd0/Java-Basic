import java.util.Scanner;

public class sumofn_natural {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the range :");

        int n = sc.nextInt() ;

        int sum = 0 ; 
        for(int i=1 ; i<=n ; i++){
            sum += i;
        }

        System.out.println("Sum of natural Number : " + sum) ;
    }
}
