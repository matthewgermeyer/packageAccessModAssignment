package com.example.domain;

public class Foo {
    public String publicString = "public";
    protected String protectedString = "protected";
    String packageString = "package";
    private String privateString = "private!";

    public Foo() {
        System.out.println("In Foo constructor " + this.toString());
    }

    //toString

    @Override
    public String toString() {
        return "Foo{" +
                "publicString='" + publicString + '\'' +
                ", protectedString='" + protectedString + '\'' +
                ", packageString='" + packageString + '\'' +
                ", privateString='" + privateString + '\'' +
                '}';
    }
}
