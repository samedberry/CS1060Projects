package CS1061Exam2;

import java.util.*;

public class ExamTest {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add("A");
            list.add("B");
            list.add("C");
            list.add("D");
            for (int i = 0; i < list.size(); i++)
                System.out.println(list.remove(i));
        }
}

class A {
    int r =1;

    public String toString() {
        return r + "";
    }

    public boolean equals(Object o) {
        return this.r == ((A)o).r;
    }
}