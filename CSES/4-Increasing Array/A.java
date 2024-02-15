import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(moves(arr));
        sc.close();
    }

    public static long moves(int[] arr) {
        long minMoves = 0;

        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] >= arr[i + 1]) {
                int difference = arr[i] - arr[i + 1];
                minMoves = minMoves + (long) difference;
                arr[i + 1] = arr[i + 1] + difference;
            }
        }

        return minMoves;
    }
}