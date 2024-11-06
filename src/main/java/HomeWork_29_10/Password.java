package HomeWork_29_10;

import java.util.Scanner;

public class Password {
    public static void main(String[] args) {
        Scanner password = new Scanner(System.in);
        System.out.print("Введите пароль: ");
        String Pass = password.nextLine();

        if (isValidPassword(Pass)) {
            System.out.println("Пароль принят");
        }
    }

    private static boolean isValidPassword(String Pass) {

        if (Pass.length() < 8) {
            System.out.println("Пароль не менее 8 символов");
            return false;
        }

        if (!containsDigit(Pass)) {
            System.out.println("Пароль должен содержать минимум 1 цифру");
            return false;
        }

        if (!containsSpecialCharacter(Pass)) {
            System.out.println("Пароль должен содержать минимум 1 спецсимвол");
            return false;
        }

        return true;
    }

    private static boolean containsDigit(String Pass) {
        for (char c : Pass.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }

    private static boolean containsSpecialCharacter(String Pass) {
        String specialCharacters = "!@#$%^&*№";
        for (char c : Pass.toCharArray()) {
            if (specialCharacters.indexOf(c) >= 0) {
                return true;
            }
        }
        return false;
    }
}