package Inheritance;

/**
 * Created by Extr on 05.12.2016.
 */
public class InheritanceCunstructor {
    public static void main(String[] args) {
        A a = new A(6);
        System.out.println(a.a);

//        B b = new B("2");

    }
}

class A {
    int a;
    String b;

    public A() {
    }

    public A(int a) {
        this.a = a;
    }

    public A(int a, String b) {
        this.a = a;
        this.b = b;
    }
}

class B extends A {
    int x;


}
