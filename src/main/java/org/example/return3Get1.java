package org.example;

import java.util.Scanner;

public class return3Get1 {
    public static void main(String[] args) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println(totalBottleCount(n));
    }
    static int totalBottleCount(int n){
        int res;
        if(n>=3){
            res =n+ (n / 3);
            return res;
        }

        return totalBottleCount(n%3);
    }
}
