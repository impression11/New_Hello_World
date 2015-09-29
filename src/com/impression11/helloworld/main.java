package com.impression11.helloworld;

import java.util.Scanner;

/**
 * Created by Ethan on 28/09/15.
 */
public class main {

    public static void main(String[] args) {

        int hello = 55;
        hello++;
        String jello = "hello there";
        System.out.println(hello);

        Scanner sc = new Scanner(System.in);
        //nextInt for numbers
        //next for string
        //rememeber to show it breaking for wrong input types!
        int hello2 = sc.nextInt();
        System.out.println(hello2);



    }
}
