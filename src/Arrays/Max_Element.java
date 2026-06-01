package Arrays;

public class Max_Element {
    public static void main(String [] args) {
        int [] arr = {1,24,54,22,578,5,2467,32};

        int max = arr[0];

        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);
    }
}
