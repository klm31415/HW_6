import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println(findSymbolOccurance("Apple", "p"));               //2
        System.out.println(findWordPosition("Apollo", "pollo"));             //1
        System.out.println(findWordPosition("Apple", "Plant"));              //-1
        System.out.println(reverseString("12345"));                                       //54321
        System.out.println(isPalindrome("ere"));                                      //true
        System.out.println(isPalindrome("allo"));                                     //false
        guessWord();

    }

    public static int findSymbolOccurance(String string, String symbol) {
        int result = 0;
        char[] str = string.toCharArray();
        for (int i = 0; i < str.length; i++) {
            if (String.valueOf(str[i]).equals(symbol)) result++;
        }
        return result;
    }

    public static int findWordPosition(String source, String target) {
        int result = source.indexOf(target);
        return result;
    }

    public static String reverseString(String str) {
        int ln = str.length() - 1;
        String tmp;
        String result = "";
        for (int i = ln; i > -1; i--) {
            tmp = String.valueOf(str.charAt(i));
            result = result + tmp;
        }
        return result;
    }

    public static boolean isPalindrome(String str) {
        boolean result = false;
        String revStr = reverseString(str);
        result = revStr.equals(str);
        return result;
    }

    public static String userWord() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("==========================");
        System.out.println("Угадай слово, Ваш вариант: ");
        String word = scanner.nextLine();
        return word;
    }

    public static void guessWord() {
        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        //String result = "";

        while (true) {
            String answer = userWord();
            Random random = new Random();
            String saerch = words[random.nextInt(words.length)];
            if (answer.equals(saerch)) {
                System.out.println("Поздравляю, слово угадано");
                break;
            } else {
                System.out.println("Попробуйте еще раз");
                String hint = saerch.substring(0, 2);
                hint = hint + "#############";
                System.out.println("Загаданное слово: " + hint);
                //System.out.println("Загаданное слово полностью: "+saerch);
            }
        }
    }
}