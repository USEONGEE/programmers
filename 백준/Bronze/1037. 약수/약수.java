import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine().trim());
        int[] array = Arrays.stream(br.readLine().trim().split(" "))
                .mapToInt(Integer::parseInt)
                .sorted()
                .toArray();
        int result;
        if (num != 1) {
            result = num % 2 == 1 ? array[num / 2] * array[num / 2] : array[num / 2] * array[num / 2 - 1];
        } else {
            result = array[0] * array[0];
        }
        System.out.println(result);
    }
}
