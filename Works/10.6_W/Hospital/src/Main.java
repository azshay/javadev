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

        for (float patient : array) {
            result = result.concat("[ ").concat(String.format("%.1f", patient)).concat(" ]");
            sum += patient;
            if (patient > 36.2 && patient < 36.9) {
                result = result.concat(" [ HEALTHY ]\n");
                healthyCount++;
            } else {
                result = result.concat(" [ SICK! ALARM! ]\n");
            }
        }

        result = result.concat("[ AVG: ").concat(String.format("%.1f", sum / array.length)).concat(" ]\n");
        result = result.concat("[ Healthy count: " + healthyCount + " ]\n");

        return result;
    }
}