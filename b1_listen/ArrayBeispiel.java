package b1_listen;

public class ArrayBeispiel {
    public static void main(String[] args) {
        String[] namen = new String[3];
        namen[0] = "Hans";
        namen[1] = "Peter";
        namen[2] = "Klaus";

        for (String name : namen) {
            System.out.println(name);
        }
    }
}