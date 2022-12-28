import edu.umd.cs.findbugs.annotations.SuppressFBWarnings;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStreamReader;

public class Main {
    @SuppressFBWarnings("DM_DEFAULT_ENCODING")
    public static void main(String args[]) {
        HashingOpenAdd H = new HashingOpenAdd(35000);
        try {
            FileInputStream fstream = new FileInputStream("C:\\Users\\Hp\\Downloads\\Dictionary.csv");
            DataInputStream in = new DataInputStream(fstream);
            BufferedReader br = new BufferedReader(new
                    InputStreamReader(in));
            String strLine;
            while ((strLine = br.readLine()) != null) {
                String[] word = strLine.split(",");
                H.insert(word[0]);
            }
            in.close();
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
        
    }
}

