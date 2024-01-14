import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int caseNum = Integer.valueOf(br.readLine().trim());

        int[] floor = new int[caseNum];
        int[] roomNumber = new int[caseNum];
        for (int i = 0; i < caseNum; i++) {
            floor[i] = Integer.valueOf(br.readLine().trim());
            roomNumber[i] = Integer.valueOf(br.readLine().trim());
        }

        int[][] room = new int[15][15];
        for (int i = 1; i <= 14; i++) room[0][i] = i;


        int maxFloor = Arrays.stream(floor).max().getAsInt();
        int maxRoomNumber = Arrays.stream(roomNumber).max().getAsInt();

        for (int i = 1; i <= maxFloor; i++) {
            for (int j = 1; j <= maxRoomNumber; j++) {
                for (int k = 1; k <= j; k++) room[i][j] += room[i - 1][k];
            }
        }

        for (int i = 0; i < caseNum; i++) sb.append(room[floor[i]][roomNumber[i]] + "\n");
        System.out.println(sb.toString().trim());
    }
}
