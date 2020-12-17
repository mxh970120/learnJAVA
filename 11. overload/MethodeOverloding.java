public class MethodeOverloding {
        public static void main(String[] args) {
            Person6 ming = new Person6();
            Person6 hong = new Person6();
            ming.setName("Xiao Ming");
            hong.setName("Xiao", "Hong");
            System.out.println(ming.getName());
            System.out.println(hong.getName());
        }
}

class Person6 {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setName(String name1, String name2) {
        this.name = name1 + ' ' + name2;
    }
}