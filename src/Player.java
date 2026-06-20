public class Player {
    private String name;
    private int health;
    private Weapon equippedWeapon;
    private Armor equippedArmor;

    public Player(String name, int health) {
        this.name = name;
        this.health = health;
    }

    public void equipWeapon(Weapon newWeapon) {
        this.equippedWeapon = newWeapon;
    }

    public void equipArmor(Armor newArmor) {
        this.equippedArmor = newArmor;
    }

    public void showStatus() {
        System.out.println("--- KAHRAMAN DURUMU ---");
        System.out.println("Oyuncu: " + name + " | Can: " + health);

        if (equippedWeapon != null) {
            System.out.println("Silah: " + equippedWeapon.getName() + " (Hasar: " + equippedWeapon.getDamage() + ")");
        } else {
            System.out.println("Silah: Henüz kuşanılmadı.");
        }

        if (equippedArmor != null) {
            System.out.println("Zırh: " + equippedArmor.getName() + " (Savunma: " + equippedArmor.getDefense() + ")");
        } else {
            System.out.println("Zırh: Henüz kuşanılmadı.");
        }
        System.out.println("-----------------------");
    }
}
