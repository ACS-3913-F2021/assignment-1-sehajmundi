/**
 * From Head First Design Patterns, Freeman & Robson
 */

public class MiniDuckSimulator {

    public static void main(String[] args) {

        MallardDuck mallard = new MallardDuck();
        RubberDuck  rubberDuckie = new RubberDuck();
        DecoyDuck   decoy = new DecoyDuck();
        Duck m = new MechaDuck();

        mallard.performQuack();
        rubberDuckie.performQuack();
        decoy.performQuack();

        System.out.println("---------------------");

        mallard.performFly(); 
        mallard.setFlyBehavior(new FlyNoWay()); // duck gets injured :(
        mallard.performFly();
        
        System.out.println("---------------------");
        
        m.performFly();
        m.setFlyBehavior(new FlyWithWings());
        m.performFly();
        m.performQuack();
        m.setQuackBehavior(new Squeak());
        m.performQuack();

    }

}
