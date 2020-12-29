package chapter5;

public class StringSwitch {
    public static void main(String[] args) {
        String str = "два";
        switch (str) {
            case "один":
                System.out.println("odin");
                break;
            case "два":
                System.out.println("dva");
                break;
            case "три":
                System.out.println("tri");
                break;
            default:
                System.out.println("нe совпало");
                break;
        }
    }
}
