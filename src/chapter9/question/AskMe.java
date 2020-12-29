package chapter9.question;

public class AskMe implements SharedConstants {
    static void answer(int result){
        switch (result){
            case NO:
                System.out.println("net");
                break;
            case YES:
                System.out.println("da");
                break;
            case MAYBE:
                System.out.println("vozmojno");
                break;
            case LATER:
                System.out.println("pozdnee");
                break;
            case SOON:
                System.out.println("vskore");
                break;
            case NEVER:
                System.out.println("nikogda");
                break;
        }
    }

    public static void main(String[] args) {
        Question q = new Question();

        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }



}
