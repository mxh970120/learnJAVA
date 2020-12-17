package cn.itcast_01;

/*
 * Object:是类层次结构的根类，所有类都直接或者间接的继承自该类。
 *
 * Object类的方法：
 * public int hashCode():返回该对象的哈希码值。
 * 		哈希值不是实际的地址值，一般我们把它理解为地址值。因为它是根据地址值换算出来的一个值。
 * 		举例：401，401
 * public final Class<?> getClass():返回此 Object 的运行时类。
 * 		public String getName():返回该对象对应的类/抽象类/接口的名称。
 * public String toString():返回该对象的字符串表示。
 * 		getClass().getName() + '@' + Integer.toHexString(hashCode())
 *
 * 		Integer
 * 			public static String toHexString(int i):返回一个整数的十六进制的字符串表示形式
 *
 * 		这个方法是没有任何意义的，建议重写此方法。
 * 			A:自己手动写，但是效果不好看，所以不自己写。
 * 			B:自动生成，效果还行，推荐方式。
 *
 * public boolean equals(Object obj):比较对象是否相等
 *
 * 我们发现这个结果和我们想的不太一样，那么，这是为什么呢?
 * 这个时候，我们要想知道为什么，就必须去看源码。
 * Object类中的equals()方法的实现。
 * 看到源码是这个样子的：
 * 		 public boolean equals(Object obj) {
 *			return (this == obj);  //(s1 == s2);
 *		 }
 *
 * 面试题：
 * 		==和equals()的区别?
 * 		==:
 * 			基本类型：比较的是基本类型的值是否相同
 * 			引用类型：比较的是引用类型的地址值是否相同
 *		equals():
 *			引用类型。默认情况下，比较的是引用类型的地址是否相同。
 *
 * 一般来说，比较地址的意义不大，所以我们会重写该方法。
 * 如果重写呢?
 * 		我们重写的基本思想就是让对象比较成员变量的值是否相同。
 * 		实际开发中，我们都是自动生成。
 *
 * 字符串的比较：
 * 		字符串本身也是一个类，是引用类型。
 * 		他们的比较用的是equals()方法，字符串类重写了该方法，比较的是字符串的内容是否相同。
 *
 * protected void finalize()
 * protected Object clone()
 */
public class StudentDemo {
    // throws是异常相关，见之后
    public static void main(String[] args) {
        // hashCode方法
        Student s1 = new Student();
        System.out.println(s1.hashCode()); // 2100664515
        Student s2 = new Student();
        System.out.println(s2.hashCode()); // 1237346925
        System.out.println("------------");
//----------------------------------------------------------------------------------------------------------------------

        // getClass 方法
        Student s3 = new Student();
        Class c = s3.getClass();
        String name = c.getName();
        System.out.println(name); // cn.itcast_01.Student
        System.out.println("------------");

        Student s4 = new Student();
        // 如果你直接输出一个对象的名称，其实输出的是该对象调用的toString()方法后的字符串
        System.out.println(s4); // cn.itcast_01.Student@79f1d448
        // System.out.println(s4.toString()); // cn.itcast_01.Student@79f1d448

        // cn.itcast_01.Student@79f1d448
        // String s = s4.getClass().getName() +"@"+
        // Integer.toHexString(s4.hashCode());
        // System.out.println(s);

        Student s5 = new Student("林青霞",28);
        System.out.println(s5);
//----------------------------------------------------------------------------------------------------------------------

        // equals方法
        Student s6 = new Student("林青霞", 28);
        Student s7 = new Student("林青霞", 28);
        Student s8 = new Student("林青霞", 29);

        // System.out.println(s6 == s6);
        // System.out.println(s6 == s7);
        System.out.println(s6.equals(s6));
        System.out.println(s6.equals(s7));
        System.out.println(s6.equals(s8));

        Demo d =  new Demo();
        System.out.println(s1.equals(d)); //ClassCastException
//----------------------------------------------------------------------------------------------------------------------
    }
}

class Demo{}
