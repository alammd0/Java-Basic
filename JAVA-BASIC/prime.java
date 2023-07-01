import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ; 

        System.out.println("Enter the number : ");

        int num = sc.nextInt(); 

        boolean isPrime = true ; 

        for(int i = 2 ; i <= num-1  ; i++){
            if( num % i == 0){
                isPrime = false ; 
            }
        }

        if(isPrime == true){
            System.out.println("num is prime");
        }else{
            System.out.println("Num is Not prime");
        }
    }
}
