import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        int num = Integer.parseInt(br.readLine().trim());

        for (int i = 0; i < num; i++) {
            int[] input = Arrays.stream(br.readLine().trim().split(" "))
                    .mapToInt(Integer::parseInt)
                    .toArray();
            System.out.println((int)cal(input[0], input[1]));
        }
    }

    static double cal(int n, int m) {
        int c = m - n;
        double result = 1;

        if (c > n) {
            for (int i = c + 1; i <= m; i++) result *= i;
            for (int i = 1; i <= n; i++) result /= i;
        } else {
            for (int i = n + 1; i <= m; i++) result *= i;
            for (int i = 1; i <= c; i++) result /= i;
        }
        return result;
    }
}
