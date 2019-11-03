package snake.model;

public class GenRocks {
    public static void main(String[] args) {
        boolean rocks[][] = new boolean[23][25];
        for (int x = 0; x < 23; x++) {
            rocks[x][0] = rocks[x][24] = true;
        }
        for (int y = 0; y < 25; y++) {
            rocks[0][y] = rocks[22][y] = true;
        }
        for (int i = 0; i < 23; i++) {
            System.out.println();
            for (int j = 0; j < 25; j++) {
//                System.out.print("  ");
                if (rocks[i][j]) {

                    System.out.print("*");
                }
               else{
                    System.out.print(" ");
                }
            }
        }
    }
}
