public class NumRightPyramid {
    public static void main(String[] args) {
        
        for(int i = 0; i < 5; i++)
        {
            for(int k = 1; k <= i; k++)
            {
                System.out.print("  ");
            }
            for(int j = 5;j > i; j--)
            {
                System.out.print((i+1)+" ");
            }
            System.out.println();
        }
    }
}
