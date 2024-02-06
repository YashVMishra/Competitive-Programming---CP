import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr = new int[size - 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }

        int[] check = new int[size - 1];
        for (int i = 0; i < check.length; i++) {
            check[i] = (i + 1);
        }
        cyclic_sort(arr);
        int i = 0;

        for (i = 0; i < arr.length; i++) {
            if (arr[i] != check[i]) {
                System.out.println(i + 1);
                break;
            }
        }

        if (i == arr.length) {
            System.out.println(i + 1);
        }

        sc.close();
    }

    public static void cyclic_sort(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            // if the number are from 1 to N otherwise if its from 0 to N then (correct
            // =arr[i])
            int correct = arr[i] - 1;
            if (correct < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
    }

    public static void swap(int[] arr, int i, int correct) {
        int temp = arr[i];
        arr[i] = arr[correct];
        arr[correct] = temp;
    }
}