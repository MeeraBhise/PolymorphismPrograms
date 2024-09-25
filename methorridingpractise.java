package polymorphismPractise.overriding;

/*
3) Return type must be same for both parent and child class methods.   -> Primitive data types

3) The return type should be the same or a subtype of the return type declared in the original
overridden method in the super class. Covariant return types. -> Object
*/

    class  methorridingpractise {
        methorridingpractise  parentReturn(){
            methorridingpractise  p =  new  methorridingpractise ();
            return p;
        }
        methorridingpractise  returnParentObject(){
            methorridingpractise  pp =  new  methorridingpractise ();
            return pp;
        }
    }
    class Child extends  methorridingpractise {
        @Override
        methorridingpractise  parentReturn() {
            return new  methorridingpractise ().returnParentObject();
        }
        @Override
        Child returnParentObject() {
            Child ppp = new Child();
            return ppp;
        }
    }
    class CovariantReturnType {
        public static void main(String[] args) {
            Child child = new Child();
            Child ch = child.returnParentObject();
            ch.returnParentObject();
            ch.parentReturn();
        }
    }
