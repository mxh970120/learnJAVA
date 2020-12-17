// 在Java中，我们使用package来解决名字冲突。
// Java定义了一种名字空间，称之为包：package。一个类总是属于某个包，类名（比如Person）只是一个简写，真正的完整类名是包名.类名。

package ming; // 申明包名ming

public class KeyWordPackage {
	public static void main(String[] args) {
        Person p = new Person();
        p.hello(); // 可以调用，因为Main和Person在同一个包
    }
}

public class Person {
    // 包作用域:
    void hello() {
        System.out.println("Hello!");
    }
}

// 在一个class中，我们总会引用其他的class

// 直接写出完整类名，例如：
// package ming;
// public class Person {
    // public void run() {
        // mr.jun.Arrays arrays = new mr.jun.Arrays();
    // }
// }

// 写简单类名
// 我们一般不推荐这种写法，因为在导入了多个包后，很难看出Arrays类属于哪个包
// import mr.jun.Arrays;
// import mr.jun.*;
// 如果有两个class名称相同，例如，mr.jun.Arrays和java.util.Arrays，那么只能import其中一个，另一个必须写完整类名

// 编写class的时候，编译器会自动帮我们做两个import动作：
// 默认自动import当前package的其他class；
// 默认自动import java.lang.*。
