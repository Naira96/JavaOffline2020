package metods;

public class CharExample {
    void resultChar(char text[]) {
        int beginIndex = 0;
        int endIndex = text.length - 1;
        while (beginIndex < endIndex && text[beginIndex] == ' ') {
            beginIndex++;
        }
        while (beginIndex < endIndex && text[endIndex] == ' ') {
            endIndex--;
        }
        char[] result = new char[(endIndex - beginIndex) + 1];
        int index = 0;
        for (int i = beginIndex; i < endIndex + 1; i++) {
            result[index++] = text[i];
        }
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i]);
        }
    }

    void countC(char bolola[]) {
        char c = 'o';
        int count = 0;
        for (char x : bolola) {
            if (x == c)
                count++;
        }
        System.out.println("cout of " + c);
        System.out.println(count);
    }

    void lo(char bolola[]) {
        int x = bolola.length;
        System.out.print(bolola[(x / 2) - 1]);
        System.out.print(bolola[x / 2]);
        System.out.println();
    }

    void ly(char bolola[]) {
        if (bolola[bolola.length - 2] == 'l' && bolola[bolola.length - 1] == 'y') {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }

    void babola(char bolola[]) {
        boolean bobThere = false;
        for (int i = 0; i < bolola.length - 2; i++) {
            if (bolola[i] == 'b' && bolola[i + 2] == 'b') {
                bobThere = true;
            }
        }
        System.out.println(bobThere);
    }
}
