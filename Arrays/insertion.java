import java.util.Arrays;
public class insertion {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50};
        int newelement = 25;
        int index = 2;

        arr = Arrays.copyOf(arr, arr.length + 1);

        for (int i = arr.length - 1; i > index; i--) {
            arr[i] = arr[i - 1];
        }

        arr[index] = newelement;

        System.out.println(Arrays.toString(arr));
    }
}