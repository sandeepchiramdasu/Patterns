public class G {
    public static void main(String[] args) {
         
        for(int x = 1; x < 6; x++){
            for(int y = 1; y < 6; y++){

                if(x == 1 || x == 5|| y == 1 || (x == 4 && y ==5) || (x == 3 && y == 5) || (x == 3 && y == 4)){

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
