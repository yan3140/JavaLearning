package comn;

import java.util.stream.Stream;

public class test {
    public static void main(String[] args) {
        testForEachOrdered();

    }

    public  static void testForEachOrdered() {
        Stream.of(1,5,-9,0,-5,2,5,8).parallel().forEach(System.out::print);
        System.out.println("===================================================");
        // 在并行遍历时，forEachOrdered将顺序遍历元素
        Stream.of(1,5,-9,0,-5,2,5,8).parallel().forEachOrdered(System.out::print);
    }
}
