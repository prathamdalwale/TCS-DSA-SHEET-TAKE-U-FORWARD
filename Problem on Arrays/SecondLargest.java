/**
 * SecondLargest
 */
public class SecondLargest {
    static int second_largest(int arr[]) {
        int temp = arr[0];
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                j = i;
                arr[j] = arr[i];
            }
        }
        for (int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 9 };
        System.out.println(second_largest(arr));
    }
}