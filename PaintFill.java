import java.util.Arrays;


public class PaintFill {
    enum Color { Black, White, Red, Yellow, Green }

    public static boolean paintFill(Color[][] screen, int r, int c, Color newColor) {
        if (screen[r][c] == newColor) return false;
        return paintFill(screen, r, c, screen[r][c], newColor);
    }

    private static boolean paintFill(Color[][] screen, int r, int c, Color oldColor, Color newColor) {
        if (r < 0 || r >= screen.length || c < 0 || c >= screen[0].length) return false;
        if (screen[r][c] != oldColor) return false;

        screen[r][c] = newColor;

        paintFill(screen, r - 1, c, oldColor, newColor); // up
        paintFill(screen, r + 1, c, oldColor, newColor); // down
        paintFill(screen, r, c - 1, oldColor, newColor); // left
        paintFill(screen, r, c + 1, oldColor, newColor); // right

        return true;
    }

    public static void main(String[] args) {
        Color[][] screen = {
            {Color.Red, Color.Red, Color.Green},
            {Color.Red, Color.Red, Color.Green},
            {Color.Yellow, Color.Green, Color.Green}
        };

        paintFill(screen, 0, 0, Color.Black);

        // Print the screen
        for (Color[] row : screen) {
            System.out.println(Arrays.toString(row));
        }
    }
}
