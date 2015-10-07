package jp.gr.conf_java.taksak.testInstanceClass;

public class Hero {
	String name;
	int hp;
	Sword sword;
	static int money;

	Hero(String name) {
		this.hp = 100;
		this.name = name;
	}

	Hero() {
		this("ダミー");
	}

	static void setRandomMoney() {
		Hero.money = (int) (Math.random() * 1000);
	}

	void bye() {
		System.out.println("勇者は別れを告げた");
	}

	void die() {
		System.out.println(this.name + "は死んでしまった！");
		System.out.println("GAME OVERです。");
	}

	void atack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5ポイントのダメージをあたえた！");
	}

	void atack(Matango m) {
		System.out.println(this.name + "の攻撃！");
		this.hp -= 2;
		System.out.println("お化けキノコ" + m.suffix + "から2ポイントの反撃を受けた");
		if (this.hp <= 0) {
			this.die();
		}
	}

	void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}

	void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが" + sec + "ポイント回復した。");
	}

	void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ！");
	}

	void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAMEOVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
}
