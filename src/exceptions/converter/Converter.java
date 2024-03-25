package exceptions.converter;

class Converter {
    public static void main(String[] args) {
        System.out.println(convertStringToDouble(String.valueOf(123.0)));
        System.out.println(convertStringToDouble(String.valueOf(123)));
        System.out.println(convertStringToDouble("123"));
    }

    public static double convertStringToDouble(String input) {
        double parseDouble = 0;

        try {
            parseDouble = Double.parseDouble(input);
        } catch (RuntimeException e) {

        }
        return parseDouble;
    }
}