public class App {

    static int reverseInteger(int num) {
        int reverse = 0;

        while (num != 0) {
            reverse = (reverse * 10) + (num % 10);
            num /= 10;
        }
        return reverse;
    }

    public static void main(String[] args) {
        int num = 54321;
        int reverse = reverseInteger(num);
        System.out.println(reverse);

    }
}
