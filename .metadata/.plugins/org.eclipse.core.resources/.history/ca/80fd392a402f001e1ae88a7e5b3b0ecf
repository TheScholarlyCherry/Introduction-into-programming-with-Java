package cps161_FinalProject;
import java.util.Random;

public class RandomToken extends FunkyToken {
    RandomToken(char token) {
        super(token);
    }

    @Override
    void move(FunkyBoard board) {
        Random random = new Random();
        int x, y;

        do {
            x = random.nextInt(board.getSize());
            y = random.nextInt(board.getSize());
        } while (board.board[x][y] != ' ');

        board.board[x][y] = this.token;
    }
}
