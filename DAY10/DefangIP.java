public class DefangIP {
    public static void main(String[] args) {

        String address = "192.168.1.1";

        System.out.println(address.replace(".", "[.]"));
    }
}