package polymorphismPractise.methodloading;

public class Main {
    void method1() {
        System.out.println("method");
    }

    void method1(int a) {
        System.out.println("method2");
    }

    void method1(String s, int a) {
        System.out.println("method3");
    }

    public static void main(String[] args) {
        Main m = new Main();
        m.method1();
        m.method1(1);
        m.method1("meera", 12);

    }
}
