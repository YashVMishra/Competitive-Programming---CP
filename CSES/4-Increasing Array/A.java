import java.util.Scanner;
//import java.util.Arrays;
class A {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        double[] arr = new double[size];
        
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextDouble();
        }
        //double [] arr = {1000000000 ,1 ,1 ,1, 1, 1, 1, 1, 1, 1};
        System.out.println(moves(arr));
        //System.out.println(Arrays.toString(arr));
        sc.close();
    }

    public static long moves(double [] arr){
        long min_moves=0;

        for(int i=0;i<arr.length-1;i++){
            if(arr[i]<=arr[i+1]){
                ;
            }

            else {
                double difference=arr[i]-arr[i+1];
                min_moves = min_moves + (long)difference;
                arr[i+1]=arr[i+1]+difference;
            }
        }

        return min_moves;
    }
}