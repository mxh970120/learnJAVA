public class extendClass {
    public static void main(String[] args) {
        Student8 s = new Student8("Xiao Ming", 12, 89);

        Person7 p1 = new Student(); // upcasting, ok
        Person7 p2 = new Person7();
        Student s1 = (Student) p1; // ok
        // Student s2 = (Student) p2; // runtime error! ClassCastException!
    }
}

class Person7 {
    // 为了让子类可以访问父类的字段，我们需要把private改为protected。用protected修饰的字段可以被子类访问
    protected String name;
    protected int age;
}

class Student extends Person7 {
    public String hello() {
        return "Hello, " + name; // OK!
    }
    // super关键字表示父类（超类）。子类引用父类的字段时，可以用super.fieldName
    public String hello2() {
        return "Hello, " + super.name;
    }
}

class Person8 {
    protected String name;
    protected int age;

    public Person8(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

class Student8 extends Person8 {
    protected int score;

    public Student8(String name, int age, int score) {
        // 因为在Java中，任何class的构造方法，第一行语句必须是调用父类的构造方法。
        // 如果没有明确地调用父类的构造方法，编译器会帮我们自动加一句super()
        // 如果父类没有无参数的构造方法，则编译失败
        super(name, age); // 调用父类的构造方法Person(String, int)
        this.score = score;
    }
}
