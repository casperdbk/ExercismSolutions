package QueenAttackCalculator;

public class QueenAttackCalculator {
    boolean attackable = false;
    public QueenAttackCalculator(Queen q1, Queen q2) {
        if (q1 == null || q2 == null) {
            throw new IllegalArgumentException("You must supply valid positions for both Queens.");
        }
        if (q1.pos1 == q2.pos1 && q1.pos2 == q2.pos2) {
            throw new IllegalArgumentException("Queens cannot occupy the same position.");
        }
        if (q1.pos1 == q2.pos1 || q1.pos2 == q2.pos2) {
            attackable = true;
        }
        if (Math.abs(q1.pos1 - q2.pos1) == Math.abs(q1.pos2 - q2.pos2)) {
            attackable = true;
        }
    }
    public boolean canQueensAttackOneAnother() {
        return attackable;
    }
}
class Queen {
    int pos1;
    int pos2;
    public Queen(int pos1, int pos2) {
        if (pos1 < 0) {
            throw new IllegalArgumentException("Queen position must have positive row.");
        }
        if (pos2 < 0) {
            throw new IllegalArgumentException("Queen position must have positive column.");
        }
        if (pos1 > 7 ) {
            throw new IllegalArgumentException("Queen position must have row <= 7.");
        }
        if (pos2 > 7 ) {
            throw new IllegalArgumentException("Queen position must have column <= 7.");
        }
        this.pos1 = pos1;
        this.pos2 = pos2;
    }
}
