package Advance_Star;

public class hallow {
    public static void main(String[] args) {
         int totalRow = 4 ; 
         int totalCol = 4 ;

         for(int i = 1 ; i <= totalRow ; i++){
            for(int j = 1 ; j <= totalCol ; j++){
                if(i == 1 || i == totalRow || j == 1 || j == totalCol){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
             System.out.println();
         }
    }
}
