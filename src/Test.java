//public class Test {
//    public static void main(String[] args) {
//        Count myCount = new Count();
//        int times = 0;
//
//        for (int i=0; i<100; i++)
//            increment (myCount, times);
//
//        System.out.println(
//                "myCount.count = " + myCount.count);
//        System.out.println("times = " + times);
//    }
//
//    public static void increment(Count c, int times) {
//        c.count++;
//        times++;
//    }
//
//}
//
//class Count {
//    int count;
//
//    Count(int c) {
//        count = c;
//    }
//
//    Count() {
//        count = 1;
//    }
//}
//
//public class Test {
//    public  static void main(String[] args) {
//        A a = new A("5");
//        a.print();
//    }
//}
//
//class A {
//    String s;
//
//    A(String s) {
//        this.s =s;
//    }
//    void print() {
//        System.out.println(s);
//    }
//}

public class Test {
    public static void main(String[] args) {
        int n = 2;
        xMethod(n);

        System.out.println("n is " + n);

    }

    void xMethod(int n) {
        n++;
    }
}