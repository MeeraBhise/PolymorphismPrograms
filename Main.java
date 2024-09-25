package polymorphismPractise.overriding;

public class Main extends mainn{
   @Override
    void method1()
   {
       System.out.println("abcd");
   }
   @Override
   void method2()
   {
       System.out.println("mncv" );
   }
    public static void main(String[] args) {
        Main m=new Main();
        m.method1();
        m.method2();
    }
}
