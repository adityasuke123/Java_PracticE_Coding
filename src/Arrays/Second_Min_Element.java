package Arrays;

public class Second_Min_Element {
    public static void main(String [] args) {
        int [] arr = {1,2,3,4,4,56,5,6,56};

        int min = Integer.MIN_VALUE;
        int secondMin = Integer.MIN_VALUE;


        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i] < min) {
                min = arr[i];
            }
        }
        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i] < secondMin && arr[i] != min) {
                secondMin = arr[i];
            }
        }
        System.out.println(secondMin);
    }
}
