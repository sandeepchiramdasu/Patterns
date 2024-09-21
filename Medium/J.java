public class J {
    public static void main(String[] args) {
        
        for(int x = 1; x < 6; x++){
            for(int y = 1; y < 6; y++){

                if(x == 1 || y == 3 || (x == 5 && y == 2) || (x == 5 && y ==2) || (x == 5 && y ==2) || (x == 4 && y ==1)){

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
