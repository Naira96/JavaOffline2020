package metods;

public class CharExampleTest {
    public static void main(String[] args) {
        CharExample che = new CharExample();
        char[] text = {' ', ' ', 'b', 'a', 'r', ' ', 'e', 'v', ' ', ' '};
        char[] bolola = {'b', 'o', 'l', 'o', 'l', 'a'};
        char[] bolola1 = {'b', 'a', 'b', 'o', 'l', 'a'};
        che.resultChar(text);
        che.countC(bolola);
        che.lo(bolola);
        che.ly(bolola);
        che.babola(bolola1);

    }
}
