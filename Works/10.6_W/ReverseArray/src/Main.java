import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        String[] array = {"a", "b", "c", "d", "r"};
        System.out.println(Arrays.toString(reverse(array)));

    }

    public static String[] reverse(String[] array) {

        for (int i = 0; i < array.length / 2; i++) {
            String temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }

        return array;
    }
}