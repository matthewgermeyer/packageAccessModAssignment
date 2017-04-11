package com.example.domain;
/**
  In Bar's constructor new the Foo instance variable and then change all of Foo's variables that Bar has access to. Call toString in the constructor.
 Notice what Bar is able to change, due to its permissions.

 */
public class Bar {
    private Foo foo;

    public Bar() {
        foo = new Foo();
        foo.publicString = "public string" + "---> Bar was here !";
        foo.protectedString = "protected string"+"--->Bar was here !";
        foo.packageString = "package string" + "--->Bar was here !";

        System.out.println(toString());
    }
    @Override
    public String toString() {
        return "Bar{" +
                "foo=" + foo +
                '}';
    }
}


