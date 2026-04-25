import java.util.*;

class Demo {
	public static void main(String[] args) {

        int[] arr = {50, 23, 9, 18, 61, 32};

        int n = arr.length - 1;

        f(arr, 0, n);

        System.out.println(Arrays.toString(arr));
}

    static void f(int[] arr, int low, int high) {

        if (low >= high) {
            return;
        }

        int mid = (low + high) / 2;

        f(arr, low, mid);
       

	 f(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    static void merge(int[] arr, int low, int mid, int high) {

        int[] merge = new int[high - low + 1];

        int blue = low;
        int green = mid + 1;
        int red = 0;

        while (blue <= mid && green <= high) {

            if (arr[blue] <= arr[green]) {
                merge[red] = arr[blue];
                red++;
                blue++;
            } else {
                merge[red] = arr[green];
                red++;
                green++;
            }
        }

        while (blue <= mid) {
            merge[red] = arr[blue];
            red++;
            blue++;
        }

        while (green <= high) {
            merge[red] = arr[green];
            red++;
            green++;
        }

        for (int i = 0; i < merge.length; i++) {
            arr[low + i] = merge[i];
        }
    }
}






/*
OUTPUT- [9, 18, 23, 32, 50, 61]
*/