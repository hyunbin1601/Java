import java.util.Scanner;

public class baekjoon5 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int n = kbd.nextInt();
        int k = n/4;
        for(int i=0; i<k; i++) {
            System.out.print("long ");
        }
        System.out.print("int");
    }
}
