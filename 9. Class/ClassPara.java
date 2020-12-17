public class ClassPara {
    public static void main(String[] args) {
        Person2 p = new Person2();
        int n = 15; // n的值为15
        p.setAge(n); // 传入n的值
        System.out.println(p.getAge()); // 15
        n = 20; // n的值改为20
        System.out.println(p.getAge()); // 15

        Person3 p3 = new Person3();
        String[] fullname = new String[] { "Homer", "Simpson" };
        p3.setName(fullname); // 传入fullname数组
        System.out.println(p3.getName()); // "Homer Simpson"
        fullname[0] = "Bart"; // fullname数组的第一个元素修改为"Bart"
        System.out.println(p3.getName()); // "Bart Simpson"

        Person4 p4 = new Person4();
        String bob = "Bob";
        p4.setName(bob); // 传入bob变量
        System.out.println(p4.getName()); // "Bob"
        bob = "Alice"; // bob改名为Alice
        System.out.println(p4.getName()); // "Bob"
    }
}

class Person2 {
    private int age;

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

class Person3 {
    private String[] name;

    public String getName() {
        return this.name[0] + " " + this.name[1];
    }

    public void setName(String[] name) {
        this.name = name;
    }
}

class Person4 {
    private String name;

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
