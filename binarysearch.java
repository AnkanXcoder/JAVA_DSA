public class binarysearch {
    public static int binarySearch(int numbers[] , int key){
        int start = 0 , end = numbers.length-1;
        while(start<=end){
           int mid = (start + end)/2;
            if(numbers[mid] == key){
                return mid+1;
            }
            if(numbers[mid] < key){
                start = mid;

            }
            else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = {1,78,99,4407,6333,11000,100000};
        int key = 4407;

        System.out.println("index for key is " + binarySearch(numbers, key));
    }
    
}
