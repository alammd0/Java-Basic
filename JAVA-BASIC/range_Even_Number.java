import java.util.Scanner;

public class range_Even_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the Last digit : ");

        int ls = sc.nextInt(); 
        
        for(int i = 9 ; i <= ls ; i++){
            if (i % 2 != 0){
                System.out.print(i + " , ");
            }
        }
    }
}
