package Seminar2;

public class Ushtrimi9 {
    public static void main(String[] args) {

        String string = "hdnndllsiwjcdadhoesacckeje0";

        System.out.println(isPresent(string, 'c'));
        System.out.println(timesPresent(string, 'c'));
        System.out.println(removeChar(string, 'c'));

    }

    private static boolean isPresent(String string, char c) {
        if (string.equals("")) {
            return false;
        } else if (string.charAt(0) == c) {
            return true;
        }

        return isPresent(string.substring(1), c);
    }

    private static int timesPresent(String string, char c) {
        if (string.equals("")) {
            return 0;
        } else if (string.charAt(0) == c) {
            return timesPresent(string.substring(1), c) + 1;
        }

        return timesPresent(string.substring(1), c);
    }

    private static String removeChar(String string, char c) {
        if (string.equals("")) {
            return "";
        } else if (string.charAt(0) == c) {
            return removeChar(string.substring(1), c);
        } else {
            return string.charAt(0) + removeChar(string.substring(1), c);
        }
    }
}
