public class D {
    public static void main(String[] args) {
        
        for(int x = 1; x < 6; x++){
            for(int y = 1; y < 6; y++){

                if(y == 1 || (x == 1 & y <= 4) || (x == 5 && y <=4 ) || (x >= 2 && x <= 4) && y == 5){

                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
}
