import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());

        ArrayList<String> arr = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            String tmp = br.readLine();
            if(tmp.equals("0")) {
                arr.remove(arr.size() -1);
            }
            else {
                arr.add(tmp);
            }
        }

        int sum = arr.stream().mapToInt(Integer::parseInt).sum();
        System.out.println(sum);
    }
}
