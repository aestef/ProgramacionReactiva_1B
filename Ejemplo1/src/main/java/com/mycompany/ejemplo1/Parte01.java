package com.mycompany.ejemplo1;

import java.util.concurrent.TimeUnit;
import rx.Observable;
import rx.functions.Action1;

/**
 *
 * @author estef
 */
public class Parte01 {

    public static void main(String[] args) throws InterruptedException {

        Observable<Long> observable1 = Observable.interval(500, TimeUnit.MILLISECONDS).take(20);
        Observable<Long> observable2 = Observable.interval(200, TimeUnit.MILLISECONDS).take(20);

        Observable.merge(observable1, observable2).subscribe(new Action1<Long>() {

            @Override
            public void call(Long arg0) {

                System.out.println(arg0);

            }
        });

        Thread.sleep(20000);
    }

}
