package Seminar2;

public class Ushtrimi8 {
    public static void main(String[] args) {
        System.out.println(fjalePalindrome("12344321"));
    }

    private static boolean fjalePalindrome(String string) {
        if (string.equals("") || string.length() == 1) {
            return true;
        } else if (string.charAt(0) != string.charAt(string.length() - 1)) {
            return false;
        }

        return fjalePalindrome(string.substring(1, string.length() - 1));
    }

    private static boolean fjaliPalindrome(String fjali){
        if (fjali.equals("") || fjali.length() == 1){
            return true;
        }

        boolean bool = true;

        while (bool){
            if (!Character.isLetterOrDigit(fjali.charAt(0))){
                fjali = fjali.substring(1);
            } else if (!Character.isLetterOrDigit(fjali.charAt(fjali.length() - 1))){
                fjali = fjali.substring(0, fjali.length() - 1);
            } else {
                bool = false;
            }
        }

        if (fjali.charAt(0) != fjali.charAt(fjali.length() - 1)) {
            return false;
        }

        return fjaliPalindrome(fjali.substring(1, fjali.length() - 1));
    }
}
