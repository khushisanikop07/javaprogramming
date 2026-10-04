public class move_zeros {
    public static void main(String[] args) {

        int[] arr = {0, 5, 0, 3, 8, 0, 2};

        int j = 0;

        // Put all non-zero elements at the beginning
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] != 0) {
                arr[j] = arr[i];
                j++;
            }
        }

        // Put zeros in the remaining positions
        while (j < arr.length) {
            arr[j] = 0;
            j++;
        }

        // Print array
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}