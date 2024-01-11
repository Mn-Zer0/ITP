import java.util.Arrays;
import java.util.Random;

public class task2 {
    public static void main(String[] args) {
        System.out.println("------------1------------");
        System.out.println(duplicateChars("Donald"));
        System.out.println(duplicateChars("orange"));
        System.out.println("------------2------------");
        System.out.println(getInitials("Ryan Gosling"));
        System.out.println(getInitials("Vladimir Putin"));
        System.out.println("------------3------------");
        System.out.println(differenceEvenOdd(new int[]{44, 32, 86, 19}));
        System.out.println(differenceEvenOdd(new int[]{22, 50, 16, 63, 31, 55}));
        System.out.println("------------4------------");
        System.out.println(equalToAvg(new int []{1, 2, 3, 4, 5}));
        System.out.println(equalToAvg(new int []{1, 2, 3, 4, 6}));
        System.out.println("------------5------------");
        System.out.println(Arrays.toString(indexMulti(new int[]{1, 2, 3})));
        System.out.println(Arrays.toString(indexMulti(new int[]{3, 3, -2, 408, 3, 31})));
        System.out.println("------------6------------");
        System.out.println(reverse("Hello World"));
        System.out.println(reverse("The quick brown fox."));
        System.out.println("------------7------------");
        System.out.println(Tribonacci(7));
        System.out.println(Tribonacci(11));
        System.out.println("------------8------------");
        System.out.println(pseudoHash(5));
        System.out.println(pseudoHash(10));
        System.out.println(pseudoHash(0));
        System.out.println("------------9------------");
        System.out.println(botHelper("Hello, I`m under the water, please help me"));
        System.out.println(botHelper("Two pepperoni pizzas please"));
        System.out.println("------------10------------");
        System.out.println(isAnagram("listen", "silent"));
        System.out.println(isAnagram("eleven plus two", "twelve plus one"));
        System.out.println(isAnagram("hello", "world"));

    }
    // 1
    public static boolean duplicateChars(String str) {
        for (int i = 0; i < str.length() - 1; i++) {
            char currentChar = str.toLowerCase().charAt(i);
            for (int j = i + 1; j < str.length(); j++) {
                if (currentChar == str.charAt(j)) {
                    return true;
                }
            }
        }
        return false;
    }
    // 2
    public static String getInitials(String name) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < name.length(); i++) {
            char initials = name.charAt(i);
            if (Character.isUpperCase(initials)) {
                result.append(initials);
            }
        }
        return result.toString();
    }
    // 3
    public static int differenceEvenOdd(int[] numbers) {
        int even = 0;
        int odd = 0;
        for (int i : numbers) {
            if (i % 2 == 0) {
                even += i;
            } else {
                odd += i;
            }
        }
        return Math.max(even, odd) - Math.min(even, odd);
    }
    // 4
    public static boolean equalToAvg(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        double average = (double) sum / numbers.length;
        for (int j : numbers) {
            if (j == average) {
                return true;
            }
        }
        return false;
    }
    // 5
    public static int[] indexMulti(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = numbers[i] * i;
        }
        return numbers;
    }
    // 6
    public static String reverse(String str) {
        StringBuilder reverse = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reverse.append(str.charAt(i));
        }
        return reverse.toString();
    }
    // 7
    public static int Tribonacci(int num) {
        if (num == 0 || num == 1) {
            return 0;
        } else if (num == 2) {
            return 1;
        }
        int num1 = 0, num2 = 0, num3 = 1, num4;
        for (int i = 3; i <= num - 1; i++) {
            num4 = num1 + num2 + num3;
            num1 = num2;
            num2 = num3;
            num3 = num4;
        }
        return num3;
    }
    // 8
    public static String pseudoHash(int lenght_hash) {
        String characters = "0123456789abcdef";
        Random random = new Random();
        StringBuilder hash = new StringBuilder();
        if (lenght_hash <= 0) {
            return "";
        } else {
            for (int i = 0; i <= lenght_hash - 1; i++) {
                int y = random.nextInt(characters.length());
                hash.append(characters.charAt(y));
            }
        }
        return hash.toString();
    }
    // 9
    public static String botHelper(String str) {
        String word = "help";
        boolean containsword = str.contains(word);
        return (containsword)? "Calling for a staff member" : "Keep waiting";
    }
    // 10
    public static boolean isAnagram(String str1, String str2) {
        str1 = str1.replaceAll("\\s",  "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();
        char[] s1 = str1.toCharArray();
        char[] s2 = str2.toCharArray();
        Arrays.sort(s1);
        Arrays.sort(s2);
        return Arrays.equals(s1, s2);
    }
}