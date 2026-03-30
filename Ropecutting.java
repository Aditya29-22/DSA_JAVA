import java.io.*;

public class GFG {

    static int maxCuts(int n, int a, int b, int c)
    {
        // base cases
        if (n == 0)
            return 0;
        if (n < 0)
            return -1;

        // try all three possible cuts
        int res = Math.max(
                    maxCuts(n - a, a, b, c),
                    Math.max(
                        maxCuts(n - b, a, b, c),
                        maxCuts(n - c, a, b, c)
                    )
                 );

        // if no valid cut is possible
        if (res == -1)
            return -1;

        // include current cut
        return res + 1;
    }

    public static void main(String[] args) {
        int n = 17, a = 10, b = 11, c = 3;
        System.out.println(maxCuts(n, a, b, c));
    }
}
