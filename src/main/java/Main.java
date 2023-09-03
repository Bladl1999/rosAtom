public class Main {

    public static void main(String[] args) {
    }

    /**
     * Задача 2
     * Есть 2 целочисленных переменных a и b, в которых хранятся определенные
     * значения. Нужно написать на Java метод, меняющий местами значения
     * переменных a и b, не используя 3й переменной.
     * @param a
     * @param b
     */
    public static void variableСhange(int a, int b) {
        a ^= b;
        b ^= a;
        a ^= b;
    }

    /**
     * Задача 3.2. Написать на Java метод, проверяющий является ли строка палиндромом.
     * @param text строка котурую надо провереть на палидром
     * @return если палидром воращает true инча false
     */
    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
                        .reverse().toString());
    }
}
