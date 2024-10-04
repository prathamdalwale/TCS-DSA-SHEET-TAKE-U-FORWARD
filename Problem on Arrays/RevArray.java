public class RevArray {
    static void reverse_array(int arr[]) {
        int arr1[] = new int[5];
        for (int i = 0; i < arr.length; i++) {
            arr1[i] = arr[arr.length - i - 1];
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr1[i]);
        }

    }

    public static void main(String[] args) {

        int arr[] = { 5, 4, 3, 2, 1 };
        reverse_array(arr);

    }
}
