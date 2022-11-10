/**
 * invertedHalfPyramidPatternsWithNumbers
 */
public class invertedHalfPyramidPatternsWithNumbers {

    public static void inverted_Half_Pyramid_WithNumbers(int n) {
        // outer Loop
        for (int i = 1; i <= n; i++) {

            // inner numbers
            for (int j = 1; j <= n - i + 1; j++) {
                System.out.print(j);
            }
            System.out.println();

        }

    }

    public static void main(String[] args) {
        inverted_Half_Pyramid_WithNumbers(5);
    }
}