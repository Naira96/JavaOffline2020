package chapter9;

import javax.security.auth.callback.Callback;

public class AnotherClient implements Callback {
    public void callback(int p){
        System.out.println("callback() metodi mek ayl tarberak");
        System.out.println("p v kvadrate ravno +" + (p*p));



    }
}
