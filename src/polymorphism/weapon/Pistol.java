package polymorphism.weapon;

public class Pistol extends Weapon {
    @Override
    public void shot() {
        System.out.println("Pew-Pew!");
    }
}
