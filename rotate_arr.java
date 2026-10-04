public class rotate_arr {
    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        int k = 2;

        int n = arr.length;

        k = k % n;

        int[] temp = new int[n];

        // Put elements in their new positions
        for (int i = 0; i < n; i++) {
            temp[(i + k) % n] = arr[i];
        }

        // Copy temp back to arr
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }

        // Print array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}