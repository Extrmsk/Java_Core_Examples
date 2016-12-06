package InnerClasses;

/**
 * Created by Extr on 05.12.2016.
 */
public class InnerDemoClass {
    public static void main(String[] args) {
        Outer outer = new Outer();
        outer.test();
        System.out.println("-------");
        outer.testLocalInner();
        System.out.println("-------");
        Outer.Inner inner = new Outer().new Inner();
        inner.display();
    }

}

class Outer {
    int outerVar = 10;

    void test() {
        Inner inner = new Inner();
        inner.display();
    }
//    Forbidden!
//    void getInnerVar() {
//        System.out.println(innerVar);
//    }

    class Inner {
        int innerVar = 20;

        void display() {
            System.out.println("Inner dsplay() outerVar=" + outerVar);
        }
    }

    void testLocalInner() {
        for (int i=0; i<3; i++) {
            //local inner class
            class LocalInner {
                void display() {
                    System.out.println("LocalInner display() outerVar=" + outerVar);
                }
            }

            LocalInner localInner = new LocalInner();
            localInner.display();

        }
    }
}
