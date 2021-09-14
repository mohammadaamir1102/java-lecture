package com.basic;

public class LambdaImpl  {

    public static void main(String[] args) {
        Lambda lambda=(a,b)->{
           return a+b;
        };
        System.out.println(lambda.show(10,10));
    }
}
