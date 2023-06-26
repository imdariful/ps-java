package Patterns.BasicPatterns;

public class FloydsTriangle {
    public static void main(String[] args) {
        // define row number
        int n = 5;
        int flag = 1;

        // outter loop
        for (int i = 1; i <= n; i++) {
            // inner loop
            for (int j = 1; j <= i; j++) {
                System.out.print(flag + " ");
                // increse the flag
                flag++;
            }
            System.out.println();
        }
    }
}
