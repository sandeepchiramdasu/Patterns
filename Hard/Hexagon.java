public class Hexagon {
    public static void main(String[] args) {

        // Upper Part
        for(int a = 0; a < 4; a++){
            for(int b = 0; b < 4-a; b++){
                System.out.print(" ");
            }
            for(int c = 0; c < 5+a; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
        // Lower part
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
