public class Q {
    public static void main(String[] args) {
        
        for(int x = 1; x < 7; x++){
            for(int y = 1; y < 7; y++){

                if((x == 1 && y <= 5) || (y == 1 && x <= 5) || (x == 5 && y <= 5)
                 || (y == 5 && x <= 5) || (x == y && x >= 3)){

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
