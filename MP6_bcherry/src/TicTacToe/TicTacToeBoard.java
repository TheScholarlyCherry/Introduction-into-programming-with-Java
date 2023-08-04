package TicTacToe;

public class TicTacToeBoard {
    private char[][] board;
    private int size;
    private char emptySpace;

    public TicTacToeBoard(int size) {
        this.size = size;
        this.emptySpace = '-';
        initializeBoard();
    }

    private void initializeBoard() {
        board = new char[size][size];
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                board[i][j] = emptySpace;
            }
        }
    }

    public void displayBoard() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    public boolean isTaken(int row, int col) {
        return row < 0 || row >= size || col < 0 || col >= size || board[row][col] != emptySpace;
    }

    public boolean isFull() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (board[i][j] == emptySpace) {
                    return false;
                }
            }
        }
        return true;
    }

    public boolean placeToken(char token, int row, int col) {
        if (!isTaken(row, col)) {
            board[row][col] = token;
            return true;
        } else {
            System.out.println("This space is already taken. Please choose another spot.");
            return false;
        }
    }

    private char getHorizontalWinner() {
        for (int i = 0; i < size; i++) {
            char firstToken = board[i][0];
            boolean win = true;
            for (int j = 1; j < size; j++) {
                if (board[i][j] != firstToken || board[i][j] == emptySpace) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return firstToken;
            }
        }
        return emptySpace; // No winner in this row
    }

    private char getVerticalWinner() {
        for (int j = 0; j < size; j++) {
            char firstToken = board[0][j];
            boolean win = true;
            for (int i = 1; i < size; i++) {
                if (board[i][j] != firstToken || board[i][j] == emptySpace) {
                    win = false;
                    break;
                }
            }
            if (win) {
                return firstToken;
            }
        }
        return emptySpace; // No winner in this column
    }

    private char getDiagonalWinner() {
        char centerToken = board[size / 2][size / 2];
        boolean win = true;

        // Check main diagonal
        for (int i = 0; i < size; i++) {
            if (board[i][i] != centerToken || board[i][i] == emptySpace) {
                win = false;
                break;
            }
        }
        if (win) {
            return centerToken;
        }

        win = true;
        // Check the other diagonal
        for (int i = 0; i < size; i++) {
            if (board[i][size - 1 - i] != centerToken || board[i][size - 1 - i] == emptySpace) {
                win = false;
                break;
            }
        }
        if (win) {
            return centerToken;
        }

        return emptySpace; // No winner
    }

    public char getWinner() {
        char horizontalWinner = getHorizontalWinner();
        if (horizontalWinner != emptySpace) {
            return horizontalWinner;
        }

        char verticalWinner = getVerticalWinner();
        if (verticalWinner != emptySpace) {
            return verticalWinner;
        }

        char diagonalWinner = getDiagonalWinner();
        if (diagonalWinner != emptySpace) {
            return diagonalWinner;
        }

        return emptySpace; // No winner
    }

    public char getEmptySpace() {
        return emptySpace;
    }
}