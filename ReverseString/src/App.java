public class App {

    static String reverseString(String string) {

        String reverse = "";
        int index = 0;
        int length = string.length();
        char[] letters = new char[length];

        for (int i = length - 1; i >= 0; i--) {

            letters[index] = string.charAt(i);
            index++;
        }

        for (char x : letters) {
            reverse += x;
        }

        return reverse;
    }

    public static void main(String[] args) {

        String x = "god";
        String reverse = reverseString(x);

        System.out.println(reverse);

    }
}
