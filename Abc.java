package polymorphismPractise.overriding;

public class Abc {
    public void test()
    {
        System.out.println("test");
    }
    public void test1()
    {
        System.out.println("test1");
    }
}
class Def extends Abc {
    @Override
    public void test() {
        System.out.println("test2");
    }
    public static void main(String[] args) {
        Def g = new Def();
        g.test();
    }
}