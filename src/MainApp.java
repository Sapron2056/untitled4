public class MainApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        //1 задание
        System.out.println(check(6, 8));
        System.out.println(check(3, 1));
        //2 задание
        positiveOrNegative(7);
        positiveOrNegative(-5);
        //3 задание
        System.out.println(three(6));
        System.out.println(three(-7));
        //4 задание
        printSmile("Smile",3);
    }

    public static boolean check(int a, int b) {
        int s = a + b;
        return (10 <= s) && (s <= 20);
    }

    public static void positiveOrNegative(int n) {
        if (n >= 0) {
            System.out.println("Положительное");
        } else {
            System.out.println("Отрицательное");
        }
    }

    static boolean three(int a) {
        return a > 0;


    }

    public static void printSmile(String Smile, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println("Smile");
        }
    }
}