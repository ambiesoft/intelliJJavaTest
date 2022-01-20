package com.ambiesoft.intelliJJavaTest.basic;
// Sample.java
public class Sample
{
    // staticメソッド。
    public static void main( String[] args )
    {
        // StaticClassを作ります。
        StaticClass staticClass = new StaticClass();
        // あとは普通に使えます。
        staticClass.output();
        // StaticClass#output()

        // 非staticクラスは同じようには作れません。
        // NonStaticClass nonStaticClass = new NonStaticClass();
        // コンパイルエラー：
        // 型 Sample のエンクロージング・インスタンスを持つ割り振りを明示的に指定する必要があります。(例 x.new A() で、x が Sample のインスタンス)

        // 非staticメソッドからも使えます。
        Sample sample = new Sample();
        sample.useStaticClass();
    }

    /**
     *   StaticClassクラスを使うメソッド（非staticメソッド）。
     */
    private void useStaticClass()
    {
        // StaticClassを作ります。
        StaticClass staticClass = new StaticClass();
        // あとは普通に使えます。
        staticClass.output();
        // StaticClass#output()

        // ちなみに非staticメソッドからなら
        // 非staticクラスも使えます。
        NonStaticClass nonStaticClass = new NonStaticClass();
        nonStaticClass.output();
        // StaticClass#output()
    }

    /**
     *   staticクラス。
     */
    static class StaticClass
    {
        public void output()
        {
            System.out.println( "StaticClass#output()" );
        }
    }

    /**
     *   非staticクラス。
     */
    class NonStaticClass
    {
        public void output()
        {
            System.out.println( "StaticClass#output()" );
        }
    }
}

// グローバルなstaticクラスは作れません。
// static class StaticClass{}
// コンパイルエラー：
//クラス StaticClass の無許可の修飾子 ; public、abstract、および final のみ許可されています。