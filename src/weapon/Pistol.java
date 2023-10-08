package weapon;

import weapon.Weapon;

public class Pistol extends Weapon {
    @Override
    public void shot() {
        System.out.println("Pew-Pew!");
    }
}
