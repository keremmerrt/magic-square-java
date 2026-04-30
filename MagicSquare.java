import java.util.Scanner;

class MagicSquare {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n = input.nextInt();

        // The program only works for odd numbers between 3 and 200
        if (n < 3 || n > 200 || n % 2 == 0) {
            input.close();
            return;
        }

        int[][] square = new int[n][n];

        // Start from the middle of the first row
        int row = 0;
        int column = n / 2;

        for (int number = 1; number <= n * n; number++) {
            square[row][column] = number;

            // Save the current position in case the next cell is already occupied
            int oldRow = row;
            int oldColumn = column;

            // Move one row up and one column to the right
            row = row - 1;
            column = column + 1;

            // Wrap around vertically
            if (row < 0) {
                row = n - 1;
            }

            // Wrap around horizontally
            if (column == n) {
                column = 0;
            }

            // If the new cell is already occupied, move down from the previous position
            if (square[row][column] != 0) {
                row = oldRow + 1;
                column = oldColumn;

                if (row == n) {
                    row = 0;
                }
            }
        }

        // Print the magic square
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(square[i][j]);

                if (j < n - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        input.close();
    }
}