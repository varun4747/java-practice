package inheritance;

class p {
    public void m1(int a, int b) {
        System.out.println(a + b);
    }
    public void m2(int c, int d) {
        System.out.println(c - d);
    }
}
class c extends p {
    public void m3(int e, int f) {
        System.out.println(e * f);
    }
    public void m4(int g, int h) {
        System.out.println(g / h);
    }
}
public class InheritanceClass {
    public static void main(String[] args) {
        p incObj = new p();
        c incObj3 = new c();
        p incObj1 = new c();
        // c incObj2=new p();
        incObj1.m1(10, 20);
        incObj1.m2(20, 10);
        incObj3.m3(2, 3);
    }
}
