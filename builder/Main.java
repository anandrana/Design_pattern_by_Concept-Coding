package com.progrank.builder;

public class Main {
    public static void main(String[] args) {
        Mobile mobile=new Mobile.Builder("Oneplus").setProcessor("Octa-core").setRam("8").build();

        System.out.println(mobile);

        Mobile mobile1=new Mobile.Builder("Iphone").setColor("grey").setRam("12").build();

        System.out.println(mobile1);
    }
}
