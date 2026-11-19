

public class suhu {
    public static void main(String[] args) {

        int suhu = 10;

        System.out.println("Suhu: " + suhu + "°C");

        if (suhu > 27) {
            System.out.println("Terlalu Panas");
        } else if (suhu > 18 && suhu < 27) {
            System.out.println("Panas");
        }else {
            System.out.println("Dingin");
        }
    }
}
