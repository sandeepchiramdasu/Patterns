public class O{
    public static void main(String[] args) {
        
        for(int x = 1; x < 6; x++){
            for(int y = 1; y < 6; y++){

                if((x == 1 && y >= 2 && y <= 4) || (y == 1 && x >= 2 && x <= 4) || (y == 5 && x >= 2 && x <= 4) || (x == 5 && y <= 4 && y >= 2)){

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
