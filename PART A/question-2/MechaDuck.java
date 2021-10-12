
/**
 * Write a description of class MechaDuck here.
 * MechaDuck
 * @author Sehaj Mundi
 * 3117464
 */
public class MechaDuck extends Duck
{
    public MechaDuck() {
        flyBehavior = new teleport();
        quackBehavior = new roboQuack();
    }

    public void display() {
        System.out.println("I'm a real Mecha duck");
    }
}
