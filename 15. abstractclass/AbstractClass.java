// 由于多态的存在，每个子类都可以覆写父类的方法
public class AbstractClass {
    public static void main(String[] args) {
        Person p = new Student();
        p.run();
    }
}

// 把一个方法声明为abstract，表示它是一个抽象方法，本身没有实现任何方法语句。
// 因为这个抽象方法本身是无法执行的，所以，Person类也无法被实例化。
// 编译器会告诉我们，无法编译Person类，因为它包含抽象方法。
abstract class Person {
	// 定义方法的时候，必须实现方法的语句
	// 如果父类的方法本身不需要实现任何功能，仅仅是为了定义方法签名，目的是让子类去覆写它，那么，可以把父类的方法声明为抽象方法
	// 关键字 abstract
    public abstract void run();
}

// 因为抽象类本身被设计成只能用于被继承，因此，抽象类可以强迫子类实现其定义的抽象方法，否则编译会报错。
// 因此，抽象方法实际上相当于定义了“规范”
class Student extends Person {
    @Override
    public void run() {
        System.out.println("Student.run");
    }
}