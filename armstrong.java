public class armstrong {
    public static void main(String[] args) {

        int start = 100;
        int end = 1000;

        System.out.println("Armstrong numbers:");

        for (int num = start; num <= end; num++) {

            int original = num;
            int sum = 0;

            while (original > 0) {

                int digit = original % 10;

                sum = sum + digit * digit * digit;

                original = original / 10;
            }

            if (sum == num) {
                System.out.print(num + " ");
            }
        }
    }
}