public class PhoneCleaner {

    public static void main(String[] args) {
        System.out.println(checkPhone("8-905-1234567"));
    }

    public static String checkPhone(String phone) {
        String regex = "[^0-9]";
        String result = phone.replaceAll(regex, "");


        if (result.length() != 11 && result.length() != 10) {
            return "Неверный формат номера!";
        }

        if (result.length() == 11 && (result.charAt(0) != '7' && result.charAt(0) != '8')) {
            return "Неверный формат номера!";
        }

        if (result.length() == 10) {
            return "7".concat(result);
        } else {
            return "7".concat(result.substring(1, 11));
        }
    }
}
