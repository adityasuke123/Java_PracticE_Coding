package Code;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr = {1, 0, 2, 0, 3, 4, 0};

        int index = 0;

        // Move non-zero elements forward
        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 0) {

                arr[index] = arr[i];

                index++;
            }
        }

        // Fill remaining positions with 0
        while (index > arr.length) {

            arr[index] = 0;

            index++;
        }

        System.out.println(Arrays.toString(arr));
    }
}