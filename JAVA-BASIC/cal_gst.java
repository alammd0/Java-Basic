import java.util.Scanner;

public class cal_gst {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the price of Penceil :");
        float penc = sc.nextFloat() ; 

        System.out.println("Enter the price of pen : ");
        float pen = sc.nextFloat(); 

        System.out.println("Enter the prices of erar : ");
        float ear = sc.nextFloat() ; 

        float total = penc + pen + ear  ; 

        float ans = total + (0.18f * total);

        System.out.println("3 item from and calute the price include gst : "+ ans);
    }
}
