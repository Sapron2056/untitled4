public class MainApp {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
    }

    public boolean check(int a, int b) {
        int s = a + b;
        return (10 <= s) && (s <= 20);
    }

    static void PositiveOrNegative(int num) {
        String word = "Положительное";
        if (num < 0) word = "Отрицательное";

        System.out.println(word);
    }

    static public void test()
    {
        System.out.println("test");
    }
}
