package Arrays;

public class Moved_zero_End {
    public static void main(String [] args) {
        int [] arr = {1,2,4,43,0,8,75,0,8,85,0,9,8657};

        int index = 0;

        for(int i = 0; i <= arr.length-1; i++) {
            if(arr[i] == 0) {
                arr[index] = arr[i];
            }
        }
        System.out.println(index);
    }
}
