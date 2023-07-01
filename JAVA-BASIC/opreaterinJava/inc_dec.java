package opreaterinJava;

import java.util.Scanner;

public class inc_dec {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the number :");

        int a = sc.nextInt() ; 

        int pre_inc = ++a ; 
        System.out.println("Pre_increment : " + pre_inc); 

        int post_inc = a++; 
        System.out.println("Post_increment : " + post_inc);

        int post_dec = a--;
        System.out.println("post_decrement : "+ post_dec);

        int pre_dec = --a ; 
        System.out.println("pre_decrement : "+ pre_dec);
    }
}
