public class LargestElement {
    static int largest_element(int arr[]) {
        int temp = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > temp) {
                temp = arr[i];
            }
        }
        return temp;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 5, 1, 3, 0 };
        System.out.println(largest_element(arr));
    }
}
