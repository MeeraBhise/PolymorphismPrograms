package polymorphismPractise.overriding;

public class MethodReturnObjectType {
        void show(){
            System.out.println("Return nothing");
        }

        int aaaa()
        {
            return 100;
        }

        MethodReturnObjectType returnObjectType(){
            MethodReturnObjectType obj = new MethodReturnObjectType();
            return obj;
        }

    public static void main(String[] args) {

    }

    }
