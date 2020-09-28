package com.rizkykhapidsyah;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class MainProgram {
    public static void main(String[] args) {
        Set set = new HashSet();

        set.add("Elemen 1");
        set.add("Elemen 2");
        set.add("Elemen 3");

        /* Tes Duplikasi */
        set.add("Elemen 1");
        set.add("Elemen 3");

        Iterator i = set.iterator();

        while (i.hasNext()) {
            String s = (String) i.next();
            System.out.println(s);
        }

        Boolean hapus = set.remove("Elemen 2");
        System.out.println("Data Element 2 Dihapus, Status = " + hapus);
    }
}
