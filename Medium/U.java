public class U {
    public static void main(String[] args) {
        
        for(int x = 1; x < 6; x++){
            for(int y = 1; y < 6; y++){

                if(y == 1 || x == 5 || y == 5){

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
