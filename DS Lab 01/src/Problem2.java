import java.util.stream.IntStream;

public class Problem2 {

    public static int myfunc(int N) {
        SequentialSearch S = new SequentialSearch();

        int[] array = IntStream.range(0, N).toArray();

        int count = 0;

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {

                for (int k = 0; k < N; k++) {

                    count++;
                }
            }
        }

        //N complexity outside the nested loops
        for (int i = 0; i < N; i++) {
            count++;
        }

        for (int j = 0; j < N; j++) {


            count += S.binary_search(array, N, N - 1)[1]; //using the instance variable of Binary Search from Sequential Search Class
        }
        return count;
    }

    public static void main(String[] args) {

        for (int i = 10; i < 1001; i++) {

            System.out.println(myfunc(i));

        }
    }
}


