package question25.clas;

import java.util.Random;

public class Hero extends Person {

	private int hp;
	private int mp;
	private int attack;
	private int speed;
	private int defense;

	public Hero(String name) {

		super(name);

		Random random = new Random();

		hp = random.nextInt(1000)+1;
		mp = random.nextInt(1000)+1;
		attack = random.nextInt(1000)+1;
		speed = random.nextInt(1000)+1;
		defense = random.nextInt(1000)+1;
	}
	 public int getHp() {
	        return hp;
	    }

	    public int getMp() {
	        return mp;
	    }

	    public int getAttack() {
	        return attack;
	    }

	    public int getSpeed() {
	        return speed;
	    }

	    public int getDefense() {
	        return defense;
	    }

	    public void showStatus() {
	        System.out.println("HP：" + getHp());
	        System.out.println("MP：" + getMp());
	        System.out.println("攻撃力：" + getAttack());
	        System.out.println("素早さ：" + getSpeed());
	        System.out.println("防御力：" + getDefense());
	
	}
}
