
public class App {

    public static void main(String[] args) {

        int list[] = primeList(5, 23);

        reverse(list);
        show(list);

    }

    static boolean isPrime(int num) {

        int start = 2;
        boolean prime = true;

        while (start <= (num / 2)) {

            if (num % start == 0) {
                prime = false;

                break;
            }
            start++;
        }

        return prime;

    }

    static int countPrimes(int num1, int num2) {

        int count = 0;

        for (int i = num1; i <= num2; i++) {

            if (isPrime(i)) {
                count++;
            }
        }
        return count;
    }

    static int[] primeList(int num1, int num2) {

        int limite = countPrimes(num1, num2);

        int primes[] = new int[limite];

        int index = 0;
        for (int i = num1; i <= num2; i++) {
            if (isPrime(i)) {
                primes[index] = i;
                index++;
            }

        }

        return primes;
    }

    static void reverse(int array[]) {

        int limite = array.length;

        int temp[] = new int[limite];
        int index = limite - 1;

        for (int i = 0; i < limite; i++) {
            temp[i] = array[index];

            index--;
        }

        index = 0;
        for (int i : temp) {
            array[index] = i;
            index++;
        }
    }

    static void show(int array[]) {

        for (int i : array) {
            System.out.println(i);
        }
    }

}
