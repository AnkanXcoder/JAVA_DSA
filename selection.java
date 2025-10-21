public class selection {
    public static void selectionsort(int nums[]){
        for(int i = 0; i<nums.length-1;i++){
            int minPos = i;
            for(int j = i + 1; j<nums.length;j++){
                if(nums[minPos] > nums[j]){
                    minPos = j;
                }
            }
            int temp = nums[minPos];
            nums[minPos] = nums[i];
            nums[i] = temp; 
        }
    }

    public static void printarr(int nums[]){
        for(int i = 0; i<nums.length;i++){
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int nums[] = { 5,4,1,3,2};
        selectionsort(nums);
        printarr(nums);

    }
    
}
