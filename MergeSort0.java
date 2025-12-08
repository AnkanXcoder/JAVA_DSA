

class  MergeSort0 {

    static void merge(int[] arr, int lb, int mid, int ub) {
        int i = lb;
        int j = mid + 1;
        int k = lb;

        // temp array same size as original array
        int[] b = new int[arr.length];

        while (i <= mid && j <= ub) {
            if (arr[i] <= arr[j]) {
                b[k] = arr[i];
                i++;
            } else {
                b[k] = arr[j];
                j++;
            }
            k++;
        }

        if (i > mid) {
            while (j <= ub) {
                b[k] = arr[j];
                j++;
                k++;
            }
        } else {
            while (i <= mid) {
                b[k] = arr[i];
                i++;
                k++;
            }
        }

        for (int x = lb; x <= ub; x++) {
            arr[x] = b[x];
        }
    }

    static void mergeSort(int[] arr, int lb, int ub) {
        if (lb < ub) {
            int mid = (lb + ub) / 2;
            mergeSort(arr, lb, mid);
            mergeSort(arr, mid + 1, ub);
            merge(arr, lb, mid, ub);
        }
    }

    public static void main(String[] args) {
        int[] arr = {15, 5, 24, 8, 1, 3, 16, 10, 20};
        int n = arr.length;

        mergeSort(arr, 0, n - 1);

        System.out.print("Sorted array: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
