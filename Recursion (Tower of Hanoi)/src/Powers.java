public class Powers {
    public static void main(String[] args) {

        int Power = Integer.parseInt(args[0]);
        int Base = Integer.parseInt(args[1]);

        System.out.println(Powers(Power, Base));


    }

    public static int Powers(int P, int B) {

        if (P == 0) return 1;

        else return (B * Powers(P - 1, B));

    }
}
