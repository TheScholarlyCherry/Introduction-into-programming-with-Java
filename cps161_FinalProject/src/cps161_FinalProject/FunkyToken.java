package cps161_FinalProject;
public class FunkyToken {
    char token;
    boolean active;

    FunkyToken(char token) {
        this.token = token;
        this.active = true;
    }

    char getTokenSymbol() {
        return token;
    }

    void move(FunkyBoard board) {
        // Subclasses will override this method
    }

    boolean isActive() {
        return active;
    }

    void setActive(boolean active) {
        this.active = active;
    }
}
