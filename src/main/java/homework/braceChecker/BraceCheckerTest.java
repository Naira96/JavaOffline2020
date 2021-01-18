package homework.braceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String text = "H]el}lo (from) [Java}";
        BraceChecker braceChecker = new BraceChecker(text);
       braceChecker.check();
    }

}
