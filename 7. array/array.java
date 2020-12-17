import java.util.Arrays;

public class array {
    public static void main(String[] args) {
        // 5位同学的成绩:
        // 数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；
        // 数组一旦创建后，大小就不可改变。
        int[] ns = new int[5];
        ns[0] = 68;
        ns[1] = 79;
        ns[2] = 91;
        ns[3] = 85;
        ns[4] = 62;
        // 可以用数组变量.length获取数组大小：
        System.out.println(ns.length); // 5

        // 也可以在定义数组时直接指定初始化的元素，这样就不必写出数组大小，而是由编译器自动推算数组大小。例如：
        int[] ns2 = new int[] { 68, 79, 91, 85, 62 };
        System.out.println(ns2.length); // 编译器自动推算数组大小为5

        // 还可以进一步简写为：
        int[] ns3 = { 68, 79, 91, 85, 62 };

        //遍历数组
        int[] ns4 = { 1, 4, 9, 16, 25 };
        for (int i=0; i<ns.length; i++) {
            int n = ns4[i];
            System.out.println(n);
        }
        //直接迭代元素
        int[] ns5 = { 1, 4, 9, 16, 25 };
        for (int n : ns5) {
            System.out.println(n);
        }
        //打印数组内容
        int[] ns6 = { 1, 1, 2, 3, 5, 8 };
        System.out.println(Arrays.toString(ns6));

        //冒泡排序
        int[] ns7 = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        // 排序前:
        System.out.println(Arrays.toString(ns7));
        for (int i = 0; i < ns7.length - 1; i++) {
            for (int j = 0; j < ns.length - i - 1; j++) {
                if (ns7[j] > ns7[j+1]) {
                    // 交换ns[j]和ns[j+1]:
                    int tmp = ns7[j];
                    ns7[j] = ns7[j+1];
                    ns7[j+1] = tmp;
                }
            }
        }
        // 排序后:
        System.out.println(Arrays.toString(ns7));

        //java自带排序
        int[] ns8 = { 28, 12, 89, 73, 65, 18, 96, 50, 8, 36 };
        Arrays.sort(ns8);
        System.out.println(Arrays.toString(ns8));

        //二维数组
        int[][] ns9 = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        System.out.println(ns9.length); // 3

        //打印一个二维数组
        int[][] ns10 = {
                { 1, 2, 3, 4 },
                { 5, 6, 7, 8 },
                { 9, 10, 11, 12 }
        };
        // deeptostring
        System.out.println(Arrays.deepToString(ns10));
    }
}
