import java.lang.reflect.Array;
import java.util.Scanner;

public class baekjoon8 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
            int[] A;
            int[] B;
            A = new int[1000000];
            B = new int[1000000];
            int i = 0;
        while(true) {
            
            int a = kbd.nextInt(); //스페이스도 인식하는 듯 하다. nextInt와 next는 스페이스, 엔터 모두 인식하므로 주의하자. nextLine은 엔터만 인식!
            int b = kbd.nextInt();
            if(a == 0 && b == 0) {
                break; //while문을 탈출
            }
            A[i] = a; 
            B[i] = b;
            i++;
            
        }
        for(int j=0; j<i; j++) {
            System.out.println(A[j] + B[j]);
        }

    }
}
