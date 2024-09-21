class R{
    public static void main(String[] args) {
        
        int k = 1;
        for(int x = 1; x < 7; x++){
            for(int y = 1; y < 6; y++){

                if(x == 1 || y == 1 || x == 3 || (x <= 2 && y == 5) || x + y == k){

                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            System.out.println();
            k = k + 2;
        }
    }
}