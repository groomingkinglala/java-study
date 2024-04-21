package section7.ex2.juhwan;

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

    public static Double average(int[] values) {
        return sum(values) / (double) values.length;
    }

    public static int min(int[] values) {
        if (!validateValues(values)) {
            return -1;
        }

        int minValue = values[0];

        for (int value: values) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static int max(int[] values) {
        if (!validateValues(values)) {
            return -1;
        }

        int maxValue = values[0];

        for (int value: values) {
            if (maxValue < value) {
                maxValue = value;
            }
        }
        return maxValue;

    }

    private static boolean validateValues(int[] values) {
        if (values.length < 1) {
            System.out.println("한 개 이상의 숫자가 포함 되어야 합니다.");
            return false;
        }
        return true;
    }
}
