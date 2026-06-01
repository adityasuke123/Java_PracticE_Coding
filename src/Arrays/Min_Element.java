package Arrays;

public class Min_Element {
    public static void main(String [] args) {
        int [] arr = {1,33,56,8,5,5,2,4,67};
        int min = arr[0];

        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
