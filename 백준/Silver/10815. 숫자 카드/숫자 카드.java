import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static final Integer MAX = 10000000;
    static int[] table = new int[20000001];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder builder = new StringBuilder();

        br.readLine(); // 제거
        Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .forEach((item) -> {
                    table[item + MAX] = 1;
                });

        br.readLine(); // 제거
        Arrays.stream(br.readLine().split(" "))
                .map(Integer::parseInt)
                .forEach(item -> {
                    builder.append(String.valueOf(table[item + MAX]) );
                    builder.append(" ");
                });
        System.out.println(builder.toString().trim());
    }
}
