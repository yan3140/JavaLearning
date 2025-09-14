package assignment;

import java.util.Scanner;
import java.util.stream.Stream;

public class field2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []a = stringToIntArray(sc.nextLine());
        int n =a[0];
        int m =a[2];
        int []c = new int [n];
        int []d = new int [n];
        for(int i=0;i<n;i++){
            int b[] = stringToIntArray(sc.nextLine());
            c[i]=b[0];
            d[i]=b[1];
        }
        for(int k =a[1];k>0;){
            k-=d[max(c)];
            if(k<0){
                break;
            }
            c[max(c)]--;
        }
       if(c[max(c)]<m){
           System.out.println(m);
       }else {
           System.out.println(c[max(c)]);
       }
    }
    public static int[] stringToIntArray(String input) {
        int[] arr = Stream.of(input
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
    }
    public static int max(int[] a) {
        int max =0;
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;

    }
}
