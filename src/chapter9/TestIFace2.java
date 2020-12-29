package chapter9;

import javax.security.auth.callback.Callback;

public class TestIFace2 {
    public static void main(String[] args) {
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();

        c.callback(42);

         c.callback(42);
    }
}
