public class Main {
    public static void remove_de(String[] args) {

        int[] arr = {10, 20, 10, 30, 20, 40};

        int[] newArr = new int[arr.length];
        int n = 0;

        for (int i = 0; i < arr.length; i++) {

            boolean duplicate = false;

            for (int j = 0; j < n; j++) {

                if (arr[i] == newArr[j]) {
                    duplicate = true;
                    break;
                }
            }

            if (!duplicate) {
                newArr[n] = arr[i];
                n++;
            }
        }

        System.out.println("Array after removing duplicates:");

        for (int i = 0; i < n; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}