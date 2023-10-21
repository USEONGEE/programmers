import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arg = Arrays.stream(br.readLine().trim().split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        ArrayList<Integer> arrayList = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 1; i <= arg[0]; i++) {
            arrayList.add(i);
        }

        while (!arrayList.isEmpty()) {
            for (int i = 0; i < arg[1] - 1; i++) {
                arrayList.add(arrayList.remove(0));
            }
            result.add(arrayList.remove(0));
        }

        StringBuilder formattedString = new StringBuilder("<");
        for (int i = 0; i < result.size(); i++) {
            formattedString.append(result.get(i));
            if (i < result.size() - 1) {
                formattedString.append(", ");
            }
        }
        formattedString.append(">");

        System.out.println(formattedString.toString());
    }
}
