
class selectionSort {
    
    static void selectionsort(int arr[], int n) {
        for(int i=0;i<n;i++) {
            int min = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[min]) {
                    min = j;
                }
            }
            if(min != i) {
                int temp = arr[min];
                arr[min] = arr[i] ;
                arr[i] = temp;
            }
        }
    }
    public static void main(String[] args) {
      int arr[] = {7,4,10,8,3,1};
      int n = arr.length;
      selectionsort(arr,n);
      for(int i=0;i<n;i++) {
          System.out.print(arr[i]+" ");
      }
      
    }
}