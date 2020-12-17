/*
	班级编号应该是被班级每个人都共享的，所以定义一个就应该可以了。
	而姓名和年龄，每个人应该是不一样的，所以，每个对象，都应该定义自己的。

	在java中，用什么来表示成员变量是被共享的呢? static
*/
class StudentDemo {
	public static void main(String[] args) {
		//创建学生对象
		Student s1 = new Student("林青霞",28,"20150306");
		s1.show();

		/*
		Student s2 = new Student("马云",35,"20150306");
		s2.show();

		Student s3 = new Student("马化腾",33,"20150306");
		s3.show();
		*/
		Student s2 = new Student("马云",35);
		s2.show();

		Student s3 = new Student("马化腾",33);
		s3.show();
		
		// 调用实例方法必须通过一个实例变量，而调用静态方法则不需要实例变量，通过类名就可以调用。静态方法类似其它编程语言的函数。
		Student.setNumber(99);
        System.out.println(Student.number);
		
	}
}

class Student {
	//姓名
	String name;
	//年龄
	int age;
	//班级编号
	//String classNumber;
	static String classNumber;
	public static int number;

	public Student(String name,int age) {
		this.name = name;
		this.age = age;
	}

	public Student(String name,int age,String classNumber) {
		this.name = name;
		this.age = age;
		this.classNumber = classNumber;
	}

	public void show() {
		System.out.println(name+"---"+age+"---"+classNumber);
	}
	
	// 调用实例方法必须通过一个实例变量，而调用静态方法则不需要实例变量，通过类名就可以调用。静态方法类似其它编程语言的函数。
	public static void setNumber(int value) {
        number = value;
    }	
}

// 因为interface是一个纯抽象类，所以它不能定义实例字段。但是，interface是可以有静态字段的，并且静态字段必须为final类型
interface Person {
    public static final int MALE = 1;
    public static final int FEMALE = 2;
	// 实际上，因为interface的字段只能是public static final类型，所以我们可以把这些修饰符都去掉，上述代码可以简写为
	// 编译器会自动加上public statc final:
    int MALE2 = 1;
    int FEMALE2 = 2;
}