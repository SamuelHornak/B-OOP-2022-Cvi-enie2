package sk.stuba.fei.uim.oop;


import org.jetbrains.annotations.NotNull;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int x = 5;
        int[] y = new int[]{1, 2, 3};

        //komentare

        System.out.println(x);
        testPrimitive(x);
        System.out.println(x);

        System.out.println(Arrays.toString(y));
        testArray(y);
        System.out.println(Arrays.toString(y));


        testArraySpread(new int[]{1, 2, 3});

    }

    /**
     * Táto funkcia vypisuje cislo
     * @param cislo -integer cislo
     */
    public static void testPrimitive(int cislo) {
        cislo = 10;
        System.out.println(cislo);
    }

    public static void testArray(int[] array) {
        array[0] = 10;
        System.out.println(Arrays.toString(array));
    }

    public static void testArraySpread(int... array) {
        System.out.println("text");
        System.out.println(Arrays.toString(array));
    }
}
