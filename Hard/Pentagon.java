public class Pentagon {
    public static void main(String[] args) {

        // Upper Part
        for(int a = 1; a < 5; a++){
            for(int b = 1; b < 6-a; b++){
                System.out.print("  ");
            }      
            for(int c = 1; c <= 2*a-1; c++){
                System.out.print("* ");
            }
            System.out.println();
        }

        // Lower Part
        for(int i = 0; i < 5; i++){ 
            for(int k = 5; k > 5-i ;k--){
                System.out.print(" ");
            } 
            for(int j = 0; j < 9-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
