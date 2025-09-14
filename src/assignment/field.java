package assignment;
import java.util.stream.Stream;
import java.util.Scanner;
public class field {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        System.out.println("输入田地数量和大小以及坐标");
        int arr1[] = stringToIntArray(sc1.nextLine());
        int total = 0;
        for(int a = 0; a < arr1[0]; a++){
            int []arr2 = stringToIntArray(sc1.nextLine());
            int X1 = Math.max(arr2[0], 0);
            int Y1 = Math.max(arr2[1], 0);
            int X2 = Math.min(arr2[2], arr1[1]);
            int Y2 = Math.min(arr2[3], arr1[2]);
            int width = X2 - X1;
            int height = Y2 - Y1;
            if(width >= 0 && height >= 0){
                total += width * height;
            }
        }
        System.out.println("重叠的面积是："+total);
    }

    public static int[] stringToIntArray(String input) {
        int[] arr = Stream.of(input
                        .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        return arr;
    }
}
