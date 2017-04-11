package com.example.domain2;
import com.example.domain.Foo;
/*
Notice that Foo2's toString calls super.toString() in the middle.
This will directly call the toString of Foo.
Foo's toString is overriden by Foo2's.  Therefore Foo2 has a toString which calls foo's toString, which is overriden and therefore shows as Foo2's toString.


 */
public class Foo2 extends Foo {
    public Foo2() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "Foo2{"+super.toString()+"}";
    }
}
