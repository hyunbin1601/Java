//힙 정렬, 최대 힙
import java.util.Arrays;

public class HeapSortAlgorithm {
    public static void HeapSort(int[] arr) {
        for (int i = arr.length / 2 - 1; i >= 0; i--) { //2, 1, 0순으로 반복됨, 자식 노드를 가지는 부모 노드가 총 3개
            Heapify(arr, i, arr.length);   //int[] arr = {3, 5, 2, 7, 1, 4, 6} arr에서 받을 배열 값들
        } //크기는 총 7개

        for (int i = arr.length - 1; i > 0 ; i--) {  //끝과 root를 바꿔서 오름차순 정렬을 시작함.
            Swap(arr, 0, i); 
            Heapify(arr, 0, i);  //인덱스 배열은 0부터 시작하므로
        }
    }

    public static void Heapify(int[] arr, int parentIdx, int size) {
        int leftidx = 2 * parentIdx + 1;    // 왼쪽 노드 번호, 즉 인덱스 번호값을 의미한다.
        int rightidx = 2 * parentIdx + 2;   // 오른쪽 노드 번호
        int maxIdx = parentIdx; //첫 반복 -> root노드

        if ((leftidx < size) && (arr[maxIdx] < arr[leftidx])){ //index의 크기는 size 값을 벗어날 수 없다.
            maxIdx = leftidx;  
        }

        if ((rightidx < size) && (arr[maxIdx] < arr[rightidx])){
            maxIdx = rightidx; //아니면 건너뜀...
        }

        if (parentIdx != maxIdx){ //위 과정을 거치지 않았으면 실행되지 않는다.
            Swap(arr, maxIdx, parentIdx); //서로 자리가 바뀜
            Heapify(arr, maxIdx, size); //heapify 를 실행해서 정렬
        }
    }

    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j]; //temp를 이용해 서로 자리를 바꾼다.
        arr[j] = temp; //서로 자리를 바꿈 
    }
//temp라는 임시 저장소를 통해 두 개의 배열의 위치를 서로 바꾼다.
    public static void main(String[] args) {
        // Test code
        int[] arr = {3, 5, 2, 7, 1, 4, 6, 1}; //배열 생성, 힙 알고리즘을 통해 돌려봄
        HeapSort(arr);
        System.out.println("힙 정렬: " + Arrays.toString(arr)); //받은 배열의 값을 문자열로 차례대로 출력한다.
    }
}
