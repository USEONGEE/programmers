import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int num = Integer.parseInt(br.readLine().trim());
        ArrayList<Integer> req = new ArrayList<>();
        for (int i = 0; i < num; i++) req.add(Integer.parseInt(br.readLine().trim()));


        Integer targetNum = req.stream()
                .max(Integer::compareTo).get();
        int[] zeroList = new int[targetNum + 2];
        int[] oneList = new int[targetNum + 2];
        zeroList[0] = 1;
        oneList[1] = 1;

        for (int i = 2; i <= targetNum; i++) {
            zeroList[i] = zeroList[i - 1] + zeroList[i - 2];
            oneList[i] = oneList[i - 1] + oneList[i - 2];
        }

        req.stream()
                .forEach(i ->sb.append(zeroList[i]).append(" ").append(oneList[i]).append("\n"));
        System.out.println(sb.toString());

    }
}
