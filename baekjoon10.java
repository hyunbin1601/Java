import java.util.Scanner;

public class baekjoon10 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int a;
        int b;
        
        System.out.println("숫자를 입력하시오");
        while(kbd.hasNextInt()) {
            a = kbd.nextInt();
            b = kbd.nextInt();
            System.out.println(a + b);

        }
        kbd.close();
        
    }
}
