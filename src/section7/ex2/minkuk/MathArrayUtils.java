package section7.ex2.minkuk;

class MathArrayUtils {
    private MathArrayUtils() {
    }

    static int sum(int[] values) {
        int total = 0;
        for (int value : values) {
            total += value;
        }

        return total;
    }

    static double average(int[] values) {
        return (double) sum(values) / values.length;
    }

    static int min(int[] values) {
        int minValue = values[0];
        for (int value : values) {
            if (value < minValue) {
                minValue = value;
            }
        }

        return minValue;
    }

    static int max(int[] values) {
        int maxValue = values[0];
        for (int value : values) {
            if (value > maxValue) {
                maxValue = value;
            }
        }

        return maxValue;
    }
}
