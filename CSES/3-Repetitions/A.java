import java.util.Scanner;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str + "Z";
        int count = 1;
        int max_count = 1;

        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i + 1)) {
                count++;
            }

            else {
                max_count = Math.max(count, max_count);
                count = 1;
            }
        }

        System.out.println(max_count);
        sc.close();
    }
}