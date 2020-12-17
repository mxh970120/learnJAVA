public class commandInput {
    public static void main(String[] args) {
        // main函数，命令行输入为string时，有返回值
        for (String arg : args) {
            if ("-version".equals(arg)) {
                System.out.println("v 1.0");
                break;
            }
        }
    }
}
