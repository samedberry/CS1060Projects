public class Test extends A {
    public static void main(String[] args) {
        Test t = new Test();
        t.print();
    }
}

class A {
    String s;

//    A(){}
//    A(String s) {
//        this.s = s;
//    }

    public void print() {
        System.out.println(s);
    }
}