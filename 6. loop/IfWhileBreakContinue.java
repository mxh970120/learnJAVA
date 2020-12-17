import java.util.Scanner;

public class IfWhileBreakContinue {
    public static void main(String[] args) {
        // if
        int n = 70;
        if (n >= 90) {
            System.out.println("优秀");
        } else if (n >= 60) {
            System.out.println("及格了");
        } else {
            System.out.println("挂科了");
        }

        // 在Java中，判断值类型的变量是否相等，可以使用==运算符。
        // 但是，判断引用类型的变量是否相等，==表示“引用是否相等”，或者说，是否指向同一个对象。
        String s1 = "hello";
        String s2 = "HELLO".toLowerCase();
        System.out.println(s1);
        System.out.println(s2);
        if (s1 == s2) {
            System.out.println("s1 == s2");
        } else {
            System.out.println("s1 != s2");
        }

        // 要判断引用类型的变量内容是否相等，必须使用equals()方法：
        if (s1.equals(s2)) {
            System.out.println("s1 equals s2");
        } else {
            System.out.println("s1 not equals s2");
        }

        // switch
        int option = 1;
        switch (option) {
            case 1:
                System.out.println("Selected 1");
                break;
            case 2:
                System.out.println("Selected 2");
                break;
            case 3:
                System.out.println("Selected 3");
                break;
            default:
                System.out.println("Not selected");
                break;
        }

        // 新switch
        String fruit = "apple";
        switch (fruit) {
            case "apple" -> System.out.println("Selected apple");
            case "pear" -> System.out.println("Selected pear");
            case "mango" -> {
                System.out.println("Selected mango");
                System.out.println("Good choice!");
            }
            default -> System.out.println("No fruit selected");
        }

        // while
        int sum = 0; // 累加的和，初始化为0
        int n1 = 1;
        while (n1 <= 100) { // 循环条件是n <= 100
            sum = sum + n1; // 把n累加到sum中
            n1 ++; // n自身加1
        }
        System.out.println(sum); // 5050

        // do while
        int sum2 = 0;
        int n2 = 1;
        do {
            sum2 = sum2 + n2;
            n2 ++;
        } while (n2 <= 100);
        System.out.println(sum2);

        // for
        int sum3 = 0;
        for (int i=1; i<=100; i++) {
            sum3 = sum3 + i;
        }

        //break 在循环过程中，可以使用break语句跳出当前循环。
        int sum4 = 0;
        for (int i=1; ; i++) {
            sum4 = sum4 + i;
            if (i == 100) {
                break;
            }
        }

        //continue continue则是提前结束本次循环，直接继续执行下次循环。
        int sum5 = 0;
        for (int i=1; i<=10; i++) {
            System.out.println("begin i = " + i);
            if (i % 2 == 0) {
                continue; // continue语句会结束本次循环
            }
            sum5 = sum5 + i;
            System.out.println("end i = " + i);
        }
        System.out.println(sum5); // 25

        // 使用label（标号）跳出多重循环
        Scanner in = new Scanner(System.in);
		System.out.print("Input your number: "); // 打印提示
        int amount = in.nextInt();
        // 使用label（标号）跳出多重循环
        OUT:
        for (int one = 0; one <= amount; ++one) {
            for (int five = 0; five <= amount / 5; ++five) {
                for (int ten = 0; ten <= amount / 10; ++ten) {
                    for (int twenty = 0; twenty <= amount / 20; ++twenty) {
                        if (one + five * 5 + ten * 10 + twenty * 20 == amount) {
                            System.out.println(one + "张1元，" + five + "张5元，" + ten + "张10元，" + twenty + "张20元。");
                            break OUT;  //此break可以跳出整个多重循环
                        }
                    }
                }
            }
        }

    }
}
