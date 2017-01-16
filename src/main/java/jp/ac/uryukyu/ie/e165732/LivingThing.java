package jp.ac.uryukyu.ie.e165732;

public class LivingThing {
    private String name;
    private int hitPoint;
    private int attack;
    private boolean dead;

    public LivingThing (String name, int maximumHP, int attack) {
        this.name = name;
        hitPoint = maximumHP;
        this.attack = attack;
        dead = false;
        System.out.printf("%sのHPは%d。攻撃力は%dです。\n", name, maximumHP, attack);
    }

    public boolean isDead(){
        return  dead;
    }

    public String getName(){
        return name;
    }

    public int getAttack() { return attack; }

    public void attack(LivingThing e){
        if(!dead) {
            int damage = (int) (Math.random() * attack);
            System.out.printf("%sの攻撃！%sに%dのダメージを与えた！！\n", name, e.getName(), damage);
            e.wounded(damage);
        }
    }

    public void wounded(int damage){
        hitPoint -= damage;
        if( hitPoint <= 0 ) {
            dead = true;
            System.out.printf("モンスター%sは倒れた。 \n", name);
        }
    }
    boolean getdead() { return dead; }

    public void setdead(boolean dead) { this.dead = dead; }
    int gethitPoint() { return hitPoint; }

    public void sethitPoint(int hitPoint) { this.hitPoint = hitPoint; }
}