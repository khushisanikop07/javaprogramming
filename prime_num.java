public class prime_num {
    public static void main(String[] args) {

        int start = 10;
        int end = 50;

        int count = 0;

        System.out.println("Prime numbers:");

        for (int num = start; num <= end; num++) {

            int factors = 0;

            for (int i = 1; i <= num; i++) {

                if (num % i == 0) {
                    factors++;
                }
            }

            if (factors == 2) {
                System.out.print(num + " ");
                count++;
            }
        }

        System.out.println();
        System.out.println("Count: " + count);
    }
}