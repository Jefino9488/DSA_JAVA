package Arrays;

public class CoordinateQuadrant {
    public static void main(String[] args) {
        int x = 5;  // X
        int y = -3; // Y

        System.out.println(determineQuadrant(x, y));
    }

    public static String determineQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            return "Quadrant I";
        } else if (x < 0 && y > 0) {
            return "Quadrant II";
        } else if (x < 0 && y < 0) {
            return "Quadrant III";
        } else if (x > 0 && y < 0) {
            return "Quadrant IV";
        } else if (x == 0 && y != 0) {
            return "Y-axis";
        } else if (y == 0 && x != 0) {
            return "X-axis";
        } else {
            return "Origin";
        }
    }
}

