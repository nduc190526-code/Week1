public class bai110 {
    public int secondLargest(int[] arr){
        int max= Integer.MIN_VALUE;
        int second=Integer.MIN_VALUE;
        for(int i =0;i<arr.length;i++){
            if(arr[i]>max){
                second=max;
                max=arr[i];
            }else if(arr[i]>second&&arr[i]<max){
                second=arr[i];
            }
        }
        return second;
    }
    public static void main(String[] args){
        bai110 s=new bai110();
        int[][] tests = {
                {10, 5, 8, 20, 15},
                {10, 10, 8, 20, 20},
                {5},
                {7, 7, 7},
                {-1, -5, -2, -10},
                {Integer.MAX_VALUE, Integer.MIN_VALUE, 0}
        };
        for (int[] arr : tests) {
            System.out.print("Array: ");
            for (int x : arr) System.out.print(x + " ");
            System.out.println("\nSecond largest = " + s.secondLargest(arr));
            System.out.println();
        }
    }
}
