package section7.ex2.jinyong;

public class MathArrayUtils {

    private MathArrayUtils() {}
    public static int sum(int[] value){
        int result = 0;
        for(int i = 0; i < value.length; i++){
            result += value[i];
        }
        //  for (int j : value) {
        //      result += j;
        //  }
        return result;
    }
    public static int average(int[] value){
        int sum = 0;
        int result = 0;
        for(int i = 0; i < value.length; i++){
            sum += value[i];
        }

        result = sum / value.length;

        return result;
    }
    public static int min(int[] value){
        int minValue = value[0];
        int result = 0;
        for(int i = 0; i < value.length; i++){
            if(minValue <= value[i]){
                result = value[i];
            }
        }

        return result;
    }
    public static int max(int[] value){
        int maxValue = value[0];
        int result = 0;
        for(int i = 0; i < value.length; i++){
            if(maxValue >= value[i]){
                result = value[i];
            }
        }

        return result;
    }
}
