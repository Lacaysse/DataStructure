public class RecursionMax {
    static int count = 0;

    public static void main(String[] args) {


        int[] arr = {56, 21, 53, 23, 69, 78, 95, 2, 12, 14, 55, 99, 67, 102, 113, 114, 117, 2, 5};
        int N = arr.length;

        System.out.println(FindMax(arr, N));
        System.out.println(count);

        //System.out.println(FindMax2(arr, N, 0));

    }

    //Non-Tail Method
    public static int FindMax(int[] arr, int N) {


        if (N == 1) return arr[0];

        else {
            count++;
            return Math.max(arr[N - 1], FindMax(arr, N - 1));
        }
    }

    //Tail Method
    public static int FindMax2(int[] arr, int N, int max) {

        if (N < 1) return max;

        else {
            if (arr[N] > max) max = arr[N];
            return FindMax2(arr, N - 1, max);
        }
    }
}
