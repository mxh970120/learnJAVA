public class character {
    public static void main(String[] args) {

        // 字符类型char是基本数据类型，它是character的缩写。一个char保存一个Unicode字符：
        char c1 = 'A';
        char c2 = '中';
        // 因为Java在内存中总是使用Unicode表示字符，所以，一个英文字符和一个中文字符都用一个char类型表示，它们都占用两个字节。

        // 要显示一个字符的Unicode编码，只需将char类型直接赋值给int类型即可：
        int n1 = 'A'; // 字母“A”的Unicodde编码是65
        int n2 = '中'; // 汉字“中”的Unicode编码是20013

        // 还可以直接用转义字符“\ u” + Unicode编码来表示一个字符：
        // 注意是十六进制:
        char c3 = '\u0041'; // 'A'，因为十六进制0041 = 十进制65
        char c4 = '\u4e2d'; // '中'，因为十六进制4e2d = 十进制20013


        // 和char类型不同，字符串类型String是引用类型，我们用双引号"..."表示字符串。一个字符串可以存储0个到任意个字符：
        String s = ""; // 空字符串，包含0个字符
        String s1 = "A"; // 包含一个字符
        String s2 = "ABC"; // 包含3个字符
        String s3 = "中文 ABC"; // 包含6个字符，其中有一个空格
        // 因为字符串使用双引号"..."表示开始和结束，那如果字符串本身恰好包含一个"字符怎么表示？例如，"abc"xyz"，
        // 编译器就无法判断中间的引号究竟是字符串的一部分还是表示字符串结束。这个时候，我们需要借助转义字符\：
        String s4 = "abc\"xyz"; // 包含7个字符: a, b, c, ", x, y, z
        // 因为\是转义字符，所以，两个\\表示一个\字符：
        String s5 = "abc\\xyz"; // 包含7个字符: a, b, c, \, x, y, z
        /*        常见的转义字符包括：
        \" 表示字符"
        \' 表示字符'
        \\ 表示字符\
        \n 表示换行符
        \r 表示回车符
        \t 表示Tab
        \ u#### 表示一个Unicode编码的字符 */
        String s6 = "ABC\n\u4e2d\u6587"; // 包含6个字符: A, B, C, 换行符, 中, 文

        // 字符串连接
        String s7 = "Hello";
        String s8 = "world";
        String s9 = s7 + " " + s8 + "!";
        System.out.println(s9);
        // 如果用+连接字符串和其他数据类型，会将其他数据类型先自动转型为字符串，再连接：
        int age = 25;
        String s10 = "age is " + age;
        System.out.println(s10);
        // 多行字符串
        String s11 = """
                   SELECT * FROM
                     users
                   WHERE id > 100
                   ORDER BY name DESC
                   """;
        System.out.println(s11);

        // 空值
        String s12 = null; // s1是null

    }
}
