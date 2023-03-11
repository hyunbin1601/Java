import java.util.Scanner;

public class baekjoon4 {
    public static void main(String[] args) {
        System.out.println("n은 1부터 10000까지");
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int sum =0;
        for(int i=1; i<=n; i++) {
            sum +=i;

        }
        System.out.println(sum);
    }
}
