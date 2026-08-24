public class StarPattern {
    public static void main(String[] args) {

        for (int row = 1; row <= 7; row++) {  // rows
            for (int column = 1; column <= 7; column++) {  //columns

                if (column == 4
                        || column == row // or
                        || column == 8 - row) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}
