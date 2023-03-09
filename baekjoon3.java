import java.util.Scanner;

public class baekjoon3 {
    public static void main(String[] args) {
        System.out.println("윤년 출력");
        Scanner kbd = new Scanner(System.in);
        int year = kbd.nextInt();
        if(year % 4 == 0 && year % 100 != 0) {
            System.out.println(1);
        }
        else if(year % 400 ==0) {
            System.out.println(1);
        }
        else {
            System.out.println(0);
        }

    }
}
