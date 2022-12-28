import java.text.MessageFormat;

public class HashingOpenAdd {

    String[] Table;
    int linearSteps;

    public HashingOpenAdd(int s) {      //constructor

        Table = new String[s + (s / 3)];
        linearSteps = 0;
    }

    public int strToInt(String v) {

        int sum = 0;
        char[] letters = v.toCharArray();

        for (char ch : letters) {
            sum += (int) ch;
        }
        return sum;
    }

    public int Hash(String str) {   //test the use of int sum here

        int linearIndex = strToInt(str) % Table.length;

        for (int i = 0; Table[linearIndex] != null && i < Table.length; i++) {
            linearIndex = Rehash(linearIndex, i);
        }

        return linearIndex;

    }

    public int Rehash(int sum, int i) {
        linearSteps++;
        return (sum + i) % Table.length;
    }

    public void insert(String v) {

        int indexes = Hash(v);

        Table[indexes] = v;
    }

    public boolean search(String v, String Type) {

        int indexes = findHash(v);

        if (Type.equals("linear")) {
            System.out.println(indexes);
            if (Table[indexes].equals(v)) {
                System.out.println("Found: " + v + ": Index: " + indexes);
                return true;
            } else {
                System.out.println("Not found");
            }
        }
        return false;
    }

    private int findHash(String str) {
        int linearIndex = strToInt(str) % Table.length;


        for (int i = 0; !Table[linearIndex].equals(str) && i < Table.length; i++) {
            linearIndex = Rehash(linearIndex, i);
        }


        return linearIndex;
    }

    public void displayTable(boolean nulls) {

        System.out.print("\n");
        System.out.print("[");

        for (int i = 0; i < Table.length; i++) {

            if (nulls && Table[i] == null) continue;
            MessageFormat message = new MessageFormat(", {0}");
            Object[] args = {
                    Table[i]
            };
            System.out.print(message.format(args));
        }
        System.out.print("]");
        System.out.print("\n");
    }
}
