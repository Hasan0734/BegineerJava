package basic.begineerjava;

public class Array2D3 {

    public static void main(String[] args) {
        int[][] numbers = new int[4][];
        int k = 0;

        numbers[0] = new int[1];
        numbers[1] = new int[2];
        numbers[2] = new int[3];
        numbers[3] = new int[4];
        
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i+1; j++) {
               numbers[i][j] = k;
               k++;
            }
        }
        
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print(" " + numbers[i][j]);
            }
            System.out.println("");
        }
    }
}
