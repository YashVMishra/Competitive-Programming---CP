import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextInt();
        System.out.print(n + " ");
        while (true) {
            if (n == 1) {
                break;
            }

            else {
                if (n % 2 == 0) {
                    n = n / 2;
                    System.out.print(n + " ");
                }

                else {
                    n = (n * 3) + 1;
                    System.out.print(n + " ");
                }
            }
        }

        sc.close();
    }
}