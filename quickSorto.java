public class QuickSort {

    static int partition(int[] arr, int lb, int ub) {
        int pivot = arr[lb];
        int start = lb;
        int end = ub;

        while (start < end) {
            while (start <= ub && arr[start] <= pivot) {
                start++;
            }
            while (end >= lb && arr[end] > pivot) {
                end--;
            }
            if (start < end) {
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
            }
        }

        int temp = arr[lb];
        arr[lb] = arr[end];
        arr[end] = temp;

        return end;
    }

    static void quickSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int loc = partition(arr, lb, ub);
            quickSort(arr, lb, loc - 1);
            quickSort(arr, loc + 1, ub);
        }
    }

    public static void main(String[] args) {
        int[] arr = {7, 6, 10, 5, 9, 2, 1, 15, 7};
        int n = arr.length;

        quickSort(arr, 0, n - 1);

        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
