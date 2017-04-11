package com.example;

import com.example.domain2.Bar2;

/*
In the main method of Main new up Foo, Bar, Foo2 and Bar2.
Notice how each makes different changes to the toString based on their permissions.
 */
public class Main {

    public static void main(String[] args) {
        //Foo foo = new Foo();
	    //Bar bar= new Bar();
        //Foo2 foo2 = new Foo2();
        Bar2 bar2 = new Bar2();
    }
}
