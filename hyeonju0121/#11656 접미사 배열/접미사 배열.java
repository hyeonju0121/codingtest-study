import java.util.*;

public class Main {
    public static StringBuilder solution(String S) {
        StringBuilder sb = new StringBuilder();

        ArrayList<String> list = new ArrayList<>();

        for (int i = 0; i < S.length(); i++) {
            String temp = S.substring(i, S.length());
            list.add(temp);
        }
        Collections.sort(list);

        for (String word : list) {
            sb.append(word).append("\n");
        }
        return sb;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        System.out.println(solution(S));
    }
}
