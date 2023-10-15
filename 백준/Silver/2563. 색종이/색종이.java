import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static final int LENGTH = 10;

    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[][] matrix = new int[100][100]; // 자동으로 0으로 초기화됨
        for (int i = 0; i < num; i++) {
            int[] array = Arrays.stream(br.readLine().split(" ")) // 행, 렬
                    .mapToInt(Integer::parseInt)
                    .toArray();
            for (int j = array[0]; j < array[0] + LENGTH; j++) {
                for (int k = array[1]; k < array[1] + LENGTH; k++) {
                    matrix[j][k] = 1;
                }
            }
        }

        int sum = 0;
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 100; j++) {
                sum += matrix[i][j];
            }
        }
        System.out.println(sum);
    }
}

