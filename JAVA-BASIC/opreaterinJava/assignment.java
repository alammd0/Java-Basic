package opreaterinJava;

import java.util.Scanner;

public class assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the one value : ");
        int a = sc.nextInt() ; 

        int b ;

        System.out.println("assignment opreater " + (b=a));

        System.out.println(a += b);
        System.out.println(a -= b);
        System.out.println(a *= b);
        System.out.println(a /= b);
        System.out.println(a %= b);

    }
}
