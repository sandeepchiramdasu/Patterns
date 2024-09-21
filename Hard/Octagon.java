public class Octagon {
    public static void main(String[] args) {
        
        for(int a = 1; a < 5; a++){
            for(int b = 1; b < 8-a; b++){
                System.out.print("  ");
            }      
            for(int c = 1; c <= 2*a-1; c++){
                System.out.print(" *");
            }
            System.out.println();
        }

        for(int a = 0; a < 4; a++){
            for(int b = 0; b < 4-a; b++){
                System.out.print(" ");
            }
            for(int c = 0; c < 10+a; c++){
                System.out.print("* ");
            }
            System.out.println();
        }
        
        for(int i = 0; i < 5; i++){ 
            for(int k = 10; k > 10-i ;k--){
                System.out.print(" ");
            } 
            for(int j = 0; j < 14-i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int a = 5; a > 0; a--){
            for(int b = 7-a; b >=1 ; b--){
                System.out.print("  ");
            }      
            for(int c = 2*a-1; c >= 1; c--){
                System.out.print(" *");
            }
            System.out.println();
        }

    }
}
