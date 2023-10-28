import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());

        ArrayList<String> result = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String string = br.readLine();
            int prev = -1;
            int now = string.length();
            while(prev != now) {
                prev = now;
                string = string.replaceAll("\\(\\)", "");
                now = string.length();
            }
            if(string.length() == 0) {
                result.add("YES");
            } else {
                result.add("NO");
            }
        }
        System.out.println(String.join("\n", result));
    }
}
