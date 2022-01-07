package com.tutorials.access.modes;

import com.tutorials.functional.programming.ProtectedSubClass;

/*
Modifier	Class    Package    Subclass    World
-----------------------------------------------------
public         Y	    Y	       Y	      Y
protected      Y	    Y	       Y	      N
default        Y	    Y	       N	      N
private        Y	    N	       N	      N
*/

public class Driver {
    public static void main(String[] args) {
        DefaultClass defaultClass = new DefaultClass();
        // default property, method of a class is accessible within other class of same package.
        defaultClass.doSomething();

        ProtectedClass protectedClass = new ProtectedClass();
        System.out.println("Print protected variable from same package class : " + protectedClass.myProtected);

        // protected static inner class
        ProtectedClass.InnerClass innerClass = new ProtectedClass.InnerClass();

        ProtectedSubClass protectedSubClass = new ProtectedSubClass();
        protectedSubClass.doSomething();
    }
}
