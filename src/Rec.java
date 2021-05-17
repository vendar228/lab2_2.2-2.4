import java.util.Scanner;

public class Rec {
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
            System.out.println("Введите " + i + " элемент");
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
        System.out.println("n");
        int n = sc.nextInt();

        System.out.println( decToBin(n));
    }
}


