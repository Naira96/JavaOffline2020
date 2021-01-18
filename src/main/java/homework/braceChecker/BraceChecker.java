package homework.braceChecker;

public class BraceChecker {
    //սա հենց տեքստն է
    private String text;

    //կլասսի կոնստրուկտորն է, որը պետք է ընդունի String տիպի տեքստ, և վերագրի վերևի տեքստին
    //Որ չկարողանանք BraceChecker-ի օբյեկտը սարքենք առանց text-տալու կոնստրուկտորի միջոցով․
    public BraceChecker(String text) {
        this.text = text;
    }

    //սա հիմնական մեթոդն է, որի մեջ գրելու ենք ամբողջ լոգիկան․ աշխատելու ենք թե stack-ի հետ, թե վերևի text-ի
    public void check() {
        Stack stack = new Stack(text.length());
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            switch (c) {
                case '{':
                case '[':
                case '(':
                    stack.push(c);
                    break;
                case '}':
                    char brace1 = stack.pop();
                    if (brace1 != '{') {
                        System.out.println("Error: opened" + brace1 + " but closed } at " + i);
                    }
                    break;
                case ']':
                    char brace2 = stack.pop();
                    if (brace2 != '[') {
                        System.out.println("Error: opened" + brace2 + " but closed ] at " + i);
                    }
                    break;
                case ')':
                    char brace3 = stack.pop();
                    if (brace3 != '(') {
                        System.out.println("Error: opened" + brace3 + " but closed ) at " + i);
                    }
                    break;
            }
        }
        for (int i = 0; i < text.length(); i++) {
            char brace = stack.pop();
            if (brace == 0) {
                System.out.println("Braces are balanced");
            } else {
                System.out.println("Opened" + brace + "but don't closed");
            }
        }

    }
}
