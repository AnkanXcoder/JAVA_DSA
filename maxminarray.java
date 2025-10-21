public class maxminarray {
    public static  int getlargest(int a[]) {
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
        if(largest < a[i]){
            largest = a[i];
        }
        if(smallest > a[i]){
            smallest = a[i];
        }
    }
    System.out.println("Smallest number is " + smallest);
    return largest;
}
   


    public static void main(String[] args) {
        int a[] = { 100, 45678, 78,11,10,4407,10092006};
        System.out.println("Largest value of this array is " + getlargest(a));

    }
    
}

