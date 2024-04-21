package section7.ex1.hyeeun;

public class MathArrayUtils {

    private MathArrayUtils() {
        //생성 제한
    }

    public static int sum(int[] array) {
        int total = 0;
        for (int i : array) {
            total += i;
        }
        return total;
    }

    public static double average(int[] array) {
        return (double) sum(array) / array.length;
    }

    public static int min(int[] array) {
        int minimum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= minimum) {
                minimum = array[i];
            }
        }
        return minimum;
    }

    public static int max(int[] array) {
        int maximum = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] >= maximum) {
                maximum = array[i];
            }
        }
        return maximum;
    }
}
