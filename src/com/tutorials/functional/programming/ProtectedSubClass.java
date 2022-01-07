package com.tutorials.functional.programming;

import com.tutorials.access.modes.ProtectedClass;

public class ProtectedSubClass extends ProtectedClass {
    public void doSomething() {
        System.out.println("Accessed protected variable of parent class from sub class : " + myProtected);

        // derived sub class cannot access base class's protected static inner class as the
        // protected inner class's constructor is by default protected.
        // change the protected inner class constructor to public and it works
        //ProtectedClass.InnerClass innerClass = new ProtectedClass.InnerClass();
    }

}
