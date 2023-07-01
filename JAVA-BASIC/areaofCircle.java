import java.util.Scanner;


public class areaofCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        float pi = 3.14f ; 

        System.out.println("Enter the value of r");

        float r = sc.nextFloat() ; 

        float ans = pi * r * r ; 

        System.out.println("circle area : "+ ans);
    }
}
