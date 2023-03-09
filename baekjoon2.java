import java.util.Scanner;

public class baekjoon2 {
    public static void main(String[] args) {
        System.out.println("A와 B크기비교");
        Scanner kbd = new Scanner(System.in);
        int A = kbd.nextInt();
        int B = kbd.nextInt();
        if(A>B) {
            System.out.println(">");
        }
        else if(A<B) {
            System.out.println("<");
        }
        else if(A==B) {
            System.out.println("==");
        }
    }
}
