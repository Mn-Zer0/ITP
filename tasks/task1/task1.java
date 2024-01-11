public class task1 {
    public static void main(String[] args) {

        System.out.println("----------1----------");
        System.out.println(convert(5));
        System.out.println(convert(3));
        System.out.println(convert(8));
        System.out.println("----------2----------");
        System.out.println(fitCalc(15, 1));
        System.out.println(fitCalc(24, 2));
        System.out.println(fitCalc(41, 3));
        System.out.println("----------3----------");
        System.out.println(containers(3, 4, 2));
        System.out.println(containers(5, 0, 2));
        System.out.println(containers(4, 1, 4));
        System.out.println("----------4----------");
        System.out.println(triangleType(5, 5, 5));
        System.out.println(triangleType(5, 4, 5));
        System.out.println(triangleType(3, 4, 5));
        System.out.println(triangleType(5, 1, 1));
        System.out.println("----------5----------");
        System.out.println(ternaryEvaluation(8, 4));
        System.out.println(ternaryEvaluation(1, 11));
        System.out.println(ternaryEvaluation(5, 9));
        System.out.println("----------6----------");
        System.out.println(howManyItems(22, 1.4f, 2));
        System.out.println(howManyItems(45, 1.8f, 1.9f));
        System.out.println(howManyItems(100, 2, 2));
        System.out.println("----------7----------");
        System.out.println(factorial(3));
        System.out.println(factorial(5));
        System.out.println(factorial(7));
        System.out.println("----------8----------");
        System.out.println(gcd(48, 18));
        System.out.println(gcd(52, 8));
        System.out.println(gcd(259, 28));
        System.out.println("----------9----------");
        System.out.println(ticketSeller(70, 1500));
        System.out.println(ticketSeller(24, 950));
        System.out.println(ticketSeller(53, 1250));
        System.out.println("----------10----------");
        System.out.println(tables(5, 2));
        System.out.println(tables(31, 20));
        System.out.println(tables(123, 58));
    }
    // 1
    public static float convert(int liters) {
        return liters * 3.785f;
    }


    // 2
    public static int fitCalc(int minutes, int intensity) {
        return minutes * intensity;
    }


    // 3
    public static int containers(int box, int bag, int barrel) {
        return box * 20 + bag * 50 + barrel * 100;
    }


    // 4
    public static String triangleType(int a, int b, int c) {
        if (a == b & a == c & c == b) {
            return "Равносторонний";
        } else if (a + b < c || a + c < b || b + c < c) {
            return "Не существует";
        } else if (a == b || a == c || b == c) {
            return "Равнобедренный";
        } else {
            return "Разносторонний";
        }
    }
    // 5
    public static int ternaryEvaluation(int a, int b) {
        return a > b ? a : b;
    }


    // 6
    public static int howManyItems(float n, float w, float h) {
        return (int) (n / (w * h) * 2);
    }


    // 7
    public static int factorial(int x) {
        int f = 1;
        for (int i = 1; i <= x; i++) {
            f = f * i;
        }
        return f;
    }


    // 8
    public static float gcd(int x, int y) {
        while (x != y) {
            if (x > y) {
                x = x - y;
            }
            else {
                y = y - x;
            }
        }
        return x;
    }


    // 9
    public static int ticketSeller(int a, int b) {
        return a * b * (100 - 28) / 100;
    }
    // 10
    public static int tables(float students, float tables) {
        float result = (students - (tables * 2)) / 2;
        if (result < 0){
            result = 0;
        }
        else if (result % 10 != 0) {
            result += 0.5;
        }
        return (int) result;
    }
}