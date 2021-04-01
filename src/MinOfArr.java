import java.util.Scanner;

public class MinOfArr {
    public static int[] creatArr() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập size của mảng:");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for (int i = 0; i< size; i++) {
            array[i] = (int) (Math.random()*100);
        }
        return array;
    }
    public static void printArr(int[] arr) {
        for (int i =0; i<arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
    public static void main(String[] args) {
        int[] arr = creatArr();
        printArr(arr);
        System.out.println();
        int min = arr[0];
        for (int i = 0; i<arr.length; i ++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }
}
