import java.util.Scanner;

public class ConsoleNumbers {
    private static final int defaultPadding = 3;

    public static String getZero() {
        return String.format(
                " ______ \n" +
                        "| ____ |\n" +
                        "||    ||\n" +
                        "||    ||\n" +
                        "||____||\n" +
                        "|______|"
        );
    }

    public static String getOne() {
        return String.format(
                " ____    \n" +
                        "|__  |   \n" +
                        "   | |   \n" +
                        "   | |   \n" +
                        " __| |__ \n" +
                        "|_______|"
        );
    }

    public static String getTwo() {
        return String.format(
                " ______ \n" +
                        "|____  |\n" +
                        " ____| |\n" +
                        "|   ___|\n" +
                        "|  |___ \n" +
                        "|______|"
        );
    }

    public static String getThree() {
        return String.format(
                " ______ \n" +
                        "|____  |\n" +
                        "    /  /\n" +
                        "    ) ( \n" +
                        " ___\\  |\n" +
                        "|______|\n"
        );
    }

    public static String getFour() {
        return String.format(
                " __    __ \n" +
                        "|  |  |  |\n" +
                        "|  |__|  |\n" +
                        "|_____   |\n" +
                        "      |  |\n" +
                        "      |__|"
        );
    }

    public static String getFive() {
        return String.format(
                " _______  \n" +
                        "|  _____| \n" +
                        "| |_____  \n" +
                        "|_____  \\ \n" +
                        " _____|  |\n" +
                        "|_______/ "
        );
    }

    public static String getSix() {
        return String.format(
                " _______  \n" +
                        "|  _____| \n" +
                        "| |_____  \n" +
                        "|  ___  \\ \n" +
                        "| |___|  |\n" +
                        "|_______/ "
        );
    }

    public static String getSeven() {
        return String.format(
                "  _________ \n" +
                        " |   ______|\n" +
                        " |  |       \n" +
                        "=|==|==     \n" +
                        " |  |       \n" +
                        " |__|       "
        );
    }

    public static String getEight() {
        return String.format(
                " _______ \n" +
                        "|  ___  |\n" +
                        "| |___| |\n" +
                        "|  ___  |\n" +
                        "| |___| |\n" +
                        "|_______|"
        );
    }

    public static String getNine() {
        return String.format(
                " _______ \n" +
                        "|  ___  |\n" +
                        "| |___| |\n" +
                        "|____   |\n" +
                        " ____|  |\n" +
                        "|_______|"
        );
    }


    public static String concatenate(int number1, int number2) {
        return concatenate(defaultPadding, number1, number2);
    }

    public static String concatenate(int padding, int number1, int number2) {
        return concatenate(padding, convert(number1), convert(number2));
    }

    public static String concatenate(String number1, String number2) {
        return concatenate(defaultPadding, number1, number2);
    }

    public static String concatenate(int padding, String number1, String number2) {
        var result = new StringBuilder();
        var first = new Scanner(number1);
        var second = new Scanner(number2);

        while (first.hasNext() && second.hasNext()) {
            result.append(first.nextLine());
            for (int i = 0; i < padding; i++) {
                result.append(" ");
            }
            result.append(second.nextLine());
            result.append("\n");
        }
        return result.toString();
    }

    private static String convert(int number) {
        return switch (number) {
            case 0 -> getZero();
            case 1 -> getOne();
            case 2 -> getTwo();
            case 3 -> getThree();
            case 4 -> getFour();
            case 5 -> getFive();
            case 6 -> getSix();
            case 7 -> getSeven();
            case 8 -> getEight();
            case 9 -> getNine();
            default -> getZero();
        };
    }
}
