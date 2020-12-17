public class constructor {
    public static void main(String[] args) {
        Person5 p = new Person5("Xiao Ming", 15);
        System.out.println(p.getName());
        System.out.println(p.getAge());
    }
}

class Person5 {
    private String name;
    private int age;

    // 由于构造方法是如此特殊，所以构造方法的名称就是类名。构造方法的参数没有限制，在方法内部，也可以编写任意语句。
    // 但是，和普通方法相比，构造方法没有返回值（也没有void），调用构造方法，必须用new操作符。
    public Person5(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // 多构造方法
    public Person5(String name) {
        this.name = name;
        this.age = 12;
    }

    public Person5() {
    }
    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }
}
