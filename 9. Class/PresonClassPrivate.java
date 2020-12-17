public class PresonClassPrivate {
    public static void main(String[] args) {
        Person ming = new Person();
        ming.setName("Xiao Ming"); // 设置name
        ming.setAge(12); // 设置age
        System.out.println(ming.getName() + ", " + ming.getAge());
        ming.setBirth(2008);
        System.out.println(ming.getAge());

        // 可变参数例子
        Group g = new Group();
        g.setNames("Xiao Ming", "Xiao Hong", "Xiao Jun"); // 传入3个String
        g.setNames("Xiao Ming", "Xiao Hong"); // 传入2个String
        g.setNames("Xiao Ming"); // 传入1个String
        g.setNames(); // 传入0个String
    }
}

class Person {
    // 直接操作field，容易造成逻辑混乱。为了避免外部代码直接去访问field，我们可以用private修饰field，拒绝外部访问
    private String name;
    private int birth;
    private int age;

    // 所以我们需要使用方法（method）来让外部代码可以间接修改field
    public String getName() {
        // 在方法内部，可以使用一个隐含的变量this，它始终指向当前实例。因此，通过this.field就可以访问当前实例的字段。
        return this.name;
    }

    public void setName(String name) {
        if (name == null || name.isBlank()) {
            throw new IllegalArgumentException("invalid name");
        }
        this.name = name.strip(); // 去掉首尾空格
    }

    public void setBirth(int birth) {
        this.birth = birth;
    }

    // 定义private方法的理由是内部方法是可以调用private方法的。
    public int getAge() {
        return calcAge(2019); // 调用private方法
    }

    // private方法:
    private int calcAge(int currentYear) {
        return currentYear - this.birth;
    }

    // 可以对传入参数进行验证，防止非法输入
    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new IllegalArgumentException("invalid age value");
        }
        this.age = age;
    }

}

class Group {
    private String[] names;
    // 可变参数
    public void setNames(String... names) {
        this.names = names;
    }
}