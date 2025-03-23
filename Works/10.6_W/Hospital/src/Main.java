import java.util.Random;

public class Main {
    private final static int MAX_TEMPERATURE = 40;
    private final static int MIN_TEMPERATURE = 32;

    public static void main(String[] args) {
        System.out.println(getReport(generatePatientsTemperatures(50)));
    }

    public static float[] generatePatientsTemperatures(int count) {
        float[] result = new float[count];
        Random random = new Random();

        for (int i = 0; i < count; i++) {
            result[i] = MIN_TEMPERATURE + random.nextFloat() * (MAX_TEMPERATURE - MIN_TEMPERATURE);
        }

        return result;
    }

    public static String getReport(float[] array) {
        String result = "";
        float sum = 0;
        int healthyCount = 0;

        for (int i = 0; i < array.length; i++) {
            result = result.concat("[ ").concat(String.valueOf(String.format("%.10f", array[i]))).concat(" ]\n");
            sum += array[i];
            if (array[i] > 36.2 && array[i] < 36.9) {
                healthyCount++;
            }
        }

        return result;
    }
}