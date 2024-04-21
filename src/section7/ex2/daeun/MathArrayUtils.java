package section7.ex2.daeun;

import java.util.Arrays;

public class MathArrayUtils {
    private MathArrayUtils() {

    }

    public static int sum(int[] values) {
        int result = 0;
        for (int value : values) {
            result += value;
        }
        return result;
    }

    public static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    public static int min(int[] values) {
        return Arrays.stream(values).min().getAsInt();
    }

    public static int max(int[] values) {
        return Arrays.stream(values).max().getAsInt();
    }


}
