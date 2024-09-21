public class V {
    public static void main(String[] args) {
        
        for(int x = 1; x <= 5; x++){
            for(int y = 1; y <= 9; y++){

                if(x == y || x + y == 10){

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
