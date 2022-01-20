package com.ambiesoft.intelliJJavaTest.basic;

public class Main {
    public static void testFunc(int val) {
        val = 150;
        System.out.println(val);
    }
    public static void runLambda(Runnable runnable) {
        runnable.run();
    }
    public static void main(String[] args) {
        testLambda();
        testStaticClass();
    }
    public static void testLambda() {
	    System.out.println("Hello World!");
        testFunc(100);

        String msg = "Hello Lambda!";
        Runnable runner = () -> { System.out.println(msg); };
        // java: local variables referenced from a lambda expression must be final or effectively final
        // msg = "Hello Lambda ver2!";

        runLambda(runner);
    }
    public static void testStaticClass() {
        // static クラス
        Outer.StaticInner staticInner1 = new Outer.StaticInner();
        Outer.StaticInner staticInner2 = new Outer.StaticInner();

        // 厳密的なメンバクラス
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
