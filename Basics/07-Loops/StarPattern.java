public class StarPattern {
    public static void main(String[] args) {

        for (int row = 1; row <= 7; row++) { // создаем 7 строк

            for (int column = 1; column <= 7; column++) { // создаем 7 позиций

                if (row == column || row + column == 8 || column == 4) { // ставить звездочку или оставить пустое место
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }

            System.out.println();
        }
    }
}