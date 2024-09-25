package polymorphismPractise.methodloading;

public class methodloadingtest {
    void method1()
    {
        System.out.println("method 123");
    }
    void method1(int a)
    {
        System.out.println("method 456");
    }
    void method1(String s)
    {
        System.out.println("method 678");
    }

    public static void main(String[] args) {
        System.out.println("main method");
        methodloadingtest m=new methodloadingtest();
        m.method1();
        m.method1(1);
        m.method1("java");
    }
}
