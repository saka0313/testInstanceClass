package jp.gr.conf_java.taksak.testInstanceClass;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	static final int MAX_HP = 50;
	int mp = 10;
	static final int MAX_MP = 10;

	public Cleric(String name, int hp, int mp) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
	}

	public Cleric(String name, int hp) {
		this(name, hp, MAX_MP);
	}

	public Cleric(String name) {
		this(name, MAX_HP);
	}

	void selfAid() {
		if (mp >= 5) {
			this.hp = Cleric.MAX_HP;
			this.mp -= 5;
			System.out.println(this.name + "は、セルフエイドの魔法を唱えた！");
			System.out.println("HPが" + this.hp + "に回復した。");
		} else {
			System.out.println("MPが足りません！");
		}
	}

	int pray(int sec) {
		int recov = new Random().nextInt(3) + sec;
		if ((recov + this.mp) > Cleric.MAX_MP) {
			recov -= (recov + this.mp) - Cleric.MAX_MP;
		}
		this.mp += recov;
		System.out.println(this.name + "は、" + sec + "秒間祈った！");
		System.out.println("MPが" + this.mp + "に回復した。");
		return recov;
	}
}
