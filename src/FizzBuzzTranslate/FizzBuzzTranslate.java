package FizzBuzzTranslate;

public class FizzBuzzTranslate {
    public static String fizzBuzz(int number) {
        if (number <= 0 || number >= 100) {
            throw new IllegalArgumentException("Number must be between 1 and 100");
        }


        boolean divisibleBy3 = number % 3 == 0;
        boolean divisibleBy5 = number % 5 == 0;
        boolean contains3 = String.valueOf(number).contains("3");
        boolean contains5 = String.valueOf(number).contains("5");
        if (divisibleBy3 && divisibleBy5) {
            return "FizzBuzz";
        } else if (divisibleBy3 || contains3) {
            return "Fizz";
        } else if (divisibleBy5 || contains5) {
            return "Buzz";
        } else {
            return convertNumberToWords(number);
        }
    }

    private static String convertNumberToWords(int number) {
        String[] words = {"Khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin", "muoi"};
        StringBuilder result = new StringBuilder();
        for (char c : String.valueOf(number).toCharArray()) {
            result.append(words[c - '0']).append(" ");
        }
        return result.toString().trim();
    }
}