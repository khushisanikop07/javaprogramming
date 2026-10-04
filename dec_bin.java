public class dec_bin {
    public static void main(String[] args) {

        int num = 25;

        int[] binary = new int[32];

        int i = 0;

        while (num > 0) {

            binary[i] = num % 2;

            num = num / 2;

            i++;
        }

        System.out.print("Binary: ");

        for (int j = i - 1; j >= 0; j--) {
            System.out.print(binary[j]);
        }
    }
}