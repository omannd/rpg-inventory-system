public class Main {
    public static void main(String[] args) {
        Player player = new Player("Oyuncu", 100);
        Weapon weapon = new Weapon("Kılıç", 10);
        Armor armor = new Armor("Zırh", 12);

        player.equipWeapon(weapon);
        player.equipArmor(armor);
        player.showStatus();
    }
}