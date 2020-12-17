public class intCaculate {
    public static void main(String[] args) {
        int i = (100 + 200) * (99 - 88); // 3300
        int n = 7 * (5 + (i - 9)); // 23072
        System.out.println(i);
        System.out.println(n);

        //溢出
        int x = 2147483640;
        int y = 15;
        int sum = x + y;
        // 整数由于存在范围限制，如果计算结果超出了范围，就会产生溢出，而溢出不会出错，却会得到一个奇怪的结果
        System.out.println(sum); // 输出为-2147483641
        long x2 = 2147483640;
        long y2 = 15;
        long sum2 = x2 + y2;
        System.out.println(sum2); // 2147483655

        //自增
        int n2 = 3300;
        n2++; // 3301, 相当于 n = n + 1;
        n2--; // 3300, 相当于 n = n - 1;
        int y3 = 100 + (++n2); // 不要这么写
        System.out.println(y3);

        //移位
        //对byte和short类型进行移位时，会首先转换为int再进行位移。
        //仔细观察可发现，左移实际上就是不断地×2，右移实际上就是不断地÷2
        int n3 = 7;       // 00000000 00000000 00000000 00000111 = 7
        int a = n3 << 1;  // 00000000 00000000 00000000 00001110 = 14
        int b = n3 << 2;  // 00000000 00000000 00000000 00011100 = 28
        int c = n3 << 28; // 01110000 00000000 00000000 00000000 = 1879048192
        // 左移29位时，由于最高位变成1，因此结果变成了负数
        int d = n3 << 29; // 11100000 00000000 00000000 00000000 = -536870912
        // 如果对一个负数进行右移，最高位的1不动，结果仍然是一个负数：
        int n4 = -536870912;
        int a2 = n4 >> 1;  // 11110000 00000000 00000000 00000000 = -268435456
        int b2 = n4 >> 2;  // 11111000 00000000 00000000 00000000 = -134217728
        int c2 = n4 >> 28; // 11111111 11111111 11111111 11111110 = -2
        int d2 = n4 >> 29; // 11111111 11111111 11111111 11111111 = -1
        // 无符号的右移运算，使用>>>，它的特点是不管符号位，右移后高位总是补0，因此，对一个负数进行>>>右移，它会变成正数，原因是最高位的1变成了0
        int n5 = -536870912;
        int a3 = n >>> 1;  // 01110000 00000000 00000000 00000000 = 1879048192
        int b3 = n >>> 2;  // 00111000 00000000 00000000 00000000 = 939524096
        int c3 = n >>> 29; // 00000000 00000000 00000000 00000111 = 7
        int d3 = n >>> 31; // 00000000 00000000 00000000 00000001 = 1

		/*
		&&和&的区别? 前者有短路效果，只要左边是false，右边不执行。而后者，全部执行。
		||和|的区别? 前者有短路效果，只要左边是true，右边不执行。而后者，全部执行。
		*/
		//&:逻辑与	有false则false
		System.out.println(a>b & a>c); //false & false = false
		System.out.println(a>b & a<c); //false & true = false
		System.out.println(a<b & a>c); //true & false = false
		System.out.println(a<b & a<c); //true & true = true
		System.out.println("--------");

		//&&:
		System.out.println(a>b && a>c); //false && false = false
		System.out.println(a>b && a<c); //false && true = false
		System.out.println(a<b && a>c); //true && false = false
		System.out.println(a<b && a<c); //true && true = true
		System.out.println("--------");

		//|:逻辑或	有true则true
		System.out.println(a>b | a>c); //false | false = false
		System.out.println(a>b | a<c); //false | true = true
		System.out.println(a<b | a>c); //true | false = true
		System.out.println(a<b | a<c); //true | true = true
		System.out.println("--------");

		//||:
		System.out.println(a>b || a>c); //false || false = false
		System.out.println(a>b || a<c); //false || true = true
		System.out.println(a<b || a>c); //true || false = true
		System.out.println(a<b || a<c); //true || true = true
		System.out.println("--------");

        // 位运算 1 true 0 false
        // 与 &
        // 或 |
        // 非 ~0
        // 异或 ^
        // 对两个整数进行位运算，实际上就是按位对齐，然后依次对每一位进行运算。例如：
        int i6 = 167776589; // 00001010 00000000 00010001 01001101
        int n6 = 167776512; // 00001010 00000000 00010001 00000000
        System.out.println(i6 & n6); // 167776512

        // 类型自动提升与强制转型
        short s = 1234;
        int i7 = 123456;
        int x7 = s + i7; // s自动转型为int
        // short y7 = s + i7; // 编译错误!
		
        // 强制转型使用(类型)
        int i8 = 1234;
        short s2 = (short) i8; // 12345

        // 1+……+100
        int k = 100;
        int sumk = (k+1)*k/2;
        System.out.println(sumk);
        System.out.println(sumk == 5050 ? "测试通过" : "测试失败");
		
		/*
		三元运算符：
		格式
			(关系表达式)?表达式1：表达式2；

		执行流程：
			计算关系表达式，看其返回值
				true:表达式1就是整个表达式的值
				false:表达式2就是整个表达式的值

		*/
		//获取两个数据中的较大值
		int x8 = 3;
		int y8 = 4;
		int z8 = (x8 > y8)? x8 : y8;
		System.out.println(z8);

		//比较两个数是否相等
		int a5 = 4;
		int b5 = 4;
		//boolean flag = (a==b)?true:false;
		boolean flag = (a5 == b5);
		System.out.println(flag);

		//获取三个数据中的较大值
		int c5 = 30;
		int d5 = 40;
		int e5 = 50;
		//int max = (c>d)?(c>e?c:e):(d>e?d:e);
		int temp = (c5>d5)?c5:d5;
		int max = (temp>e5)?temp:e5;
		System.out.println(max);




    }
}
