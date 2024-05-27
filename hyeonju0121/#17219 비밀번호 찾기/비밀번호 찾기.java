import java.io.*;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int n = Integer.parseInt(str[0]);
        int m = Integer.parseInt(str[1]);

        HashMap<String, String> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String[] addressPassword = br.readLine().split(" ");
            map.put(addressPassword[0], addressPassword[1]);
        }

        for (int i = 0; i < m; i++) {
            String address = br.readLine();
            bw.write(map.get(address));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
