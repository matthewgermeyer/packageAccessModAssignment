package com.example.domain2;

/**
 Bar2 should only have an empty constructor. In Bar2's constructor new the Foo and then change all of Foo's variables that Bar2 has access to.

 --At the end of the constructor call toString() and sout what toString returns.
  -> sout(toString)

 Adventure:  Change Bar2 to have an instance of Foo2 instead of Foo. Does this change anything?
 */
public class Bar2 {
    private Foo2 foo2;

    public Bar2() {
         foo2 = new Foo2();
         foo2.publicString = "public string" + "___>Bar 2 was here";

        //We do not have access to make these changes, will lead to a compiler error.
//        foo2.protectedString = "protected string"+ "___>Bar 2 was here";
//        foo2.packageString = "package string"+ "___>Bar 2 was here";
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return "Bar2{" +
                "foo2=" + foo2 +
                '}';
    }
}
