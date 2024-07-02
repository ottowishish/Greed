import java.util.Random;

public class Die {
    // represents a die with 6 faces, ranging from 1 to 6
    private static final Random random = new Random();
    private final int numberOfFaces; // number of faces on the die
    private int currentFace; // current die face

    public Die () {
        // creates a 6-sided die with a current face of 1
        numberOfFaces = 6;
        currentFace = 1;
    }

    public int roll() {
        // rolls the die and returns the current die face
        currentFace = random.nextInt(numberOfFaces) + 1;
        return currentFace;
    }

    public int getCurrentFace() {
        // returns the current die face
        return currentFace;
    }
}