import java.util.Scanner;

public class Rec1 {
    public static String str = "";
    public static int[] arr;
    public static Scanner sc;

    public static String decToBin(int n) {
        if (n / 2 != 0) {
            decToBin(n / 2);
        }
        str = str.concat(Integer.toString(n % 2));
        return str;
    }

    public static void decToBinVoid(int n) {

        //n/2 - int
        if (n / 2 != 0) {
            decToBin(n / 2);
        }
        System.out.println(n % 2);
    }

    public static void fillArr(int i) {
        if (i < arr.length) {
            System.out.println("Введите элемент с индексом " + i);
            arr[i] = sc.nextInt();
            fillArr(++i);
        }
    }

    public static void printArr(int i) {
        if (i < arr.length) {
            System.out.println(arr[i]);
            printArr(++i);
        }
    }

    public static void main(String[] args) {
        sc = new Scanner(System.in);
        arr = new int[5];
        fillArr(0);
        printArr(0);
    }
}


