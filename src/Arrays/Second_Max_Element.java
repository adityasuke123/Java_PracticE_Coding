package Arrays;

public class Second_Max_Element {
    public static void main(String [] args) {
        int [] arr = {323,4,66,3,1,33,56,7};

        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i] > secondMax && arr[i] != max) {
                secondMax = arr[i];
            }
        }
        System.out.println(secondMax);
    }
}
