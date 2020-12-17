public class variable {
        public static void main(String[] args) {
			/*
			二进制	
				由0,1组成。以0b开头
			八进制	
				由0,1,…7组成。以0开头
			十进制	
				由0,1,…9组成。整数默认是十进制的
			十六进制    
				由0,1,…9,a,b,c,d,e,f(大小写均可)。以0x开头

			*/
			System.out.println(0b100);//4
			System.out.println(0100);//64
			System.out.println(100);//100
			System.out.println(0x100);//256
			
			// 变量基础
            int n = 100; // 定义变量n，同时赋值为100
            System.out.println("n = " + n); // 打印n的值

            n = 200; // 变量n赋值为200
            System.out.println("n = " + n); // 打印n的值

            int x = n; // 变量x赋值为n（n的值为200，因此赋值后x的值也是200）
            System.out.println("x = " + x); // 打印x的值

            x = x + 100; // 变量x赋值为x+100（x的值为200，因此赋值后x的值是200+100=300）
            System.out.println("x = " + x); // 打印x的值
            System.out.println("n = " + n); // 再次打印n的值

            /*  整数类型：byte，short，int，long
                浮点数类型：float，double
                字符类型：char
                布尔类型：boolean
            */
            //整型
            /*byte：-128 ~ 127
              short: -32768 ~ 32767
              int: -2147483648 ~ 2147483647
              long: -9223372036854775808 ~ 9223372036854775807*/
            int i = 2147483647;
            int i2 = -2147483648;
            int i3 = 2_000_000_000; // 加下划线更容易识别
            int i4 = 0xff0000; // 十六进制表示的16711680
            int i5 = 0b1000000000; // 二进制表示的512
            long l = 9000000000000000000L; // long型的结尾需要加L

            //浮点数
			//由于计算机中保存的小数其实是十进制的小数的近似值，并不是准确值，所以，千万不要在代码中使用浮点数来表示金额等重要的指标。
			//建议使用BigDecimal或者Long（单位为分）来表示金额。
            float f1 = 3.14f;
            float f2 = 3.14e38f; // 科学计数法表示的3.14x10^38
			//单精度浮点数在计算机存储器中占用4个字节（32 bits），利用“浮点”（浮动小数点）的方法，可以表示一个范围很大的数值。
			//比起单精度浮点数，双精度浮点数(double)使用 64 位（8字节） 来存储一个浮点数。
            double d = 1.79e308;
            double d2 = -1.79e308;
            double d3 = 4.9e-324; // 科学计数法表示的4.9x10^-324

            //布尔值
            boolean b1 = true;
            boolean b2 = false;

            //字符串
            char a = 'A';
            char zh = '中';
            System.out.println(a);
            System.out.println(zh);

            //引用类型（字符串）
            String s = "hello";

            //常量，加final，不可二次赋值
            final double PI = 3.14; // PI是一个常量

            //var 定义变量
            var sb = new StringBuilder();
        }
}
