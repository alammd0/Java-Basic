package opreaterinJava;

import java.util.Scanner;

public class relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the 1st number : ");
        int a = sc.nextInt() ; 

        System.out.println("Enter the 2nd number : ");
        int b = sc.nextInt() ; 

        if (a==b){
            System.out.println("Equal to opreater");
        }
        else if(a != b){
            System.out.println("Not equal to Opreater");
        }
        else if(a > b){
            System.out.println("a is greater than b");
        }
        else if(a < b){
            System.out.println("A is less than b");
        }
        else if(a >= b){
            System.out.println("a is greater than equal to b");
        }
        else if(a <= b){
            System.out.println("A is less than equal to b");
        } else{
            System.out.println("This is not define");
        }
    }
}
