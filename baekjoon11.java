import java.util.Scanner;

public class baekjoon11 {
    public static void main(String[] args) {
        Scanner kbd = new Scanner(System.in);
        int i = kbd.nextInt();
        //삽입 알고리즘 문제네....컴알 복습한다 하고 해보자
        int a[] = new int[i]; //총 i개가 만들어짐
        for(int j=0; j<i; j++) {
            a[j] = kbd.nextInt(); //space도 인식함
        }
        int a_min =a[0];
        int a_max =a[0];
        for(int k=0; k<i; k++) {
            if(a_max <= a[k]) {
                a_max = a[k];
            }
            else {
                a_min = a[k];
            }
        }
        
        System.out.println(a_min + " " +  a_max);
    }
}
