package live_coding;

public class MaxFinder {

    public static int maxFinder(int a, int b) {
        int max;
        if (a < b) max = b;
        else max = a;

        return max;
    }
}