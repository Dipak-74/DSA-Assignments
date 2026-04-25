import java.util.*;

class Demo {
    public static void main(String[] args) {

        int[] arr = {75, 85, 55, 95, 65};

        int n = arr.length;

        f(arr, 0, n - 1);

        System.out.println(Arrays.toString(arr));
    }

    static void f(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int pivot = pivotfinder(arr, low, high);

        f(arr, low, pivot - 1);
        f(arr, pivot + 1, high);
    }

    static int pivotfinder(int[] arr, int low, int high) {

        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {

            while (i <= high && arr[i] <= pivot) {
                i++;
            }

            while (j >= low && arr[j] > pivot) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}




/*

OUTPUT-[55, 65, 75, 85, 95]

*/