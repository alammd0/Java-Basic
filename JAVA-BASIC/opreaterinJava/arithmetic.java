package opreaterinJava;

import java.util.Scanner;

public class arithmetic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;

        System.out.println("Enter the 1st Number : ");

        int a = sc.nextInt() ; 

        System.out.println("Enter the 2nd Number : ");

        int b = sc.nextInt() ; 

        int add = a + b ; 
        System.out.println("Addition of two Number : "+ add);

        int sub = a - b ; 
        System.out.println("Substract of two Number : " + sub);

        int mult = a * b ; 
        System.out.println("Multiplication of two Number : " + mult);

        int div = a / b ;
        System.out.println("Division first opreand by 2nd opreand : " + div);

        int mod = a % b ; 
        System.out.println("Modules opreater return the remder of two number : " + mod);

    }
}
