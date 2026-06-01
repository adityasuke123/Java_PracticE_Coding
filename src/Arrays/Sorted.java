package Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Sorted {
    public static void main(String [] args) {
        int [] arr = {12,43,5,6,8,0,98,7,3,0};

        int temp = 0;

        for(int i = 0; i <= arr.length-1; i++) {
            for(int j = i+1; j <= arr.length-1; j++) {
                if(arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
