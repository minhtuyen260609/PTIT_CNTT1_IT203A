import java.util.ArrayList;

interface ISkill {
    void useUltimate(GameCharacter target);
}

abstract class GameCharacter {

    protected String name;
    protected int hp;
    protected int attackPower;
    protected static int count = 0;

    public GameCharacter(String name, int hp, int attackPower) {
        this.name = name;
        this.hp = hp;
        this.attackPower = attackPower;
        count++;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public static int getCount() {
        return count;
    }

    public abstract void attack(GameCharacter target);

    public void takeDamage(int amount) {
        hp -= amount;
        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " da bi ha guc");
        }
    }

    public void displayInfo() {
        System.out.println("Ten: " + name + " | HP: " + hp);
    }
}

class Warrior extends GameCharacter implements ISkill {

    private int armor;

    public Warrior(String name, int hp, int attackPower, int armor) {
        super(name, hp, attackPower);
        this.armor = armor;
    }

    @Override
    public void attack(GameCharacter target) {
        System.out.println("[Chien binh] " + name + " tan cong " + target.getName());
        target.takeDamage(attackPower);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        System.out.println("[Chien binh] " + name + " dung Dam ngan can len " + target.getName());
        int damage = attackPower * 2;
        target.takeDamage(damage);

        int selfDamage = (int) (hp * 0.1);
        hp -= selfDamage;
        System.out.println(name + " mat " + selfDamage + " HP do gang suc");
    }

    @Override
    public void takeDamage(int amount) {
        int realDamage = amount - armor;
        if (realDamage < 0) realDamage = 0;
        hp -= realDamage;

        System.out.println("-> " + name + " mat " + realDamage + " mau. HP con: " + hp);

        if (hp <= 0) {
            hp = 0;
            System.out.println(name + " da bi ha guc");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Ten: " + name + " | HP: " + hp + " | Giap: " + armor);
    }
}

class Mage extends GameCharacter implements ISkill {

    private int mana;

    public Mage(String name, int hp, int attackPower, int mana) {
        super(name, hp, attackPower);
        this.mana = mana;
    }

    @Override
    public void attack(GameCharacter target) {
        int damage = attackPower;

        if (mana >= 5) {
            mana -= 5;
        } else {
            damage = attackPower / 2;
        }

        System.out.println("[Phap su] " + name + " tan cong " + target.getName());
        target.takeDamage(damage);
    }

    @Override
    public void useUltimate(GameCharacter target) {
        if (mana >= 50) {
            mana -= 50;
            int damage = attackPower * 3;
            System.out.println("[Phap su] " + name + " dung Hoa cau len " + target.getName());
            target.takeDamage(damage);
            System.out.println(name + " ton 50 mana. Mana con: " + mana);
        } else {
            System.out.println(name + " khong du mana de dung chieu cuoi");
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("Ten: " + name + " | HP: " + hp + " | Mana: " + mana);
    }
}

public class ThucHanh {
    public static void main(String[] args) {

        System.out.println("=== ARENA OF HEROES ===");

        ArrayList<GameCharacter> list = new ArrayList<>();

        Warrior yasuo = new Warrior("Yasuo", 500, 50, 20);
        Mage veigar = new Mage("Veigar", 300, 40, 200);

        GameCharacter goblin = new GameCharacter("Goblin", 100, 10) {
            @Override
            public void attack(GameCharacter target) {
                System.out.println("[Quai vat] Goblin tan cong!");
                System.out.println("Goblin can trom " + target.getName());
                target.takeDamage(10);
            }
        };

        list.add(yasuo);
        list.add(veigar);
        list.add(goblin);

        System.out.println("Da khoi tao " + GameCharacter.getCount() + " nhan vat tham gia dau truong\n");

        yasuo.attack(goblin);
        veigar.useUltimate(yasuo);
        goblin.attack(veigar);

        System.out.println("\n=== THONG SO SAU LUOT DAU ===");
        yasuo.displayInfo();
        veigar.displayInfo();
        goblin.displayInfo();
    }
}