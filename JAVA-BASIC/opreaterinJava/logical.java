package opreaterinJava;

import java.util.Scanner;

public class logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the first Number : ");

        int a = sc.nextInt() ; 

        System.out.println("Enter the 2nd Number : ");

        int b = sc.nextInt() ; 

        System.out.println("logical and Opreater : " + (a&b) );

        System.out.println("logical or opreater : " + (a|b));

        System.out.println("logical not opreater : " + (~a));
    }
}
