package org.example;

import java.util.Scanner;
import java.util.function.Function;

public class return3Get1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(returnPepsirBotol.apply(n));
    }

    static Function<Integer, Integer> returnPepsirBotol = pepsirBotol -> {
        Integer output = pepsirBotol;
        int initialOutput = pepsirBotol / 3;
        if (initialOutput>=1)
            output += initialOutput;
        while (initialOutput >= 3) {
            pepsirBotol = initialOutput;
            initialOutput = pepsirBotol/3;
            output += initialOutput;

        }
        return output;
    };
}
