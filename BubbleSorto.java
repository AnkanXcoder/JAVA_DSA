public class BubbleSorto {
    
    static void bubbleSort(int arr[], int n) {
        for(int i=0;i<n-1;i++) {
            int flag = 0;
            for(int j=0;j<n-1-i;j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    flag = 1;
                }
            }
            if(flag == 0) {
                break;
            }
        }
    }
    public static void main(String[] args) {
      int arr[] = {7,4,10,8,3,1};
      int n = arr.length;
      bubbleSort(arr,n);
      for(int i=0;i<n;i++) {
          System.out.print(arr[i]+" ");
      }
      
    }
}