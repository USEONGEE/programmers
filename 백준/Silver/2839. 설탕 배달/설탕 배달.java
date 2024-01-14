import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(bufferedReader.readLine().trim());

        int min = 0;
        int max = 0;

        int[] arr = new int[10000];

        int count = 0;
        while (arr[num] == 0 && min < num) {
            for (int i = min; i <= max; i++) {
                if (arr[i] == count) {
                    arr[i + 3] = count + 1;
                    arr[i + 5] = count + 1;
                }
            }
            min += 3;
            max += 5;
            count++;
        }
        int result = arr[num] == 0 ? -1 : count;
        System.out.println(String.valueOf(result));
    }
}
