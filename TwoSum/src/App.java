public class App {

    static int[] twoSum(int[] num, int target) { // [5,2,1,4] target = 6

        int index1 = 0, index2 = 0;
        for (int i = 0; i < num.length; i++) {

            for (int j = i + 1; j < num.length; j++) {

                if (num[i] + num[j] == target) {
                    index1 = i;
                    index2 = j;
                }

            }
        }

        int[] x = new int[] { index1, index2 };
        return x;
    }

    public static void main(String[] args) {

        int[] num = new int[] { 4, 2, 1, 0 };

        int[] sum = twoSum(num,6);
        System.out.println(sum[0] + "\n" + sum[1]);

    }
}
