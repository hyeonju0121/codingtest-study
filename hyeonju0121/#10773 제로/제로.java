import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static int solution(int[] arr) {
        int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for (int i : arr) {
            if (i == 0) {
                int temp = stack.peek();
                stack.pop();
                answer -= temp;
            } else {
                stack.push(i);
                answer += i;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        int[] arr = new int[k];
        for (int i = 0; i < k; i++) {
            arr[i] = sc.nextInt();
        }

        // 정수가 0일 경우에 가창 최근에 쓴 수를 지우기
        // 아닐 경우 해당 수를 쓰기
        System.out.println(solution(arr));
    }
}
