public class CityClass {
    // “城市”可以定义为一个类（class），而具体的城市则是实例（instance）
    public static void main(String[] args) {
        City bj = new City();
        bj.name = "Beijing";
        bj.latitude = 39.903;
        bj.longitude = 116.401;
        System.out.println(bj.name);
        System.out.println("location: " + bj.latitude + ", " + bj.longitude);
    }
}

class City {
    public String name;
    public double latitude;
    public double longitude;
}