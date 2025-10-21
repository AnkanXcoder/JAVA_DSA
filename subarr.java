public class subarr {
    public static void sub(int numbers[]){
        int ts = 0;
        int sumMax = Integer.MIN_VALUE;
        int sumMin = Integer.MAX_VALUE;
        for(int i = 0 ; i< numbers.length; i++){
            int start = i;
            for (int j = i; j < numbers.length; j++){
              int end = j;
              int sum = 0;
              for (int k = start; k <= end; k++){
                System.out.print(numbers[k] + " ");
                sum += numbers[k];

            }
            ts++;

            if(sum > sumMax){
             sumMax = sum;
            }
            if(sum < sumMin){
                sumMin = sum;
            }
            System.out.println("sum is "+sum);
            System.out.println();
            }
            
            System.out.println();
        }
        System.out.println("total sub array is " + ts);
        System.out.println("Maximum of sum of the subarray is " + sumMax);
        System.out.println("Minimum of sum of the subarray is " + sumMin);
    }

    public static void main(String[] args) {
        int numbers[] = { 1, 2, 3 , 4, 5};
        sub(numbers);

    }
    
}
