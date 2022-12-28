public class Hanoi {
    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);

        Tower(n, 'A', 'C', 'B');

    }

    public static void Tower(int n, char from, char to, char aux) {

        if (n > 0) {
            Tower(n - 1, from, aux, to);
            System.out.println(from + "-" + to);
            Tower(n - 1, aux, to, from);
        }
    }
}
