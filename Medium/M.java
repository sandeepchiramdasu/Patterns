public class M{
    public static void main(String[] args) {
        
        for(int x = 1; x < 6; x++){
            for(int y = 1; y < 6; y++){

                if(y == 5 || y == 1 || (x == y && x + y <= 6) || (x == 2 && y == 4)){

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
