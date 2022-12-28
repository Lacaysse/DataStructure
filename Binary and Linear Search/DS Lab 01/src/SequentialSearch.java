import java.util.stream.IntStream;

public class SequentialSearch {
    public static void main(String[] args) {

        long startTime = System.nanoTime();

        int[] array = IntStream.range(0, 5000).toArray();

        int N = array.length;

        int Num = 100;
        System.out.println(linear_search(array, N, N - 1)[1]);
        System.out.println(System.nanoTime() - startTime);


        startTime = System.nanoTime();

        System.out.println(binary_search(array, N, N - 1)[1]);
        System.out.println(System.nanoTime() - startTime);


    }

    public static int[] linear_search(int array[], int N, int Num) {


        int index = 0;
        int count = 0;

        while ((index < N) && (array[index] < Num)) {
            count++;
            index++;
        }

        if ((index < N) && (array[index] == Num)) {
            count++;
            return new int[]{index, count};
        } else return new int[]{-1, count};


    }


    public static int[] binary_search(int array[], int N, int Num) {

        int last = array.length - 1;
        int first = 0;
        int mid = first + last / 2;

        int count = 0;


        while (first < last) {

            count++;

            if (array[mid] > Num) {
                count++;
                first = mid + 1;
                mid = first + last / 2;

            } else if (array[mid] < Num) {
                count++;
                last = mid - 1;
                mid = first + last / 2;

            } else if (array[mid] == Num) {
                count++;
                return new int[]{mid, count};
            }

            mid = first + last / 2;

        }
        if (array[mid] == Num) return new int[]{mid, count};

        else return new int[]{-1, count};
    }
}


