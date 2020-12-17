public class polymorph {
    public static void main(String[] args) {
        // 当使用多态方式调用方法时，首先检查父类中是否有该方法，如果没有，则编译错误；如果有，再去调用子类的同名方法。
        //多态的好处：可以使程序有良好的扩展，并可以对所有类的对象进行通用处理。
        show(new Cat());  // 以 Cat 对象调用 show 方法
        show(new Dog());  // 以 Dog 对象调用 show 方法

        Animal a = new Cat();  // 向上转型
        a.eat();               // 调用的是 Cat 的 eat
        Cat c = (Cat)a;        // 向下转型
        c.work();        // 调用的是 Cat 的 work
    }

    public static void show(Animal a)  {
        a.eat();
        // 类型判断
        if (a instanceof Cat)  {  // 猫做的事情
            Cat c = (Cat)a;
            c.work();
        } else if (a instanceof Dog) { // 狗做的事情
            Dog c = (Dog)a;
            c.work();
        }
    }
    }

class Person9 {
    protected String name;
    public String hello() {
        return "Hello, " + name;
    }
    public void run() {}
    // 继承可以允许子类覆写父类的方法。如果一个父类不允许子类对它的某个方法进行覆写，可以把该方法标记为final。用final修饰的方法不能被Override
    public final String hello2() {
        return "Hello, " + name;
    }

//    因为所有的class最终都继承自Object，而Object定义了几个重要的方法：
//    toString()：把instance输出为String；
//    equals()：判断两个instance是否逻辑相等；
//    hashCode()：计算一个instance的哈希值。
//    在必要的情况下，我们可以覆写Object的这几个方法。
    // 显示更有意义的字符串:
    @Override
    public String toString() {
        return "Person:name=" + name;
    }

    // 比较是否相等:
    @Override
    public boolean equals(Object o) {
        // 当且仅当o为Person类型:
        if (o instanceof Person9) {
            Person9 p = (Person9) o;
            // 并且name字段相同时，返回true:
            return this.name.equals(p.name);
        }
        return false;
    }

    // 计算hash:
    @Override
    public int hashCode() {
        return this.name.hashCode();
    }
}

// 如果一个类不希望任何其他类继承自它，那么可以把这个类本身标记为final。用final修饰的类不能被继承
final class Person10 {
    public void run() {}
    // 对于一个类的实例字段，同样可以用final修饰。用final修饰的字段在初始化后不能被修改。
    public final String name;
    // 实例一旦创建，其final字段就不可修改
    public Person10(String name) {
        this.name = name;
    }
}

class Student9 extends Person9 {

    // @Override // Compile error!
    // 不是Override，因为参数不同:
    public void run(String s) {}
    // 不是Override，因为返回值不同:
    // public int run() {}

    @Override
    public String hello() {
        // 调用父类的hello()方法:
        return super.hello() + "!";
    }
}

abstract class Animal {
    abstract void eat();

}

class Cat extends Animal {
    public void eat() {
        System.out.println("吃鱼");
    }
    public void work() {
        System.out.println("抓老鼠");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("吃骨头");
    }
    public void work() {
        System.out.println("看家");
    }
}
