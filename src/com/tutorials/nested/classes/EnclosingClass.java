package com.tutorials.nested.classes;

import org.junit.Test;

public class EnclosingClass {

    private static int x = 2;
    private int y = 3;

    private static class StaticClass {
        private int a = 1;
        private static int b = 2;

        public void run() {
            System.out.println("Printing values of :" + x);
            // static class can only access static enclosing class varibales hence we get compilation error on y
            //System.out.println("Printing values of :" + y);

            System.out.println("Printing values of :" + a);
            System.out.println("Printing values of :" + b);
        }
    }

    private class InnerClass {
        private int c = 4;
        // We cannot declare static members in a non-static inner class
        //private static int b = 2;

        private int x = 4;

        public void run() {
            System.out.println("Printing values of :" + x);
            System.out.println("Printing values of :" + y);
            System.out.println("Printing values of :" + c);
        }

        public void shadowRun() {
            System.out.println("x = " + x);
            System.out.println("EnclosingClass.this.x = " + EnclosingClass.this.x);
        }
    }

    private void run() {
         class Local {
            private int local = 10;

            private void run() {
                System.out.println("Salute from the local class method");
            }
        }
        Local local = new Local();
        local.run();
    }


    @Test
    public void testStaticClass() {
        EnclosingClass.StaticClass staticClass = new EnclosingClass.StaticClass();
        staticClass.run();
    }

    @Test
    public void testInnerClass() {
        EnclosingClass enclosingClass = new EnclosingClass();
        EnclosingClass.InnerClass innerClass = new EnclosingClass.InnerClass();
        innerClass.run();
    }

    @Test
    public void testLocalClass() {
        EnclosingClass enclosingClass = new EnclosingClass();
        enclosingClass.run();
    }

    @Test
    public void testAnonymousClass() {
        AbstractClass abstractClass = new AbstractClass() {
            @Override
            protected void doSomething() {
                System.out.println("Greetings from Annonymous Class");
            }
        };
        abstractClass.doSomething();
    }

    @Test
    public void shadowRun() {
        EnclosingClass.InnerClass innerClass = new EnclosingClass.InnerClass();
        innerClass.shadowRun();
    }
}
