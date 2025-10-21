public class kadnessp {
            public static void kadnes(int numbers[]) {
            int ms = Integer.MIN_VALUE;
            int cs = 0;
    
            for (int i = 0; i < numbers.length; i++) {
                cs += numbers[i];

                if (cs > ms) {
                    ms = cs;
                }
    
                if (cs < 0) {
                    cs = 0;
                }
            }
    
            System.out.println("Maximum subarray sum is: " + ms);
        }
    
        public static void main(String[] args) {
            int numbers[] = { -2, -3, -4, -5 };
            kadnes(numbers); 
        }
    }
    

