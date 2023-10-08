package polymorphism.weapon;

public class WaterGun extends Weapon {
    @Override
    public void shot() {
        System.out.println("Splash-Splash!");
    }
}
