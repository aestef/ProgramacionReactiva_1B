package com.mycompany.ejemplo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author
 */
public class Parte1 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<String>(Arrays.asList("hola", "que", "tal"));
        Iterator<String> i = lista.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());

        }
    }

}
