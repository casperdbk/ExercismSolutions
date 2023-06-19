package Hamming;


public class Hamming {
    private String leftStrand;
    private String rightStrand;
    public Hamming(String leftStrand, String rightStrand) {
        if (leftStrand.isEmpty() && !rightStrand.isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (!leftStrand.isEmpty() && rightStrand.isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        if (leftStrand.length() != rightStrand.length()) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
    }

    public int getHammingDistance() {
        char[] leftStrandCharArray = leftStrand.toCharArray();
        char[] rightStrandCharArray = rightStrand.toCharArray();
        int counter = 0;
        for (int i = 0; i < leftStrandCharArray.length; i++) {
            if (leftStrandCharArray[i] != rightStrandCharArray[i]) {
                counter++;
            }
        }
        return counter;
    }
}