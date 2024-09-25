package polymorphismPractise.overriding;

public class overridingrule4 {
/*
4) The access level cannot be more restrictive than the overridden method’s access level.
For example: if the super class method is declared public then the over-ridding method in the sub class
cannot be either private or default or protected.*/
        void show()
        {
            System.out.println("Parent class method is having public access modifier");
        }
    overridingrule4  returnClassObject(){
            overridingrule4 rule4Test =  new overridingrule4();
                 return rule4Test;
        }
    }
     class RuleNo4Test extends overridingrule4{
    @Override
        void show() {
            System.out.println("Child class method can not have more restrictive access modifier");
        }

         public static void main(String[] args) {

         }
    }


