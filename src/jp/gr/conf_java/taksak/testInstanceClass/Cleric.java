package jp.gr.conf_java.taksak.testInstanceClass;

import java.util.Random;

public class Cleric {
	String name;
	int hp = 50;
	final int MAX_HP = 50;
	int mp = 10;
	final int MAX_MP = 10;

	void selfAid() {
		if (mp >= 5) {
			this.hp = this.MAX_HP;
			this.mp -= 5;
			System.out.println(this.name + "は、セルフエイドの魔法を唱えた！");
			System.out.println("HPが" + this.hp + "に回復した。");
		} else {
			System.out.println("MPが足りません！");
		}
	}

	int pray(int sec) {
		int recov = new Random().nextInt(3) + sec;
		if ((recov + this.mp) > this.MAX_MP) {
			recov -= (recov + this.mp) - this.MAX_MP;
		}
		this.mp += recov;
		System.out.println(this.name + "は、" + sec + "秒間祈った！");
		System.out.println("MPが" + this.mp + "に回復した。");
		return recov;
	}
}
