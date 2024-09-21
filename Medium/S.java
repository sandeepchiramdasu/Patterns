public class S {
    public static void main(String[] args) {
        
        for(int x = 1; x < 6; x++){
            for(int y = 1; y < 6; y++){

                if(x == 1 || x == 3 || x == 5 || (x + y == 3) || (x + y == 9)){

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
