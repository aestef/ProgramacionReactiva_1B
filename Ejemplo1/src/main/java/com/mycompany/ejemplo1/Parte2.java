package com.mycompany.ejemplo1;
import java.util.Arrays;
import rx.Observable;
import rx.functions.Action1;

/**
 *
 * @author 
 */
public class Parte2 {

    public static void main(String[] args) {

        Observable<String> o = Observable.from(Arrays.asList("hola", "que", "tal"));

        o.subscribe(new Action1<String>() {

            public void call(String arg0) {
                System.out.println(arg0);
            }
        });
    }
}
